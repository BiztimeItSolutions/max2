<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false"%><html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>campus_G</title>
<!-- Core CSS - Include with every page -->

<!-- Core CSS - Include with every page -->
<link href="<c:url value="/resources/css/bootstrap.css"/>"	rel="stylesheet">
<link href="<c:url value="/resources/font-awesome/css/font-awesome.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/sb-admin.css"/>" rel="stylesheet">

<!-- Page-Level Plugin CSS - Tables -->
<link href="<c:url value="/resources/css//plugins/dataTables/dataTables.bootstrap.css"/>" rel="stylesheet">

</head>

<body>

    
<!--Start of Main page-->
  
 <!-- Header--><%@ include file="Header.jsp" %>
 <!-- Left Menu --><%@ include file="LeftMenu.jsp" %> 

<div id="page-wrapper">
		 
		 <div class="row">
                <div class="col-lg-12">
				    <h4 class="page-header">Admission | <span class="style2">Candidate Details</span></h4> 
				</div><!-- /.col-lg-12 -->
         </div><!-- /.row -->
		 	
		 <div class="row">
               <div class="col-lg-6">
				    <h6>Home > <b>Candidate Details</b></h6>
				</div>
                <!-- /.col-lg-6 -->
          </div>
            <!-- /.row -->
		<br />

<!--  		 <div class="row">
               <div class="col-lg-4">
			   		<div class="form-group">
                   	<label>Add Filters</label><span class="style1"></span>                      	                	
   		                	<select class="form-control" name ="Course" id ="Course">
								<option>Select Course</option>
								<option>CHEMISTRY</option>
								<option>BIO-TECHNOLOGY</option>
								<option>COMPUTER SCIENCE</option>
								<option>ELECTRONICS</option>
								<option>BIOLOGY</option>
							</select>
	    	        </div>
					
				</div>/.col-lg-4
				
				<div class="col-lg-3">
			   		<div class="form-group">
   		                	<select class="form-control" name ="Course" id ="Course">
								<option>Select Gender</option>
								<option>Male</option>
								<option>Female</option>
							</select>
	    	        </div>
                    </div>
				
				<div class="col-lg-3">					
			   		<div class="form-group">
   		                	<select class="form-control" name ="QExam" id ="QExam">
								<option>Select Qualifying Exam	</option>
								<option>CET</option>
								<option>COMEDK</option>
								<option>AIEEE</option>
							</select>
	    	        </div>	
				</div>/.col-lg-4
	
				<div class="col-lg-2">
				  	<button type="button" class="btn btn-primary">Search</button>
				</div>
                /.col-lg-2
				
         </div>/.row
	 -->	 
		 
		 
			<div class="row">
                <div class="col-lg-12">
				
					<div class="panel panel-default">
                        <div class="panel-heading">
                            <!--DataTables Advanced Tables-->
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>Candidate ID</th>
                                            <th>Full Name</th>
                                            
                                            <th>DOB</th>
                                            <th>Nationality</th>
                                            <th>Category</th>
                                            <th>Department</th>
                                            <th>Quota</th>
                                            <th>Action</th>
                                           <th>Payment</th>
                                             <th>Document</th>
                                             
                                          <!--   <th>Status</th> -->
                                            
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                   
					           
                                    <c:forEach items="${p}" var="c">
                           

                                        <tr class="odd gradeX">
                                           <td><c:out value="${c.candidate_id}"/></td> 
                                            <td><c:out value="${c.firstname}"/>&nbsp;<c:out value="${c.lastname}"/></td>
                                            <td><c:out value="${c.dateofbirth}"/></td>
                                            <td><c:out value="${c.nationality}"/></td>
                                            <td><c:out value="${c.category}"/></td>
                                            <td><c:out value="${c.department}"/></td>
                                             <td><c:out value="${c.quota}"/></td> 
                                            
                                        <td>     
										    	<a href="view_candidate_detail_account?candidate_id=${c.candidate_id}">View</a>
										</td>
										
										
										<td>     
										    	<a href="view_candidate_account_detail?candidate_id=${c.candidate_id}&category=${c.category}&department=${c.department}&quota=${c.quota}">View Account</a> 
												
										</td>
                                        <td>     
										    	<a href="view_candidate_document_detail?candidate_id=${c.candidate_id}">Verify</a> 
												
										</td>
										
									<%-- 	<td><c:out value="${c.office_status}"/></td> --%>
									
										
									

                                        </tr> 
                                        </c:forEach>
                                
                                
                        
                                        </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
				
				
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
	
        	</div><!-- /#page-wrapper -->
	<!--End of Main page-->

 
<!-- Core Scripts - Include with every page -->
	<script src="<c:url value="/resources/js/jquery-1.7.min.js" />"></script>
	<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
	<script src="<c:url value="/resources/js/plugins/metisMenu/jquery.metisMenu.js" />"></script>
	<script src="<c:url value="/resources/js/sb-admin.js" />"></script>

     <!-- Page-Level Plugin Scripts - Tables -->
     <script src="<c:url value="/resources/js/plugins/dataTables/jquery.dataTables.js"/>"></script>
     <script src="<c:url value="/resources/js/plugins/dataTables/dataTables.bootstrap.js"/>"></script>
    

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
 
 
   


    
</body>

</html>
