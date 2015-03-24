package com.biztime.campusg.controller;

import java.net.URL;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biztime.campusg.model.Candidate;
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

/**
 * This view class generates a PDF document 'on the fly' based on the data
 * contained in the model.
 * @author www.codejava.net
 *
 */
public class PDFBuilder extends AbstractITextPdfView {

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
		
		Candidate cand=(Candidate) model.get("p");
		int id=cand.getCandidate_id();
		String fname=null;
		fname=cand.getFirstname();
		System.out.println("fname:"+fname);
		
		
		String mname=cand.getMiddlename();
		String lname=cand.getLastname();
		
		//String name=fname"+"mname"+"lname;
		
			//continue;
		//}
	 
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
	    
	   //create area for photo
//	    Image image2 = Image.getInstance(new URL(imageUrl));
//	    image2.setAbsolutePosition(41f, 650f);
//	    //Scale to new height and new width of image
//	    image.scaleAbsolute(10, 10);
//	    
//	    doc.add(image2);
	    
	 
	    
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
		String applicationFor="Application for Admission to First Year B.E. \n for the year 201 -201 \n";
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
		cell.setPhrase(new Phrase("1. Name of tye Applicant in full(In Block Letters)\n (as in the marks card of the qualifying examination)", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase(fname+" , "+mname+","+lname, font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("2. a) Nationality\n  b)Religion & Caste", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("3. a) Place of Birth/City \n b) State", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("4. Date Of Birth as per English Calender\n  (Enclose proof of age-SSLC/10th Certificate)", font));
		table.addCell(cell);

		cell.setPhrase(new Phrase(bDate, font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("5. Name of the Parent/Guardian with relationship\n(if parent is not alive)\n(in BLOCK Letters)", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Father's Name:"+bTitle+"\n Profession: \n Tel: (Res): \n Tel:(off) : \n Mobile: \n "
				+ "Email: \n Mother's Name: \n Profession: \n Tel: (Res): \n Tel:(Off)\n Mobile: ", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("6. Postal Address ", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("Present: \n \n\n Permanent: ", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("7. Annual Income of \n Parent/Guardian (if Parents are not alive)", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("8. Last college/School attended with dates of \n entering and leaving the institution\n"
				+ "b) Name of the Board/University last Studied,with\n dates of entering and leaving the Board/University", font));
		table.addCell(cell);
		
		cell.setPhrase(new Phrase("", font));
		table.addCell(cell);
		
		doc.add(table);
		
		doc.newPage();//new page
		
		//Border for new page
		PdfContentByte canvas2 = writer.getDirectContent();
        Rectangle rect2 = new Rectangle(36, 36, 559, 806);
        rect2.setBorder(Rectangle.BOX);
        rect2.setBorderWidth(2);
        canvas2.rectangle(rect2);
        
        String newLine1="\n";
		Chunk newLineChunk1=new Chunk(newLine1);
		Paragraph paragraph2=new Paragraph();
		paragraph2.add(newLineChunk1);
		
		PdfPTable table2 = new PdfPTable(8);
		table2.setWidthPercentage(96.0f);
		table2.setWidths(new float[] {0.4f, 0.4f,0.4f,0.4f,0.9f,0.3f,0.4f,0.3f});
		table2.setSpacingBefore(20);
		
		Font font2 = FontFactory.getFont(FontFactory.HELVETICA,11);
		font.setColor(BaseColor.BLACK);
		
		PdfPCell cell2 = new PdfPCell();
		cell2.setBackgroundColor(BaseColor.WHITE);
		cell2.setPadding(6);
		
		cell=new PdfPCell(new Phrase("9. Details of qualifying examination passed", font2));
		cell.setColspan(8);
		table2.addCell(cell);
		
		 	cell = new PdfPCell(new Phrase("Examination", font2));
	        cell.setRowspan(2);
	        table2.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("Name of the University", font2));
	        cell.setRowspan(2);
	        table2.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("No. of attempts", font2));
	        cell.setRowspan(2);
	        table2.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("Year of passing", font2));
	        cell.setRowspan(2);
	        table2.addCell(cell);
	        
	        
	        cell = new PdfPCell(new Phrase("Optional subjects studied", font2));
	        cell.setRowspan(2);
	        table2.addCell(cell);
	        
	        
	        cell = new PdfPCell(new Phrase("Marks obtained in Subjects", font2));
	        cell.setColspan(3);
	        table2.addCell(cell);
	        
	        table2.addCell("Max Marks");
	        table2.addCell("Marks Obtained");
			table2.addCell("Percentage");

	        
	        cell=new PdfPCell(new Phrase(" "));
	        cell.setRowspan(4);
	        table2.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase(" "));
	        cell.setRowspan(4);
	        table2.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase(" "));
	        cell.setRowspan(4);
	        table2.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase(" "));
	        cell.setRowspan(4);
	        table2.addCell(cell);
	        
	        table2.addCell("Physics");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        
	        table2.addCell("Mathematics");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        
	        
	        table2.addCell("Chemistry/\nBio-Technology\nComputer Science/\nElectronics/Biology");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        table2.addCell(" ");
	        
	        
	        table2.addCell("Average Percentage");
	        cell = new PdfPCell(new Phrase(" "));
	        cell.setColspan(3);
	        table2.addCell(cell);
	        
	        PdfPTable table3 = new PdfPTable(5);
			table3.setWidthPercentage(96.0f);
			table3.setWidths(new float[] {0.2f, 0.5f,1.0f,0.4f,0.8f});
			table3.setSpacingBefore(10);
	        
	        cell = new PdfPCell(new Phrase("10. Institutions at which applicant studied during the last five years(Reasons of break in"
	        		+ " continuity may be stated in the remarks column commencing from VIII standard to XII Standard)"));
	        cell.setColspan(5);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        table3.addCell(cell);
	       
	        cell = new PdfPCell(new Phrase("Year", font2));
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("Institution", font2));
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("class", font2));
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase("Remarks", font2));
	        table3.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase("1",font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
		
	        cell=new PdfPCell(new Phrase("2",font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase("3",font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase("4",font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell=new PdfPCell(new Phrase("5",font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
	        
	        cell = new PdfPCell(new Phrase(" ", font2));
	        cell.setFixedHeight(60f);
	        table3.addCell(cell);
		
		doc.add(paragraph2);
		doc.add(table2);
		doc.add(table3);
				
		//new page
		
		doc.newPage();
		
		//Border for new page
		PdfContentByte canvas3 = writer.getDirectContent();
        Rectangle rect3 = new Rectangle(36, 36, 559, 806);
        rect3.setBorder(Rectangle.BOX);
        rect3.setBorderWidth(2);
        canvas3.rectangle(rect3);
        
        Font medicalHeaderFont = FontFactory.getFont("Verdana", 15, Font.BOLD);
        Paragraph medicalHeaderPara=new Paragraph();
        String medicalHeader="\nMEDICAL CERTIFICATE\n";
		Chunk medicalChunk=new Chunk(medicalHeader,medicalHeaderFont);
		
		medicalHeaderPara.add(medicalChunk);
		medicalHeaderPara.setAlignment(1);
		doc.add(medicalHeaderPara);
		
		 String newLine2="\n";
			Chunk newLineChunk2=new Chunk(newLine2);
			Paragraph paraNewLine=new Paragraph(newLineChunk2);
			doc.add(paraNewLine);
        
		String medicalContent="  1.I do hereby certify that I have examined Sri/Kumari.....................................................................\n"
				+ "    a candidate seeking admission to B.E degree course in the H.K.B.K College of Engineering,\n"
				+ "    Bangalore.\n"
				+ "    i)   Height ...................................                                          iv) Eye Sight................................\n"
				+ "    ii)  Weight .................................                                                Power of glasses, if used\n"
				+ "    iii) Blood Group...........................                                              ................................................\n";
		
		Chunk medicalContentChunk=new Chunk(medicalContent);
		Paragraph medicalContentPara=new Paragraph();
		medicalContentPara.add(medicalContentChunk);
//		medicalContentPara.setAlignment(3);
		
		String secondChunkContent="  2.I find him/her to be healthy and fit to take admission in Engineering Course.\n";
		Chunk secondChunk=new Chunk(secondChunkContent);
		medicalContentPara.add(secondChunk);
		
		String thirdChunkContent="  3.I am also satisfied by personal examination, that he/she has been vaccinated or bears marks of\n"
				+ "    small pox vaccination.\n";
		Chunk thirdChunk=new Chunk(thirdChunkContent);
		medicalContentPara.add(thirdChunk);
		
		String fourthChunkContent="  4.The applicant's age, according to his/her own statement is..................years and by appearance\n"
				+ "     about ...........years\n";
		Chunk fourthChunk=new Chunk(fourthChunkContent);
		medicalContentPara.add(fourthChunk);
		
		String fifthChunkContent="  5.Personal Marks Identification.                                                i)..............................................\n"
				+ "                                                                                                    ii).............................................";
		Chunk fifthChunk=new Chunk(fifthChunkContent);
		medicalContentPara.add(fifthChunk);
		doc.add(medicalContentPara);
		
		String signatureContent="\n\nSignature, Qualification and Designation\nof the Medical Examiners";
		Chunk signChunk=new Chunk(signatureContent);
		Paragraph signPara=new Paragraph(signChunk);
		signPara.setAlignment(1);
		signPara.setIndentationLeft(300);
		doc.add(signPara);
		
		String stationStr="  Station: .............................\n  Date: ................................\n";
		Chunk stationChunk=new Chunk(stationStr);
		
		String fStr="  (To be examined by an Assistant Surgeon of Practitioner who is a graduate or Licentiate in\n"
				+ "  Medicine of 5 Years standing and registered in the Medical Council)";
		stationChunk.append(fStr);
		Paragraph stationPara=new Paragraph(stationChunk);
		doc.add(stationPara);
	}
}