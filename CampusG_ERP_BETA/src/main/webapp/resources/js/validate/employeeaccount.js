 $(document).ready(function(){
	 
$(function() {

   $("#experience").validate({
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
         	},
        	
        	accountNumber : 
				{
                        required : true
                },
                accountType : 
				{
                        required : true
                },
                branchName : 
				{
                        required : true     
                },
                bankName :{
                	
                	required : true
                },
                ifscCode :{
                	
                	required : true
                },
	
        },
        messages : {
        	
        	accountNumber : 
				{
					required : "Please enter a Account Number",     
                },
                accountType : 
				{
                	required : "Please enter a Account Type", 
                },
                branchName : 
				{
                       required : "Please enter a Branch Name ",   
                },
                bankName :{
                	
                	required :"Please enter a Bank Name",
                },
                ifscCode :{
                	
                	required : "Please enter a IFSC code",
                	
                },
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
