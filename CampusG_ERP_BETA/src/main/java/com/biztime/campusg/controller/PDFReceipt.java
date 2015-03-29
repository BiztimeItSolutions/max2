package com.biztime.campusg.controller;

import java.net.URL;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biztime.campusg.model.StudentFee;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFReceipt extends AbstractITextPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document doc,
			PdfWriter writer, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// get data model which is passed by the Spring container
		//List<Book> listBooks = (List<Book>) model.get("listBooks");
	/*	Book book=(Book) model.get("bookInfo");
		
		String bAuthor=null;
		String bDate=null;
		String bTitle=null;
		//for(Book aBook:book){
			bAuthor=book.getAuthor();
			bDate=book.getPublishedDate();
			bTitle=book.getTitle();*/
			
		String bAuthor=null;
		String bDate=null;
		String bTitle=null;
		
		StudentFee studentfee=(StudentFee) model.get("fee");
		int id=studentfee.getCandidate_id();
		
		String feeName=studentfee.getFeeName();
		System.out.println("feeName"+feeName);
		
		String receiptName=studentfee.getReceiptName();
		System.out.println("receiptName"+receiptName);
		
		String paymentName=studentfee.getPaymentName();
		System.out.println("paymentName"+paymentName);
		
		int amount=studentfee.getAmount();
		System.out.println("amount"+amount);
		
		
	 
		String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
		//To Add Image from source
	    	//Image image1 = Image.getInstance("temp.jpg");
	    Image image = Image.getInstance(new URL(imageUrl));
	  //Fixed Positioning
	    image.setAbsolutePosition(16f, 650f);
	    //Scale to new height and new width of image
	    image.scaleAbsolute(140, 140);
	    //add the image to document
	    doc.add(image);
	    
	  
	    
	    //to add border
	    PdfContentByte canvas = writer.getDirectContent();
        Rectangle rect = new Rectangle(36, 36, 559, 806);
        rect.setBorder(Rectangle.BOX);
        rect.setBorderWidth(2);
        canvas.rectangle(rect);
        
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
		
		Font applicationFont = FontFactory.getFont("Verdana", 12, Font.BOLD);
		String applicationFor="Receipt \n for the year 201 -201 \n";
		Chunk applicationForChunk=new Chunk(applicationFor,applicationFont);
		paragraph.add(applicationForChunk);
		
		Paragraph indentPara=new Paragraph();
		Font registrationFont = FontFactory.getFont("Verdana", 10);
		String registrationString="Registration No:\n";
		Chunk registrationChunk=new Chunk(registrationString,registrationFont);
		indentPara.add(registrationChunk);
		indentPara.setIndentationLeft(390);
		
		paragraph.add(indentPara);
		doc.add(paragraph);
		
		PdfPTable table = new PdfPTable(2);
		table.setWidthPercentage(96.0f);
		table.setWidths(new float[] {2.5f, 2.5f});
		table.setSpacingBefore(10);
		
		// define font for table header row
		Font font = FontFactory.getFont(FontFactory.HELVETICA);
		font.setColor(BaseColor.BLACK);
		
		Font font1=FontFactory.getFont("Stencil", 16, Font.ITALIC);
		font1.setColor(BaseColor.ORANGE);
		
		// define table header cell
		PdfPCell cell = new PdfPCell();
		cell.setBackgroundColor(BaseColor.WHITE);
		cell.setPadding(5);
		
		// write table header 
		cell.setPhrase(new Phrase("Candidate Id", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase(id));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Fee", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase(feeName, font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Student Fee ID ", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Receipt Book", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase(receiptName, font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Mode Of Payment", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase(paymentName, font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Amount", font));
		table.addCell(cell);
        
		cell.setPhrase(new Phrase(amount));
		table.addCell(cell);
		
		
		
		doc.add(table);
		
		
		
	}

}
