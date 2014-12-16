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
           
		   
		   <br>
		   
		   
		   
		   
		    <div class="row">
                <div class="col-lg-12">
                  
				    <h4 class="page-header">Transport | <span class="style2">Route Details</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
				
            </div>
            <!-- /.row -->
			
			<div class="row">
                <div class="col-lg-3">
                  
				    <h6>Home>Transport><b>Route Details</b></h6>
					
				</div>
                <!-- /.col-lg-3 -->
				 <div class="col-lg-9">
                	<div class="bar">
				  		<button type="button" class="btn btn-primary">Add Route</button>
					</div>	
				</div>
                <!-- /.col-lg-9 -->

            </div>
            <!-- /.row -->
			
			<br>
			<br>
			
			
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
									
										
									 <!-- /.form-group -->	
                                        <tr>
										
                                            <th>Destination</th>
                                            <th>Cost</th>
                                            <th>Main Route</th>
                                           <th></th>
											
											
                                        </tr>
                                    </thead>
                                    <tbody>
									
                                        <tr class="odd gradeX">
										
                                            <td>thipasandra</td>
                                            <td>15000.00</td>
                                            <td>thipasandra</td>
                                            <td>Edit Delete</td>
                                            
                                           
                                        </tr>
									
										
                                      <!--  <tr class="even gradeC">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.0</td>
                                            <td>Win 95+</td>
                                            <td class="center">5</td>
                                            <td class="center">C</td>
											<td class="center">4</td>
                                            <td class="center">X</td>
                                        </tr>
                                        <tr class="odd gradeA">
                                            <td>Trident</td>
                                            <td>Internet Explorer 5.5</td>
                                            <td>Win 95+</td>
                                            <td class="center">5.5</td>
                                            <td class="center">A</td>
											<td class="center">4</td>
                                            <td class="center">X</td>
                                        </tr>
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

    <!-- Page-Level Plugin Scripts - table -->
	  <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->
      <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
	 
</body>

</html>
