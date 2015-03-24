$(document).ready(function(){
	
	//drop down department
	$.ajax({
	    type:"GET",
	     
	    url:"get_user_type.html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            
	           // alert(data);
	            
	            var u=data.slice(1, -1);//data sliced to remove parenthesis
	           // alert(u);
	            
	            var user=u.split(',');//data split on comma
	          //  alert(user);
	            $('#user_type').empty();//drop down made empty
	            //add default value to drop down
	            
	            //$('#program').empty(); //drop down made empty to fill in new data
	            //$('#department').empty();
	            //$('#course_name').empty();
	            
	            
	            $('#user_type').append($('<option>', { 
			        value: " ",
			        text : "Select User Type  " 
			    }));
	          //add values to drop down fetched from data base
	            for(var r in user)
	            {
	            	$('#user_type').append($('<option>', { 
				        value: user[r],
				        text : user[r] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});//end of department
	
	
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
	            $('#user').empty(); //drop down made empty to fill in new data
	           // $('#department').empty();
	           // $('#course_name').empty();
	            
	            //to add a default value in the dropdown fetched from data base
	            $('#user').append($('<option>', { 
			        value: " ",
			        text : "Select User" 
			    }));
	            
	            // to add the values to the drop down
	            for(var s in usrs)
	            {
	            	$('#user').append($('<option>', { 
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
	
	
/*	//drop down semester
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
*/		
	
//end of ready	
});
