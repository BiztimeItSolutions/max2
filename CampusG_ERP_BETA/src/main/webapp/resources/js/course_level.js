$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	     
	    url:"get_course_level.html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            
	            //alert(data);
	            
	            var s=data.slice(1, -1);//data sliced to remove parenthesis
	            //alert(s);
	            
	            var cour=s.split(',');//data split on comma
	            //alert(cour);
	            $('#course_level').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#course_level').append($('<option>', { 
			        value: " ",
			        text : "Select Course Level " 
			    }));
	          //add values to drop down fetched from data base
	            for(var l in cour)
	            {
	            	$('#course_level').append($('<option>', { 
				        value: cour[l],
				        text : cour[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	
	//drop down course
	
	//called while drop down department changes
	$('#course_level').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#course_level option:selected")
		.text();
	console.log("selected item from course_level: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"getprogram.html",
	    data : {
			"selecteditem" : selecteditem

		},

	    success:function(data)
	            {
	    		
	            var s=data.slice(1, -1);//data sliced to remove parenthesis
	            
	            var prog=s.split(',');//data split to remove commas
	            
	            $('#program').empty(); //drop down made empty to fill in new data
	           // $('#department').empty();
	           // $('#course_name').empty();
	            
	            //to add a default value in the dropdown fetched from data base
	            $('#program').append($('<option>', { 
			        value: " ",
			        text : "Select Program Name" 
			    }));
	            
	            // to add the values to the drop down
	            for(var l in prog)
	            {
	            	$('#program').append($('<option>', { 
				        value: prog[l],
				        text : prog[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	//end of drop down course
	
	
	//drop down semester
	$('#program').change(function(){
//		alert(" program changed");
		var selecteditem = $("#program option:selected")
		.text();
	console.log("selected item from program: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"getdepartment.html",
	    data : {
			"selecteditem" : selecteditem

		},

	    success:function(data)
	            {
	    		
	            var s=data.slice(1, -1);// data sliced
	            
	            var dept=s.split(',');//data split to remove commas
	            
	            
	            $('#department').empty();// drop down made empty
	            
	            //$('#course_name').empty();
	            //append a defualt value
	            $('#department').append($('<option>', { 
			        value: " ",
			        text : "Select Department" 
			    }));
	            //add values to drop down fetched from data base
	            for(var l in dept)
	            {
	            	$('#department').append($('<option>', { 
				        value: dept[l],
				        text : dept[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});// end of drop down semester	
	
//drop down semi
	//called when drop down semester changes
	$('#department').change(function(){
	//	alert(" department changed");
		var selecteditem = $("#department option:selected")
		.text();
	console.log("selected department: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"getcourse.html",
	    data : {
			"selecteditem" : selecteditem

		},

	    success:function(data)
	            {
	    		
	            var s=data.slice(1, -1);// data sliced
	            
	            var co=s.split(",");//data split to remove commas
	  //          alert(co);
	            
	            $('#course_name').empty();// drop down made empty
	            
	            //append a default value
	            $('#course_name').append($('<option>', { 
			        value: " ",
			        text : "Select Course" 
			    }));
	            //add values to drop down
	            for(var l in co)
	            {
	            	$('#course_name').append($('<option>', { 
				        value: co[l],
				        text : co[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	
	
	//end of drop down semi
		
	
//end of ready	
}

);