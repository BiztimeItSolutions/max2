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
	            alert("failed");
	    },
	});

$('#departmentName').change(function(){
	//to get the selected value in the department drop down
	var selecteditem = $("#departmentName option:selected")
	.text();
console.log("selected item from departmentName: " + selecteditem);
	
$.ajax({
    type:"GET",
    dataType: "json",
    url:"get_employee_detail.html",
    data : {
		"selecteditem" : selecteditem

	       },

	       
	       success:function(data)
           {
	 		console.log("returned in ajax: "+data);
	        $('#dataTables-example').find('tbody').empty();
           var tableData="";
           $.each(data.employee, function(index, element) {
				//make table body
				
				tableData = tableData + "<tr>" + "<td>" +element.employeeId+ "</td>"
						+ "<td>" + element.firstName + "</td>"
						+ "<td>" + " <button type='submit' name='assignbtn' id="+element.employeeId+"> Assign</button> "+ "</td>"
						+ "</tr>";

			});
           	$('#dataTables-example').find('tbody').append(tableData);
           },

    error:function(){
            alert("table failed");
    },
});	
});	


$.ajax({
    type:"GET",
     
    url:"get_batch.html",
    dataType:"html",

    success:function(data)
            {
            
            console.log(data);
            var a=data.slice(1, -1);
            var batch=a.split(',');
            $('#batchName').empty();
            
            $('#batchName').append($('<option>', { 
		        value: " ",
		        text : "Select Batch " 
		    }));
         
            for(var l in batch)
            {
            	$('#batchName').append($('<option>', { 
			        value: batch[l],
			        text : batch[l] 
			    }));
            }
            
            
            },

    error:function(){
            alert("batch failed");
    },
});
$('#batchName').change(function(){
	//to get the selected value in the department drop down
	var batch_name = $("#batchName option:selected")
	.text();
console.log("selected item from batchName: " + batch_name);
	
$.ajax({
    type:"GET",
    dataType: "html",
    url:"get_semester.html",
    data : {
		"selecteditem" : batch_name

	       },

	       
 success:function(data)
            {
	 
     var a=data.slice(1, -1);
     var semester=a.split(',');
     $('#semesterName').empty();
     
     $('#semesterName').append($('<option>', { 
	        value: " ",
	        text : "Select semester " 
	    }));
  
     for(var l in semester)
     {
     	$('#semesterName').append($('<option>', { 
		        value: semester[l],
		        text : semester[l] 
		    }));
     }
     
     
     },

    error:function(){
            alert("semesterName failed");
    },
});	
});	

$('#semesterName').change(function(){
	//to get the selected value in the department drop down
	var selecteditem = $("#semesterName option:selected")
	.text();
console.log("selected item from semesterName: " + selecteditem);

var batch_name = $("#batchName option:selected")
.text();
console.log("selected item from batchName: " + batch_name);

	
$.ajax({
    type:"GET",
    dataType: "html",
    url:"get_subject.html",
    data : {
		"selecteditem" : selecteditem,
		"batch_name" : batch_name

	       },

	       
 success:function(data)
            {
	 
     var a=data.slice(1, -1);
     var subject=a.split(',');
     $('#subjectName').empty();
     
     $('#subjectName').append($('<option>', { 
	        value: " ",
	        text : "Select subject " 
	    }));
  
     for(var l in subject)
     {
     	$('#subjectName').append($('<option>', { 
		        value: subject[l],
		        text : subject[l] 
		    }));
     }
     
     
     },

    error:function(){
            alert("subjectName failed");
    },
});	
});	

});

$(document).on("click","[name=assignbtn]",function(e){
	var empId=e.target.id;
    $("#employeeId").val(empId);
	//alert("clicked submiting");
});
