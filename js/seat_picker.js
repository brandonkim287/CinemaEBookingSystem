  $( function() {
    $( "#selectable" ).selectable();
  } );


// function addItem(){
// 	let selected = document.getElementsByClassName('ui-selected')
// 	for (var i = selected.length - 1; i >= 0; i--) {
// 		let seat = selected[i].textContent;
// 		let showtime = document.getElementById('showtime')
// 		document.getElementById('cart').html+='<tr><td>Annihilation</td><td>'+showtime+'</td><td><select><option>Adult</option><option>Child</option><option>Senior</option></select></td><td>'+seat+'</td></tr>'
// 	}
// }
function addItem(){
	let selected = document.getElementsByClassName('ui-selected')
	for (let i = 0; i <selected.length; i++) {
		let table = document.getElementById('cart')
		let row = table.insertRow(i)
		let seatText = selected[i].textContent;
		let showtimeText = $('#showtime').find(":selected").text();

		let movie =row.insertCell(0)
		let showtime = row.insertCell(1)
		let age = row.insertCell(2)
		let seat = row.insertCell(3)

		movie.innerHTML = "Annihilation"
		showtime.innerHTML = showtimeText
		age.innerHTML = "<select class=\"form-control\"><option>Adult</option><option>Child</option><option>Senior</option>"
		seat.innerHTML = seatText

	}
}

function clearSelected(){
	$('#cart').empty()
}
