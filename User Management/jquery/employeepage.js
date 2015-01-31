 $(document).ready(function(){

	 $.validator.addMethod("alphabetsonly", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#employeedetails").validate({
        rules : {
        	
        
        	first_name:"alphabetsonly",
        	last_name:"alphabetsonly",
        	
        	
            	first_name : 
				{
                        required : true,
                        alphabetsonly: true
                },
                last_name : 
				{
                        required : true,
                        alphabetsonly: true
                },
				employee_number : 
				{
                        required : true
                       
                },
                date_of_birth : 
				{
                        required : true     
                },
                department :{
                	
                	required : true
                },
				category :{
                	
                	required : true
                },
				 position :{
                	
                	required : true
                },
				 additional_bank_details :{
                	
                	required : true
                },
           	
        },
        messages : {
        	
				first_name : 
				{
					required : "Please enter a First Name",     
                },
                last_name : 
				{
                	required : "Please enter a Last Name", 
                },
                date_of_birth : 
				{
                        required : "Please enter a Date of Birth ",   
                },
				department : 
				{
                        required : "Please select a Department ",   
                },
				position : 
				{
                        required : "Please select a Position ",   
                },
				employee_number : 
				{
                        required : "Please enter a Employee Number ",   
                },
				category :
				{
                        required : "Please select a category ",   
                },
				additional_bank_details : 
				{
                        required : "Please enter a bank details",   
                },
                
        }
		
		
  });
});
});
