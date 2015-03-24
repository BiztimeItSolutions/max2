$(document).ready(function(){
	//alert("ready");
	
	
	var privileges=$("#privText").val();
    var privilegeArray=privileges.split(",");
    var liArray=$(".dyn").find("li");

        $.each(liArray,function(i,val){
           var lid=$(this).attr("id");
           var idx = $.inArray(lid, privilegeArray);
           if(idx == -1){
               $("#"+lid).hide();
            }else{
            	$("#"+lid).parents("li").show();
                 $("#"+lid).show();
            }

    });
	
	
	
	
});