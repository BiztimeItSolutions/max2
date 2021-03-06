$(document).ready(function(){

$.ajax({
	    type:"GET",
	     
	    url:"get_detail.html",
	    dataType:"html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            var a=data.slice(1, -1);
	            var department=a.split(',');
	            $('#departmentName').empty();
	            
	            $('#departmentName').append($('<option>', { 
			        value: " ",
			        text : "Select Department " 
			    }));
	         
	            for(var l in department)
	            {
	            	$('#departmentName').append($('<option>', { 
				        value: department[l],
				        text : department[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("Department failed");
	    },
	});

$('#departmentName').change(function(){
	//to get the selected value in the department drop down
	var selecteditem = $("#departmentName option:selected")
	.text();
console.log("selected item from departmentName: " + selecteditem);
	
$.ajax({
    type:"GET",
   url:"get_employee_id.html",
   dataType: "html",
    data : {
		"selecteditem" : selecteditem

	       },

	       
 success:function(data)
            {
	 console.log(data);
     var a=data.slice(1, -1);
     var id=a.split(',');
     $('#employeeId').empty();
     
     $('#employeeId').append($('<option>', { 
	        value: " ",
	        text : "Select Employee Id " 
	    }));
  
     for(var l in id)
     {
     	$('#employeeId').append($('<option>', { 
		        value: id[l],
		        text : id[l] 
		    }));
     }
            },

    error:function(){
            alert("ID failed");
    },
});	
});	

$('#employeeId').change(function(){
	//to get the selected value in the department drop down
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_name.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var name=data.slice(1, -1);
            
            var firstname=name.split(',');
         
            $('#firstName').empty();
            
            for(var l in firstname)
            {
            	$("input[name*='firstName']" ).val(firstname[l]);
            	
            }
            
            },

    error:function(){
            alert("employee Name failed");
    },
});	
});	
$('#employeeId').change(function(){
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId for ctc: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_ctc.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var name=data.slice(1, -1);
            
            var ctc=name.split(',');
         
            $('#ctc').empty();
            
            for(var l in ctc)
            {
            	$("input[name*='ctc']" ).val(ctc[l]);
            	
            }
           
            },

    error:function(){
            alert("employee ctc failed");
    },
});	
});	
$('#employeeId').change(function(){
	//to get the selected value in the department drop down
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_designation.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var emp=data.slice(1, -1);
            
            var designation=emp.split(',');
            
            $('#designation').empty();
          
            for(var l in designation)
            {
            	$("input[name*='designation']" ).val(designation[l]);
            	
            }
            
            },

    error:function(){
            alert("Designation failed");
    },
});	
});
$('#employeeId').change(function(){
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId for ctc: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_tds.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var name=data.slice(1, -1);
            
            var tds=name.split(',');
         
            $('#tds').empty();
            
            for(var l in tds)
            {
            	$("input[name*='tds']" ).val(tds[l]);
            	
            }
           
            },

    error:function(){
            alert("employee tds failed");
    },
});	
});	
$('#employeeId').change(function(){
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId for pf: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_pf.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var name=data.slice(1, -1);
            
            var pf=name.split(',');
         
            $('#pf').empty();
            
            for(var l in pf)
            {
            	$("input[name*='pf']" ).val(pf[l]);
            	
            }
           
            },

    error:function(){
            alert("employee pf failed");
    },
});	
});	
$('#employeeId').change(function(){
	var employeeid = $("#employeeId option:selected")
	.text();
console.log("selected item from employeeId for ctc: " + employeeid);
	
$.ajax({
    type:"GET",
     
    url:"get_employee_allowance.html",
    dataType:"html",
    data : {
		"employeeid" : employeeid

	       },

    success:function(data)
            {
    		
            var name=data.slice(1, -1);
            
            var allowance=name.split(',');
         
            $('#allowance').empty();
            
            for(var l in allowance)
            {
            	$("input[name*='allowance']" ).val(allowance[l]);
            	
            }
           
            },

    error:function(){
            alert("employee allowance failed");
    },
});	
});	
$.ajax({
    type:"GET",
     
    url:"get_college_calendar.html",
    dataType:"html",

    success:function(data)
            {
            
            console.log(data);
            var a=data.slice(1, -1);
            var month=a.split(',');
            $('#month').empty();
            
            $('#month').append($('<option>', { 
		        value: " ",
		        text : "Select Month " 
		    }));
         
            for(var l in month)
            {
            	$('#month').append($('<option>', { 
			        value: month[l],
			        text : month[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("Month failed");
    },
});
$('#month').change(function(){
	//to get the selected value in the department drop down
	var month = $("#month option:selected")
	.text();
console.log("selected item from month: " + month);
	
$.ajax({
    type:"GET",
     
    url:"get_total_days.html",
    dataType:"html",
    data : {
		"month" : month

	       },

    success:function(data)
            {
    		
            var calendar=data.slice(1, -1);
            
            var totaldays=calendar.split(',');
            
            $('#totalDays').empty();
          
            for(var l in totaldays)
            {
            	$("input[name*='totalDays']" ).val(totaldays[l]);
            	
            }
            
            },

    error:function(){
            alert("totaldays failed");
    },
});	
});

$('#month').change(function(){
	//to get the selected value in the department drop down
	var month = $("#month option:selected")
	.text();
console.log("selected item from month: " + month);
	
$.ajax({
    type:"GET",
     
    url:"get_holidays.html",
    dataType:"html",
    data : {
		"month" : month

	       },

    success:function(data)
            {
    		
            var calendar=data.slice(1, -1);
            
            var holidays=calendar.split(',');
            
            $('#holidays').empty();
          
            for(var l in holidays)
            {
            	$("input[name*='holidays']" ).val(holidays[l]);
            	
            }
            
            },

    error:function(){
            alert("holidays failed");
    },
});	
});
$('#month').change(function(){
	//to get the selected value in the department drop down
	var month = $("#month option:selected")
	.text();
console.log("selected item from month: " + month);
	
$.ajax({
    type:"GET",
     
    url:"get_working_days.html",
    dataType:"html",
    data : {
		"month" : month

	       },

    success:function(data)
            {
    		
            var calendar=data.slice(1, -1);
            
            var workingdays=calendar.split(',');
            
            $('#workingDays').empty();
          
            for(var l in workingdays)
            {
            	$("input[name*='workingDays']" ).val(workingdays[l]);
            	
            }
            
            },

    error:function(){
            alert("workingdays failed");
    },
});	
});

$('#month').change(function(){
	//to get the selected value in the department drop down
var month = $("#month option:selected")
.text();
console.log("selected item from month: " + month);
	
var employeeid = $("#employeeId option:selected")
.text();
console.log("selected item from employeeId: " + employeeid);

	
$.ajax({
    type:"GET",
    dataType: "html",
    url:"get_total_working_days.html",
    data : {
		"month" : month,
		"employeeid" : employeeid

	       },

	       
	       success:function(data)
           {
   		
           var calendar=data.slice(1, -1);
           
           var totalWorkingdays=calendar.split(',');
           
           $('#totalWorkingDays').empty();
         
           for(var l in totalWorkingdays)
           {
           	$("input[name*='totalWorkingDays']" ).val(totalWorkingdays[l]);
           	
           }
           
           },


    error:function(){
            alert("totalWorkingdays failed");
    },
});	
});	


$('#month').change(function(){
	//to get the selected value in the department drop down
var month = $("#month option:selected")
.text();
console.log("selected item from month: " + month);
	
var employeeid = $("#employeeId option:selected")
.text();
console.log("selected item from employeeId: " + employeeid);
	
$.ajax({
	 type:"GET",
	    dataType: "json",
	    url:"get_absent_days.html",
	    data : {
			"employeeid" : employeeid,
			"month" : month
	           },

	       
           success:function(data)
           {
	    	   console.log(data);
	    	   var sum="";
	    	   $.each(data.leaveReqDays,function(i,val){
	    		  sum = Number(sum + Number(val.daysRequest));
	    		   
	    	   });
	    	   $("input[name*='daysRequest']" ).val(sum);
           },
    error:function(){
            alert("absentDays failed");
    },
});	
});	
$('#month').change(function(){
	//to get the selected value in the department drop down
var month = $("#month option:selected")
.text();
console.log("selected item from month: " + month);
	
var employeeid = $("#employeeId option:selected")
.text();
console.log("selected item from employeeId: " + employeeid);


	
$.ajax({
	 type:"GET",
	    dataType: "json",
	    url:"get_payable_days.html",
	    data : {
			"employeeid" : employeeid,
			"month" : month
			},

	       
           success:function(data)
           {
	    	   console.log(data);
	    	   var sum="";
	    	   $.each(data.leavepayableDays,function(i,val){
	    		  sum = Number(sum + Number(val.payableDays));
	    		   
	    	   });
	    	   $("input[name*='payableDays']" ).val(sum);
           },
    error:function(){
            alert("payableDays failed");
    },
});	
});	
});//end of script


