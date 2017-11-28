// A $( document ).ready() block.
$( document ).ready(function() {

	console.log("hello")

	//on initialise les modals
	$('.modal').modal();
	
	console.log(window.location.href);
	$('#mainDesktopNavbar').css('display', 'none')

});

function startDemo(){
	showNavbar();
	openTapTarget()
}

function showNavbar(){
	$('#mainDesktopNavbar').css('display', 'block')
}

function openTapTarget(){
	$('.tap-target').tapTarget('open');	
	tapDialog("whoop","here will go some description")
}

function closeTapTarget(){
	$('.tap-target').tapTarget('close');	
}

function tapDialog(title,text){
	$('#tapTitle').text(title);	
	$('#tapText').text(text);	
}