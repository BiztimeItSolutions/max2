 $(document).ready(function(){

	 
	 
$(function() {

   $("#empexperiencedetails").validate({
        rules : {
        	
    previousEmployeeId : 
				{
                        required : true
                },
                organizationName : 
				{
                        required : true
                },
                previousDesignation : 
				{
                        required : true
                        
                },
                startDate : 
				{
                        required : true
                },
                endDate : 
				{
                        required : true
                },
                yearsOfExperience : 
				{
                        required : true
                },
                university :
                	{
                	required : true
                	},
                designation : 
				{
                        required : true
                },
                department : 
				{
                    required : true
            },
            dateOfJoin :
            	{
            	required : true
            	}
                
              
        	
        },
        messages : {
        	
        
                
        	previousEmployeeId : 
				{
					required : "Please enter a ID",     
                },
                organizationName : 
				{
                	required : "Please enter a Organization", 
                },
                previousDesignation : 
				{
                	required : "Please enter a previous designation", 
                },
                startDate : 
				{
					required : "Please select a start date",     
                },
                endDate : 
				{
					required : "Please select a end date",     
                },
                yearsOfExperience : 
				{
					required : "Please enter a years of experience",     
                },
                designation : 
				{
					required : "Please enter a current designation",     
                },
                department : 
				{
					required : "Please enter a current department",     
                },  
                university : 
				{
					required : "Please enter a University Name",     
                },
                dateOfJoin :
                	{
                	required : "Please select a Date of Join",
                	}
                
                
        }		
		
  });
});
});
