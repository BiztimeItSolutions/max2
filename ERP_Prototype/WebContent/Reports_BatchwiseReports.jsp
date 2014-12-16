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
<!-- Page-Level Plugin CSS - Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

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
                  
				    <h4 class="page-header">Reports | <span class="style2">Batch wise Reports</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
			
                <div class="col-lg-12">
                  
				    <h6>Home > Reports > Fees Head Wise Report > <b>Batch wise Reports</b></h6>
					<br>
				</div>
                <!-- /.col-lg-12 -->
				
				<div class="col-lg-4">
				
					<div class="form-group">
                    <label class="label1">Select Course: </label><span class="style1">*</span>
						<select class="form-control" name="department_name">
							<option>--Select Course--</option>
                            <option>BE-CSE</option>
							<option>BE-ISE</option>
                        </select>
                    </div>
					
					
					  <br>
					  <button type="button" class="btn btn-default">Search</button>
				
				</div>
                <!-- /.col-lg-4 -->
				
				<div class="col-lg-1"></div>
				
				<div class="col-lg-4">
					<div class="form-group">
                    <label class="label1">Select Batch: </label><span class="style1">*</span>
						<div class="boxarea">Select: <a href="#">All,</a> <a href="#">None</a>
							<label class="checkbox-inline">
                                      <input type="checkbox">BE-CSE-BE-CSE-2014-18
                             </label>
						</div>
					</div>
				
				</div>
                <!-- /.col-lg-6 -->
           </div>
            <!-- /.row -->
			<br>
			
			<div class="dividerall"></div>
			
			<div class="row">
                <div class="col-lg-12">
				<br>
				<label class="label1">Total Subjects: <b>0</b></label>
                	<div class="bar">
				  		<button type="button" class="btn btn-primary">Export as CSV</button>
					</div>	
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			</br>



	
	
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
                                            <th>Student Name</th>
                                            <th>Batch Name</th>
                                            <th>Fee Collection Name</th>
                                            <th>Amount to Pay($)</th>
                                            <th>Paid Amount($)</th>
											<th>Fee Perticulars</th>
											<th>Fee Discounts</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <!--
										<tr class="odd gradeX">
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
                                            <td></td>
											<td></td>
											<td></td>
                                        </tr>
										
										-->
										<!--
                                        <tr class="even gradeC">
                                            <td>Computer</td>
                                            <td>Com01</td>
                                            <td>5</td>
                                            <td>BE-CS-BE-CS-2014-18</td>
                                            <td>No</td>
											<td>Yes</td>
                                        </tr>
                                        <tr class="odd gradeA">
                                            <td>Physics</td>
                                            <td>Phy01</td>
                                            <td>4</td>
                                            <td>BE-CS-BE-CS-2014-18</td>
                                            <td>No</td>
											<td>Yes</td>
                                        </tr>
										<!--
                                        <tr class="even gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 6</td>
                                            <td>Win 98+</td>
                                            <td class="center">6</td>
                                            <td class="center">A</td>
											<td class="center">4</td>
                                            <td class="center">X</td>
                                        </tr>-->
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

</body>

</html>
