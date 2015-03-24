 $(document).ready(function(){
	 $.validator.addMethod("nation", function(value, element) {
 
    return /^[A-Z]{4,15}$/i.test(value);
}, "Nationality should contain 4 to 15 characters");
	 
	 
	 $.validator.addMethod("num", function(value, element) {
		    return /^[+]\d{12}$/i.test(value);
		}, "Field start with + and contain 12 digits");
	 $.validator.addMethod("email", function(value, element) {
	        return /^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,4}$/i.test(value);
	    }, "Email id should be in ex:john@gmail.com format");
	 $.validator.addMethod("pincode", function(value, element) {
	        return /^\d{6}$/i.test(value);
	    },  "Please Enter 6 digits");
	 $.validator.addMethod("alphabetsonly", function(value, element) {
	        return /[A-Za-z]{1,}$/i.test(value);
	    },  "Please enter alphabets");
	 
	 
$(function() {

   $("#admissionparentdetails").validate({
        rules : {
        	
        	
        	
        	guardianfirstname:"alphabetsonly",
        	guardianlastname:"alphabetsonly",
        	motherfirstname:"alphabetsonly",
        	fatherfirstname:"alphabetsonly",
        	fatherlastname:"alphabetsonly",
        	motherlastname:"alphabetsonly",
        	
        	
       
                
        	    guardianfirstname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                guardianlastname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                guardinrelation : 
				{
                        required : true
                        
                },
                fatherfirstname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                motherfirstname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                fatherlastname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                motherlastname : 
				{
                        required : true,
                        alphabetsonly: true
                },
                
              
                
                
        		
				
        },
        messages : {
        	
        
                
        	guardianfirstname : 
				{
					required : "Please enter a First Name",     
                },
                guardianlastname : 
				{
                	required : "Please enter a Last Name", 
                },
                guardinrelation : 
				{
                	required : "Please enter a Relation", 
                },
                fatherfirstname : 
				{
					required : "Please enter a First Name",     
                },
                fatherlastname : 
				{
					required : "Please enter a Last Name",     
                },
                motherfirstname : 
				{
					required : "Please enter a Last Name",     
                },
                motherlastname : 
				{
					required : "Please enter a Last Name",     
                },
                
                
        }		
		
  });
});
});
