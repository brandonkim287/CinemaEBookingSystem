
// jquery ui datepicker
$( function() {
    $( "#date").datepicker();
});

function appendShowtime(){
    let date = document.getElementById('date').value
    let time = document.getElementById('time').value
    if(document.getElementById('movieShowtimes').value == ''){
        document.getElementById('movieShowtimes').value+=date + ' ' + time    
    } else {
        document.getElementById('movieShowtimes').value+=', '+date + ' ' + time    
    }
}

