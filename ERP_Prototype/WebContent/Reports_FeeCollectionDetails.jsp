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
                  
				    <h4 class="page-header">Reports | <span class="style2">Fee Collection Details</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			
			<div class="row">
                <div class="col-lg-12">
                  
				    <h6>Home>Reports><b>Fee Collection Details</b></h6>
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
							<option>BE-CIVIL</option>
							<option>BE-MECHANICAL</option>
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
			<br>
			<div align="center"><b>No Fee Collection</b></div>

	
	
        </div>
        <!-- /#page-wrapper -->

<!--End of Main page-->


    </div>
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->

</body>

</html>
