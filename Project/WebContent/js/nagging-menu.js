$(function(){
	
	var menu = $('#menu'),
		pos = menu.offset();
		
		
				
				menu.fadeOut('fast', function(){
					$(this).removeClass('default').addClass('fixed').fadeIn('fast');
				});
		
});