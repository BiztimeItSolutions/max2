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
                  
				    <h4 class="page-header">Placements | <span class="style2">New Placement Event</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
                <div class="col-lg-6">
                  
				    <h6>Home > Placements <b>Announce New Placement</b></h6>
					
				</div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
			
			</br>

	
	
			<div class="row">
				<div class="col-lg-4"></div>
                <div class="col-lg-4">
				
					<div class="form-group">
						<label class="label1">Title: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter title">    
                    </div>
					
					<div class="form-group">
						<label class="label1">Date: </label><span class="style1">*</span>
                    	<input class="form-control" type="date" name="#" >    
                    </div>
					
					<div class="form-group">
						<label class="label1">Company: </label><span class="style1">*</span>
                    	<input class="form-control" name="#" placeholder="Enter Company Name">    
                    </div>
					
					<div class="form-group">
                        <label class="label1">Description</label><span class="style1">*</span>
                        <textarea class="form-control" rows="3"></textarea>
                    </div>
					
				  <br>
				  <br>
				  <br>
				  
				  <button type="button" class="btn btn-default">Create Placement Event</button>
<!--                  <button type="button" class="btn btn-primary">Primary</button>
                  <button type="button" class="btn btn-outline btn-primary">Create Placement Event</button>              -->
				
				
				
				</div>
                <!-- /.col-lg-6 -->
				<div class="col-lg-4"></div>
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

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->

</body>

</html>
