$(document).ready(function(){

	$.ajax({
	    type:"GET",
	     
	    url:"get_college_id.html",
	dataType:"html",
	    success:function(data)
	            {
	            
	            console.log(data);
	           var a=data.slice(1, -1);
	           var col=a.split(',');
	           
	          
	            for(var l in col)
	            {
	            	$('#collegeNamefk').append($('<option>', { 
				        value: col[l],
				        text : col[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	


/* dropdown values for courselevel*/

$.ajax({
    type:"GET",
     
    url:"get_courselevel_name.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var col=a.split(',');
           
          
            for(var l in col)
            {
            	$('#courselevelNamefk').append($('<option>', { 
			        value: col[l],
			        text : col[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	


/*dropdown for module */
$.ajax({
    type:"GET",
     
    url:"get_parent_module_name.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#parentId').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	



/*dropdown for program name */
$.ajax({
    type:"GET",
     
    url:"get_program_name.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#programNamefk').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	


/*dropdown for course name */
$.ajax({
    type:"GET",
     
    url:"get_course_code.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#courseCodefk').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	


/*dropdown for batch name */
$.ajax({
    type:"GET",
     
    url:"get_batch_name.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#batchId').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	

/*dropdown for subject name */
$.ajax({
    type:"GET",
    url:"get_subject_name.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#subjectId').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	

/*dropdown for batch name */
$.ajax({
    type:"GET",
     
    url:"get_employeename.html",
dataType:"html",
    success:function(data)
            {
            
            console.log(data);
           var a=data.slice(1, -1);
           var mod=a.split(',');
           
          
            for(var l in mod)
            {
            	$('#employeeId').append($('<option>', { 
			        value: mod[l],
			        text : mod[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("failed");
    },
});	

/*batch display on course */

$('#courseCodefk').change(function(){
	//to get the selected value in the department drop down
	var selecteditem = $("#courseCodefk option:selected")
	.text();
console.log("selected item from course code: " + selecteditem);


$.ajax({
    type:"GET",
    dataType: "json",
    url:"get_coursecode_type.html",
    data : {
		"selecteditem" : selecteditem

	       },
	       
	       
	       
	       success:function(data)
           {
   		
           var leavecode=data.slice(1, -1);
           
           var code=leavecode.split(',');
        
           $('#batchName').empty();
           
           for(var l in code)
           {
           	$("input[name*='batchName']" ).val(code[l]);
           	
           }
           
           },
   error:function(){
           alert("receipt type failed");
   },
});	
});	
});	








	
	
	

