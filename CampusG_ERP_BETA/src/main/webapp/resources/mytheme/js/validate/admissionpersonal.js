 $(document).ready(function(){
	 
	 $.validator.addMethod("nation", function(value, element) {
 
    return /^[A-Z]{4,15}$/i.test(value);
}, "Nationality should contain 4 to 15 characters");

	 $.validator.addMethod("alphabetsonly", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#admissionpersonaldetails").validate({
        rules : {
        
        	nationality:"nation",
        	firstname:"alphabetsonly",
        	lastname:"alphabetsonly",
        	
        	firstname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                lastname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                dateofbirth : 
				{
                        required : true     
                },
                gender :{
                	
                	required : true
                },
                nationality :{
                	
                	required : true,
                	nation: true
                },
	
        },
        messages : {
        	
        	firstname : 
				{
					required : "Please enter a First Name",     
                },
                lastname : 
				{
                	required : "Please enter a Last Name", 
                },
                dateofbirth : 
				{
                        required : "Please enter a Date of Birth ",   
                },
                gender :{
                	
                	required :"Please enter a Gender",
                },
                nationality :{
                	
                	required : "Please enter a Nationality",
                	
                },
      			
        }
		
		
  });
});
});
