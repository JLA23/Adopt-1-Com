			
			
//Script pour les toggles			
$(document).ready(function() {
	$('.nav-toggle').click(function(){
		var collapse_content_selector = $(this).attr('href');					
		var toggle_switch = $(this);
		$(collapse_content_selector).toggle(function(){
			if($(this).css('display')=='none'){
				toggle_switch.html('Mes Produits');
			}else{
				toggle_switch.html('Mes Produits');
			}
		});
	});
});	
			
			
$(document).ready(function() {
	$('.nav-toggle2').click(function(){
		var collapse_content_selector = $(this).attr('href');					
		var toggle_switch = $(this);
		$(collapse_content_selector).toggle(function(){
			if($(this).css('display')=='none'){
				toggle_switch.html('Mes Promotions');
			}else{
				toggle_switch.html('Mes Promotions');
			}
		});
	});
});	

//Script pour les slidders
$(function(){
	setInterval(function(){
	$(".slideshow ul").animate({marginLeft:-450},1000,function(){
		$(this).css({marginLeft:0}).find("li:last").after($(this).find("li:first"));
		})
	}, 3500);
});

//Script pour la pop-up
$(document).ready(function() {
	
//Lorsque vous cliquez sur un lien de la classe poplight et que le href commence par #
$('a.poplight[href^=#]').click(function() {
	var popID = $(this).attr('rel'); //Trouver la pop-up correspondante
	var popURL = $(this).attr('href'); //Retrouver la largeur dans le href

	//Récupérer les variables depuis le lien
	var query= popURL.split('?');
	var dim= query[1].split('&amp;');
	var popWidth = dim[0].split('=')[1]; //La première valeur du lien

	//Faire apparaitre la pop-up et ajouter le bouton de fermeture
	$('#' + popID).fadeIn().css({
		'width': Number(popWidth)
	})
	.prepend('<a href="#" class="close"><img src="https://cdn3.iconfinder.com/data/icons/interface/100/close_button_1-256.png" width="55" height="55" class="btn_close" title="Fermer" alt="Fermer" /></a>');

	//Récupération du margin, qui permettra de centrer la fenêtre - on ajuste de 80px en conformité avec le CSS
	var popMargTop = ($('#' + popID).height() + 80) / 2;
	var popMargLeft = ($('#' + popID).width() + 80) / 2;

	//On affecte le margin
	$('#' + popID).css({
		'margin-top' : -popMargTop,
		'margin-left' : -popMargLeft
	});

	//Effet fade-in du fond opaque
	$('body').append('<div id="fade"></div>'); //Ajout du fond opaque noir
	//Apparition du fond - .css({'filter' : 'alpha(opacity=80)'}) pour corriger les bogues de IE
	$('#fade').css({'filter' : 'alpha(opacity=80)'}).fadeIn();

	return false;
});

//Fermeture de la pop-up et du fond
$('a.close, #fade').live('click', function() { //Au clic sur le bouton ou sur le calque...
	$('#fade , .popup_block').fadeOut(function() {
		$('#fade, a.close').remove();  //...ils disparaissent ensemble
	});
	return false;
});

});
