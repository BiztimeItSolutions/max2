$(document).ready(function(){

$.ajax({
	    type:"GET",
	     
	    url:"get_leave_name.html",
	    dataType:"html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            var a=data.slice(1, -1);
	            var leavename=a.split(',');
	          
	         
	            for(var l in leavename)
	            {
	            	$('#leaveName').append($('<option>', { 
				        value: leavename[l],
				        text : leavename[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});


	
	$('#leaveName').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#leaveName option:selected")
		.text();
	console.log("selected item from leaveName: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"get_leave_code.html",
	    dataType:"html",
	    data : {
			"selecteditem" : selecteditem

		       },

	    success:function(data)
	            {
	    		
	            var leavecode=data.slice(1, -1);
	            
	            var code=leavecode.split(',');
	         
	            $('#leaveCode').empty();
	            
	            for(var l in code)
	            {
	            	$("input[name*='leaveCode']" ).val(code[l]);
	            	
	            }
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	
	$('#leaveName').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#leaveName option:selected")
		.text();
	console.log("selected item from leaveName: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"get_leave_Count.html",
	    dataType:"html",
	    data : {
			"selecteditem" : selecteditem

		       },

	    success:function(data)
	            {
	    		
	            var leavecount=data.slice(1, -1);
	            
	            var count=leavecount.split(',');
	            
	            $('#leaveCount').empty();
	          
	            for(var l in count)
	            {
	            	$("input[name*='leaveCount']" ).val(count[l]);
	            	
	            }
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});
	
	$('#leaveName').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#leaveName option:selected")
		.text();
	console.log("selected item from leaveName: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"get_leave_status.html",
	    dataType:"html",
	    data : {
			"selecteditem" : selecteditem

		       },

	    success:function(data)
	            {
	    		
	            var leavestatus=data.slice(1, -1);
	            
	            var status=leavestatus.split(',');
	            
	           
	            
	            for(var l in status)
	            {
	            	$("input[name*='status']" ).val(status[l]);
	            	
	            }
 },
	            
	    error:function(){
	            alert("failed");
	    },
	});	
	});	
});




	
	
	

