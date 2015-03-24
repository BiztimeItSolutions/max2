$(document).ready(function(){

$.ajax({
	    type:"GET",
	     
	    url:"get_receipt_book.html",
	    dataType:"html",

	    success:function(data)
	            {
	            
	            console.log(data);
	            var a=data.slice(1, -1);
	            var b=a.split(',');
	            $('#receiptName').empty();
	            
	            $('#receiptName').append($('<option>', { 
			        value: " ",
			        text : "Select Receipt Book " 
			    }));
	         
	            for(var l in b)
	            {
	            	$('#receiptName').append($('<option>', { 
				        value: b[l],
				        text : b[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});

$('#receiptName').change(function(){
	//to get the selected value in the department drop down
	var selecteditem = $("#receiptName option:selected")
	.text();
console.log("selected item from receiptName: " + selecteditem);
	
$.ajax({
    type:"GET",
    dataType: "json",
    url:"get_fee_type.html",
    data : {
		"selecteditem" : selecteditem

	       },

	       
 success:function(data)
            {
	 		console.log("returned in ajax: "+data);
	        $('#dataTables-example').find('tbody').empty();
            var tableData="";
            $.each(data.feeType, function(index, element) {
				//make table body
				
				tableData = tableData + "<tr>" + "<td>" + "<input type='checkbox' name='"+element.feeName+"' value='"+element.amount+"' id='addAmount'> "+element.feeName
						+ "</td>" + "<td>" + element.amount + "</td>"
						+ "</tr>";

			});
            	$('#dataTables-example').find('tbody').append(tableData);
            },

    error:function(){
            alert("receipt type failed");
    },
});	
});	
$(document).on('click', '[id=addAmount]', function() {
	var total=Number($("#amount").val());
	 if( $(this).is(':checked'))  //  or  this.checked
     {
    	 total=total+Number($(this).val());
		 $("#amount").val(total);
	 }else{
			total=total-Number($(this).val());
		 $("#amount").val(total);
	 }

});




	
	$('#receiptName').change(function(){
		//to get the selected value in the department drop down
		var selecteditem = $("#receiptName option:selected")
		.text();
	console.log("selected item from receiptName: " + selecteditem);
		
	$.ajax({
	    type:"GET",
	     
	    url:"get_mode_of_payment.html",
	    dataType:"html",
	    data : {
			"selecteditem" : selecteditem

		       },

	    success:function(data)
	            {
	    		
	            var a=data.slice(1, -1);
	            
	            var c=a.split(',');
	            
	            $('#paymentName').empty();
	            $('#paymentName').append($('<option>', { 
			        value: " ",
			        text : "Select Mode Of Payment" 
			    }));
	            for(var l in c)
	            {
	            	$('#paymentName').append($('<option>', { 
				        value: c[l],
				        text : c[l] 
				    }));
	            }
	            
	            
	            },

	    error:function(){
	            alert("failed");
	    },
	});	
	});	

});


function updateTextArea(){
	
	var allVals = [];
    $('#mydiv :checked').each(function () {
        allVals.push($(this).attr("name"));
    });
    $('#txtValue').val(allVals);
}

	
	
	

