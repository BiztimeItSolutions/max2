<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%>
<html>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>campus_G</title>

<!-- Core CSS - Include with every page -->

<!-- Core CSS - Include with every page -->
<link href="<c:url value="/resources/css/bootstrap.css"/>"
	rel="stylesheet">

<link
	href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>"
	rel="stylesheet">
<link href="<c:url value="/resources/css/sb-admin.css"/>"
	rel="stylesheet">

<script src="<c:url value="/resources/js/validate/countries.js" />"></script>
<link href="<c:url value="/resources/css/jquery-ui.css"/>" rel="stylesheet">





</head>


<body>

    
<!--Start of Main page-->


 <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">

		<div class="row">
			<div class="col-lg-12">

				<h4 class="page-header">
					Account | <span class="style2"> Account Details</span>
				</h4>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		
<div class="row">
	 <div class="col-lg-6">
		  <h6>Home > Student Admission > <b>Account</b></h6>
	</div><!--col 6 -->
</div><!--row -->
	  <br />
<div class="row">
	 <div class="col-lg-12">
          <div class="form-group">
			   <label>Fields Marked with <span class="style1">*</span>must be filled
			   </label>
		  </div>
     </div>
</div>
<br/>
<div class="row">
     <form:form method="POST" commandName="feeCommand" id=""
						action="${pageContext.request.contextPath}/saveAccount">
	   <div class="row">			
			    
			<div class="col-lg-5">
				 
				 <div class="form-group">
					  <label class="label1">Student ID</label> <span class="style1"></span>
							 <form:input path="candidate.candidate_id" name="candidate_id" type="text" class="form-control" readonly = "true" value="${p.candidate_id}" />
				 </div>
								  
				 <div class="form-group">
					  <label class="label1">Course Level</label> <span class="style1"></span>
					  <form:input path="candidate.course_level" readonly = "true" value="${p.course_level}" type="text" class="form-control"  />
				 </div>
								
				 <div class="form-group">
					  <label class="label1">Course Name </label> <span class="style1"></span>
					  <form:input path="candidate.course_name" readonly = "true" value="${p.course_name}" type="text" class="form-control"
										name="course_name" />
				 </div>
								
				 <div class="form-group">
					  <label class="label1">Department</label> <span class="style1"></span>
							 <form:input path="candidate.department" type="text" readonly = "true" name="department" value="${p.department}"
										class="form-control" />
				</div>
								
				<div class="form-group">
					 <label class="label1">Quota</label> <span class="style1"></span>
							<form:input path="candidate.quota" type="text" readonly = "true" name="quota" value="${p.quota}"
										class="form-control" />
				</div>
								
				<div class="form-group">
					 <label class="label1">Category</label> <span class="style1"></span>
							<form:input path="candidate.category" type="text" readonly = "true" name="category" value="${p.category}"
										class="form-control" />
				</div>
	
                <div class="form-group">
					 <label class="label1">Program</label> <span class="style1"></span>
							<form:input path="candidate.program" type="text" readonly = "true" value="${p.program}"
										class="form-control" />
				</div> 
								 
				 
		        <div class="form-group">
					 <label class="label1">Date</label><span class="style1">*</span>
							<form:input path="studentFee.date" name="date" type="text" class="form-control" id="datepicker" placeholder="Select Date"/>
				</div>
			   
			  
               <div class="form-group">
                     <label class="label1">Receipt Book: </label><span class="style1"></span>
						    <form:select path="studentFee.receiptName" class="form-control" name="receiptName" id="receiptName">
							      <form:option value="none" label="Select Receipt Book"/>
                            </form:select>
                </div> 
                
                <div class="form-group">
                     <label class="label1"> Mode Of Payment: </label><span class="style1"></span>
						    <form:select class="form-control" 
						                 onchange="if (this.selectedIndex==4)
						                           {
						                             this.form['studentFee.accountNumber'].style.visibility='visible',
						                             this.form['studentFee.bankName'].style.visibility='visible'
						                           }
						                           else 
						                           {
						                           this.form['studentFee.accountNumber'].style.visibility='hidden',
						                           this.form['studentFee.bankName'].style.visibility='hidden'
						                           };
						                           if (this.selectedIndex==2)
						                           {
						                             this.form['studentFee.chequeNo'].style.visibility='visible',
						                             this.form['studentFee.chequeStatus'].style.visibility='visible'
						                           }
						                           else 
						                           {
						                           this.form['studentFee.chequeNo'].style.visibility='hidden',
						                           this.form['studentFee.chequeStatus'].style.visibility='hidden'
						                           };
						                           if (this.selectedIndex==3)
						                           {
						                             this.form['studentFee.ddNumber'].style.visibility='visible',
						                             this.form['studentFee.ddIssueDate'].style.visibility='visible',
						                             this.form['studentFee.ddBank'].style.visibility='visible'
						                           }
						                           else 
						                           {
						                           this.form['studentFee.ddNumber'].style.visibility='hidden',
						                           this.form['studentFee.ddIssueDate'].style.visibility='hidden',
						                           this.form['studentFee.ddBank'].style.visibility='hidden'
						                           };"
						         path="studentFee.paymentName"  id="paymentName" >
							      <form:option value="None" label="Select Mode Of Payment"/>
						    </form:select> 
				</div>
	 
    
	       <div class="row">

							
		        <div class="col-lg-5">
							
                     <div  class="form-group">
						    <form:input path="studentFee.accountNumber"   style="visibility:hidden;" name="studentFee.accountNumber" type="text" class="form-control" placeholder="Enter Account Number" />
			         </div>
			    </div> 
			    
			    <div class="col-lg-5">
			        
			         <div class="form-group">
                	      <form:input path="studentFee.bankName" type="text" style="visibility:hidden;" name="studentFee.bankName" class="form-control" placeholder="Enter Bank Name"/>  
		    	     </div>
				
				</div><!--Col-5 -->
					
					
		 </div><!-- row -->
		 
		  <div class="row">

							
		        <div class="col-lg-5">
							
                     <div  class="form-group">
						    <form:input path="studentFee.ddNumber"  style="visibility:hidden;" name="studentFee.ddNumber" type="text" class="form-control" placeholder="Enter DD Number" />
			         </div>
			   
			    </div> 
			    
			    <div class="col-lg-5">   
			         
			         <div class="form-group">
                	      <form:input path="studentFee.ddIssueDate" type="text" style="visibility:hidden;" name="studentFee.ddIssueDate" class="form-control" placeholder="Enter Issue Date"/>  
		    	     </div>
		    	
		    	</div>  
		    	<br/><br/>
		    	<div class="col-lg-5">   
		    	     
		    	     <div class="form-group">
                	      <form:input path="studentFee.ddBank" type="text" style="visibility:hidden;" name="studentFee.ddBank" class="form-control" placeholder="Enter DD Bank Name"/>  
		    	     </div>
				
				</div><!--Col-5 -->
					
					
		 </div><!-- row -->
		
		 <div class="row">

							
		        <div class="col-lg-5">
							
                     <div  class="form-group">
						    <form:input path="studentFee.chequeNo"  style="visibility:hidden;" name="studentFee.chequeNo" type="text" class="form-control" placeholder="Enter Cheque Number" />
			         </div>
			
			    </div>
			    
			    <div class="col-lg-5">
		        
					 <div class="form-group">
                	      <form:input path="studentFee.chequeStatus" type="text" style="visibility:hidden;" name="studentFee.chequeStatus" class="form-control" placeholder="Enter Cheque Status"/>  
		    	     </div>
		    	     
			   </div><!--Col-5 -->
					
					
		 </div><!-- row -->	
				 
		 </div>
		   <div class="col-lg-5">
							
			 <%-- <div class="table-responsive">
					 <table class="table table-striped table-bordered table-hover" id="">
                            <thead>
                                  <tr>
                                     <th>chk</th>
                                     <th>Fee Description</th>
                                     <th>Amount</th>
                                  </tr>
                            </thead>
                            <tbody>
                                  <c:forEach items="${f}" var="FEETYPE">
                                  <tr class="odd gradeX">
                                      <td align="center">
                                      <form:checkbox path="studentFee.feeName" rel="${FEETYPE.amount}" value="${FEETYPE.feeName}"/>
                                      </td>
                                      <td><c:out value="${FEETYPE.feeName}"/></td>
                                      <td><c:out value="${FEETYPE.amount}"/></td>
                                   </tr> 
                                   </c:forEach>
                            </tbody>
                     </table>
			    </div>    --%>
		  

			
                <div id="mydiv" class="table-responsive">
					 <table class="table table-striped table-bordered table-hover"
								id="dataTables-example">
								<thead>
									<tr>
										<th>Fee</th>
										<th>Amount</th>
									</tr>
								</thead>
								<tbody>
									<tr class="odd gradeX">
										<td>No Records Found</td>
									</tr>
									<tr class="even gradeX">
										<td></td>
									</tr>

								</tbody>
							</table>
			    </div> 
<br>



                <div class="form-group">
                     <label class="label1">Amount: </label><span class="style1"></span>
                            <form:input type="text" path="studentFee.amount"  class="form-control" name="amount"  id="amount" /> 
                </div> 
					 <div class="form-group">
                    
                            <form:input type="hidden" path="studentFee.feeName"  class="form-control" name="feeName"  id="txtValue" /> 
                </div>
			    <button type="submit" class="btn btn-primary" onClick="updateTextArea()"> Submit</button>
			</div>
	</form:form>
</div><!-- row -->

</div>
<!--End of Main page-->



<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src ="<c:url value="/resources/js/jquery-ui.js"/>"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

	<script
		src="<c:url value="/resources/js/validate/jquery.validate.js" />"></script>
	
	      <!-- Dropdown values  -->
<script src="<c:url value="/resources/js/studentfee.js" />"></script> 
 
          <!-- Date Picker -->
<script>
$(function() {
$( "#datepicker" ).datepicker({
changeMonth: true,
changeYear: true,
yearRange: '1950:2020' 
});
});
</script>




</body>

</html>


