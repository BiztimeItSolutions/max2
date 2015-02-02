jQuery(document).ready(function() {
    var content_height = jQuery(".column-right").height(); // Get height of main content
    jQuery(".subnav").height(content_height); // Apply height to menu div
    
    jQuery('a.forward').next().hide(); // Hide all children from the menu
    
    jQuery('ul.forward').next().hide();
    
    jQuery('a.forward').click(function(e) { // On click .forward
        e.preventDefault();
        
        // Clone next child, append to container, position absolute and animate left
        jQuery(this).next().clone(true, true).appendTo(".subnav").css({position: "absolute", left:"", top:"0", display:""}).animate({
            left:"0"
        }, 300);
        
        // Animate current menu out sight
        jQuery(this).closest("ul").animate({
            left:"-300px",
        }, 300);
        
        return false;
    });
    
    jQuery('a.back').click(function(e) { // On click .back
        e.preventDefault();
        
        // Animate the previous hidden element so it comes back
        jQuery(this).closest("ul").prev().animate({
            left:"0",
        });
        
        // Animate current menu out of sight to the right
        // and remove after animation is completed
        jQuery(this).closest("ul").animate({
        	/*left:"250px",*/
        }, /*300*/ "linear",function(){jQuery(this).remove()});
        return false;
    });
});