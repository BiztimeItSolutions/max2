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
                  
				    <h4 class="page-header">Placements | <span class="style2">All Placements</span></h4> 
				</div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
			
			<div class="row">
                <div class="col-lg-6">
                  
				    <h6>Home > <b>Placements</b></h6>
					
				</div>
                <!-- /.col-lg-6 -->

                <div class="col-lg-6">
                	<div class="bar">
				  		<a href="Placements_AnnounceNewPlacement.jsp"><button type="button" class="btn btn-primary">Announce New Placement</button></a>
				  		<a href="Placements_ArchievedPlacement.jsp"><button type="button" class="btn btn-primary">Archieved Placements</button></a>
						
						<!-- <button type="button" class="btn btn-primary"><a href="Placements_ArchievedPlacement.jsp">Archieved Placements</a></button> -->
					</div>	
				</div>
                <!-- /.col-lg-6 -->
            </div>
            <!-- /.row -->
			<br>
			<br>
			<br>
			<br>
			
			<div align="center"><b>No Placemen Events have been announced</b></div>				
				
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
