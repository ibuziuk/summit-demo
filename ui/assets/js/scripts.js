function fetchMessage() {
    $.ajax({
        url: "http://localhost:8081/custom"
    }).then(function(data, status, jqxhr) {
       alert(status);
       $('.message').append(data);
       console.log(jqxhr);
    });
}


function httpGet(theUrl) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open( "GET", theUrl, false ); // false for synchronous request
    xmlHttp.send( null );
    return xmlHttp.responseText;
}


$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8081/custom"
    }).then(function(data, status, jqxhr) {
       alert(status);
       $('.message').append(data);
       console.log(jqxhr);
    });
});