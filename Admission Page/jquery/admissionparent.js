
		 
$(function() {

   $("#form").validate({
        rules : {
        	
        	
        	
        	
        	name : 
			{
                    required : true     
            },
            first_name : 
				{
                        required : true
                },
                last_name : 
				{
                        required : true
                },
                relation : 
				{
                        required : true     
                },
                date : 
				{
                        required : true     
                },
				
				email: 
          {
            required: true,
            email: true
          }
				
        },
        messages : {
        	name : 
			{
			required : "Please enter a Admission No", 
			},
                first_name : 
				{
				required : "Please enter a First Name", 
				},
				 last_name : 
					{
					required : "Please enter a Last Name", 
					},
					 relation : 
						{
						required : "Please enter a Relation", 
						},
					
					 date : 
						{
						required : "Please select a Date Of Birth", 
						}
						 
				
        }
		
		
  });
});

