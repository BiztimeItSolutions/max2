<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Biztime EduERP</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Blank -->

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
</head>

<body>

    <div id="wrapper">

           <!-- Header--><%@ include file="Header.jsp" %>
<!-- Left Menu --><%@ include file="LeftMenu.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                   
                     <h4 class="page-header">Student Settings | <span class="style2">add aditional details</span></h4>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-6">
                    
							<h6>Home > Configuration > <b>Additional Details</b></h6>
                            	</div></div>
                        
                            <div class="row">
                                <div class="col-lg-6">
                              

									<form role="" id="" method="" action="">
                                	
										  <div class="form-group">
                                            <label class="label1">Name</label><span class="style1"></span>
                                            <input type="text" class="form-control" name="">  
                                        </div>
                                        
                                           <div class="form-group">
                                            <label class="label1">Status:</label><span class="style1"></span>
                                            
                                            <input  type="radio" name="active"  value="active" /> <label for="active">active</label>
										<input type="radio" name="inactive" value="inactive" /> <label for="inactive">inactive</label>
                                         </div>
                                        
                                        
                                         <div class="form-group">
                                            <label class="label1">Is Mandatory</label>
                                             <span class="style1"></span>
                                            <label class="checkbox-inline">
                                                <input type="checkbox">
                                            </label>
                                        </div>
                                        
                                         <div class="form-group">
                                            <label class="label1">Input Method</label>
                                            <span class="style1"></span>
											<select class="form-control" name="">
												<option> TextBox  </option>
												<option> TextArea </option>
												<option>SelectBox</option>
												<option>CheckBox</option>
											</select>     
                                        </div>	

                                        
                                       <center> <button type="submit" class="btn btn-primary">Create</button></center>
                                        </br>
                                        </br>
                                        <table class="table table-striped table-bordered table-hover" id="dataTables-example" align="center">
                                    <thead>
                                        <tr>
                                      
                                            <th>active fields</th>
                                           <th></th>
                                           <th></th>
		                        										
                                        </tr>
                                    </thead>
                          <tbody>
                            <tr class="odd gradeX"> <td>Extra curricular</td><td><a href="">Edit</a></td><td><a href="">Delete</a></td> </tr>  
                                                                     
                          </tbody>
                                </table> 
                                        
                                        
                                <!-- /.col-lg-6 (nested) -->
                              </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
           

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Blank -->

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Blank - Use for reference -->
    
     <!-- Page-Level Demo Scripts - Blank - Use for reference -->
    
<!--     <script>
    $(document).ready(function(){
        $("#Button1").click(function(event){
            $(".message").show();
            $(".message").fadeOut(500000000000000000000000000000000000000000000000000000000000000000000000000000000000000000);
        });
    });
</script>
 -->
</body>
</html>
