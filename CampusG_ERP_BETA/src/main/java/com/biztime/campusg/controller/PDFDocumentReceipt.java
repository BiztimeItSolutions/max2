package com.biztime.campusg.controller;

import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biztime.campusg.model.Candidate;
import com.biztime.campusg.model.StudentFee;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFDocumentReceipt extends AbstractITextPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		StudentFee studentfee=(StudentFee) model.get("docs");
		Candidate candidate=(Candidate)model.get("candidate");
		int id=studentfee.getCandidate_id();
		String candidateName=candidate.getFirstname()+candidate.getLastname();
		String candidateDept=candidate.getDepartment();
		String documentName=studentfee.getDocumentName();
		
		//heading
		Paragraph paragraph=new Paragraph();
		Chunk chunk=new Chunk();
		String content="KARNATAKA STATE MUSLIM FEDERATION (REGD)\n";
		chunk.append(content);
		
		paragraph.add(chunk);
		doc.add(Chunk.NEWLINE);
		
		paragraph.setAlignment(1);
		
		Font fontbold = FontFactory.getFont("Verdana", 20, Font.BOLD);
		String nameOfCollege="HKBK COLLEGE OF ENGINEERING \n";
		Chunk nameOfCollegeChunk= new Chunk(nameOfCollege, fontbold);
		paragraph.add(nameOfCollegeChunk);
		
		String approval="(Approved by AICTE, affiliated to VTU)\n";
		Chunk approvalChunk=new Chunk(approval);
		paragraph.add(approvalChunk);
		String address="22/1,Nagawara,A.C. Post, Bangalore- 560 045 \n";
		Chunk addressChunk=new Chunk(address);
		paragraph.add(addressChunk);
		
		String newLine="\n \n \n";
		Chunk newLineChunk=new Chunk(newLine);
		paragraph.add(newLineChunk);
		
		//image
		String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
		//To Add Image from source
	    	//Image image1 = Image.getInstance("temp.jpg");
	    Image image = Image.getInstance(new URL(imageUrl));
	    //Fixed Positioning
	    image.setAbsolutePosition(16f, 680f);
	    //Scale to new height and new width of image
	    image.scaleAbsolute(140, 140);
	    //add the image to document
	    doc.add(image);
		
	    //paragraph for candidate details
		Paragraph candPara=new Paragraph();
		Chunk candNamechunk=new Chunk(candidateName);
		candPara.add(candNamechunk);
		candPara.add(newLineChunk);
		Chunk candDeptchunk=new Chunk(candidateDept);
		candPara.add(candDeptchunk);
		
		//add paragraphs to the document
		doc.add(paragraph);
		doc.add(candPara);
		
		//list of documents against candidate
		System.out.println("documents are: "+documentName);
		String[] splitDocumentName=documentName.split(",");
		List docList=new List(true,20);
		for(String s :splitDocumentName){
			System.out.println("the array contains: "+s);
			docList.add(new ListItem(s));
		}
		
		doc.add(docList);
		
		
		
	}

}
