 $(document).ready(function(){
	 
	 $.validator.addMethod("nation", function(value, element) {
 
    return /^[A-Z]{4,15}$/i.test(value);
}, "Nationality should contain 4 to 15 characters");

	 $.validator.addMethod("alphabetsonly", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#empgeneraldetails").validate({
        rules : {
        
        	nationality:"nation",
        	firstName:"alphabetsonly",
        	lastName:"alphabetsonly",
        	
        	firstName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                lastName : 
				{
                        required : true,
                        alphabetsonly: true
                },
                dateOfBirth : 
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
                governmentId :{
                	required : true
                }
	
        },
        messages : {
        	
        	firstName : 
				{
					required : "Please enter a First Name",     
                },
                lastName : 
				{
                	required : "Please enter a Last Name", 
                },
                dateOfBirth : 
				{
                        required : "Please enter a Date of Birth ",   
                },
                gender :{
                	
                	required :"Please enter a Gender",
                },
                nationality :{
                	
                	required : "Please enter a Nationality",
                	
                },
                governmentId :{
                	required : "Please eneter a ID Number"
                }
      			
        }
		
		
  });
});
});
