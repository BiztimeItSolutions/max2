<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>campus_G</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">

    <style type="text/css">
<!--

.style1 {color: #FF0000}
.style2 {font-size: 12px}
-->
    </style>
	
</head>
<body>
    <div id="wrapper">

<!-- Header--><%@ include file="Header.jsp" %>
<!-- Left Menu --><%@ include file="LeftMenu.jsp" %>

<!--Start of Main page-->

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                  
				    <h4 class="page-header">Custom Reports | <span class="style2">New Report</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
                <div class="col-lg-6">
                  
				    <h6>Home > Custom Reports > <b>Generate Employee Report</b></h6>
					
				</div>
                <!-- /.col-lg-6 -->
				
				<div class="col-lg-6">
                	<div class="bar">
				  		<button type="button" class="btn btn-primary">Show All Report</button>

					</div>	
				</div>
                <!-- /.col-lg-6 -->
				
            </div>
            <!-- /.row -->
			
			<br>
			<div class="row">
				<div class="col-lg-4">
					
			 		<div class="form-group">
								<label class="label1">Name: </label><span class="style1">*</span>
                    			<input class="form-control" name="#" placeholder="Enter Name">    
                	</div>

				</div>
			</div>
			
			
			
			<div class="row">
			 <div class="col-lg-12">
			 	
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>


                                            <td> <label class="checkbox-inline"><input type="checkbox">First Name</label></td>
                                            <td><label class="checkbox-inline"><input type="checkbox">Middle Name</label></td>
                                            <td> <label class="checkbox-inline"><input type="checkbox">Last Name</label></td>											
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr>

                                            <td> <label class="checkbox-inline"><input type="checkbox">Employee No</label></td>
                                            <td> <label class="checkbox-inline"><input type="checkbox">Job Title</label></td>
                                            <td><label class="checkbox-inline"><input type="checkbox">Qualification</label></td>
                                        </tr>
                                        <tr>
											<td> <label class="checkbox-inline"><input type="checkbox">Marital Status</label></td>
                                            <td> <label class="checkbox-inline"><input type="checkbox">Blood Group</label></td>
                                            <td><label class="checkbox-inline"><input type="checkbox">Gender</label></td>
                                        </tr>
                                        <tr>
											<td> <label class="checkbox-inline"><input type="checkbox">Employee Position</label></td>
                                            <td> <label class="checkbox-inline"><input type="checkbox">Employee Department</label></td>
                                            <td><label class="checkbox-inline"><input type="checkbox">Employee Grade</label></td>
                                        </tr>
										<tr>
											<td> <label class="checkbox-inline"><input type="checkbox">Nationality</label></td>
                                            <td> <label class="checkbox-inline"><input type="checkbox">Date Of Birth</label></td>
                                            <td><label class="checkbox-inline"><input type="checkbox">Joining Date</label></td>
                                        </tr>
										
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->
			
			<div class="row">
				<div class="col-lg-12">
					<div class="alert alert-success">
					Input criterias to be used in search
                     </div>
				</div>
			</div>
			

			<div class="row">
				<div class="col-lg-12">
					<div class="alert alert-success">
					Select and order the fields to be shown in the report
                     </div>
				</div>
			</div>
			
						<div class="row">
			 <div class="col-lg-4">
			 	
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
									<thead>
                                        <tr>
                                            <td> First Name</td>
                                        </tr>
                                    </thead>
									<thead>
                                        <tr>
                                            <td> Middle Name</td>
                                        </tr>
                                    </thead>

									<thead>
                                        <tr>
                                            <td>Last Name</td>
                                        </tr>
                                    </thead>

                                    <tbody>
                                        
										<tr>
                                            <td> Employee No</td>
                                         </tr>
                                        <tr>
											<td>Job Title</td> 
                                        </tr>
										<tr>
                                            <td> Qualification</td>
                                         </tr>
                                        <tr>
											<td> MArital Status</td> 
                                        </tr>
										<tr>
                                            <td> Blood Group</td>
                                         </tr>
                                        <tr>
											<td> Date Of Birth</td> 
                                        </tr>
										<tr>
                                            <td> Joining date</td>
                                         </tr>
                                        <tr>
											<td> Employee Position</td> 
                                        </tr>
										<tr>
                                            <td> Employee Department</td>
                                         </tr>
                                        <tr>
											<td> Employee Grade</td> 
                                        </tr>
										<tr>
                                            <td> Nationality</td>
                                         </tr>
                                        <tr>
											<td> Home Address Line 1</td> 
                                        </tr>
										<tr>
                                            <td> Home Address Line 2</td>
                                         </tr>
                                        <tr>
											<td> Mobile</td> 
                                        </tr>
										<tr>
                                            <td> Email</td>
                                         </tr>
                                        <tr>
											<td> Gender</td> 
                                        </tr>
										
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-6 -->
			</div>
			<!-- /.row -->

		<div class="row">
			<div  class="col-lg-7">
				<div class="bar">
						<button type="button" class="btn btn-default">Save</button>
				</div><!--.bar -->
			</div><!--.col-lg-12 -->
		</div><!--.row -->
	
	
        </div>
        <!-- /#page-wrapper -->

<!--End of Main page-->


    </div>
    <!-- /#wrapper -->
    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
