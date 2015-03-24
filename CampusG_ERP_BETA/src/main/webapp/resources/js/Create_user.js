$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	    url:"get_user_create.html",
	    success:function(data)
	            {
	            console.log(data);
	           // alert(data);
	            var u=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	           var uu=u.replace(/\s/g, "");
	            var user=uu.split(',');//data split on comma
	           // alert(user);
	            $('#user_name').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#user_name').append($('<option>', { 
			        value: " ",
			        text : "Select User" 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in user)
	            {
	            	$('#user_name').append($('<option>', { 
				        value: user[r],
				        text : user[r] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
/*	
	//drop down course
	
	//called while drop down user_type changes
	$('#user_type').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#user_type option:selected").text();
		//alert(selecteditem);
		console.log("selected item from user_type: " + selecteditem);
		$.ajax({
	    type:"GET", 
	    url:"get_users.html",
	    data : {
			"selecteditem" : selecteditem
		},
	    success:function(data)
	            {
	    		//alert(data);
	            var uu=data.slice(1, -1);//data sliced to remove parenthesis
	            
	            var usrs=uu.split(',');//data split to remove commas
	          //  alert(usrs);
	            $('#user_name').empty(); //drop down made empty to fill in new data
	           // $('#department').empty();
	           // $('#course_name').empty();
	            
	            //to add a default value in the dropdown fetched from data base
	            $('#user_name').append($('<option>', { 
			        value: " ",
			        text : "Select User" 
			    }));
	            
	            // to add the values to the drop down
	            for(var s in usrs)
	            {
	            	$('#user_name').append($('<option>', { 
				        value: usrs[s],
				        text : usrs[s] 
				    }));
	            }	           
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	//end of drop down users
		*/
//end of ready	
});

function searchOnUser(){
	
	alert("search me called");
	
	var user_type=$("#user_type").val();
	var user_name=$("#user_name").val();

	alert("User type: "+user_type);
	alert("User name: "+user_name);
	
	$.ajax({
		type : "GET",
		url : "get_student_employee_parent.htm",
		data : {
			"user_type" : user_type.trim(),
			"user_name" : user_name.trim(),
		},
		success : function(data) {
			console.log(data);
			var obj = jQuery.parseJSON(data);//parse json object got from response
			alert(obj);
		
			
			var tableData="";
			//to iterate over json array
			$.each(obj.candi, function(index, element) {
				//make table body
				tableData = tableData + "<tr>" + "<td>" + element.id
						+ "</td>" + "<td>" + element.dept + "</td>"
						+ "<td>" + element.prog + "</td>"+ "</tr>";
						/*+ "<td>" + element.dob + "</td>" + "<td>"
						+ element.phone + "</td>" + "</tr>";*/

			});
			//replace table body
			
			$('#idTable tbody').html(tableData);
			$('#idTable').show("slow");
		},
		error : function() {
			alert("ajax failure");
		},
	});	
}
