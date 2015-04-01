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
				   Employee Leave Management | <span class="style2"> Leave</span>
				</div><!-- /.col-lg-12 -->
         </div><!-- /.row -->
		 	
		 <div class="row">
               <div class="col-lg-6">
				   <h6>Home > Employee Leave Management > <b>Leave Detail</b></h6>
				</div>
                <!-- /.col-lg-6 -->
          </div>
            <!-- /.row -->
		<br />
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
                                            <th>Employee ID</th>
                                            <th>First Name</th>
                                            <th>Nationality</th>
                                            <th>Mobile</th>
                                            <th>Email</th>
                                            <th>Action</th>
                                             <th>Document</th>
                                        
                                        </tr>
                                    </thead>
                                    <tbody>
                   
					           
                                    <c:forEach items="${emp}" var="e">
                           

                                        <tr class="odd gradeX">
                                           <td><c:out value="${e.employeeId}"/></td> 
                                            <td><c:out value="${e.firstName}"/></td>
                                            <td><c:out value="${e.nationality}"/></td>
                                            <td><c:out value="${e.mobile}"/></td>
                                             <td><c:out value="${e.email}"/></td>
                                           
                                        <td>     
										    	<a href="viewEmployeeAllDetail?employeeId=${e.employeeId}">view</a>
										</td>
										 <td>     
										    	<a href="viewEmployeeDocumentVerification?employeeId=${e.employeeId}">verify</a>
										</td>
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
