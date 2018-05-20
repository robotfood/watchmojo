var DEBUG_MODE_ON = true;

if (!DEBUG_MODE_ON) {
    console = console || {};
    console.log = function(){};
}

$(document).ready(function () {
    $("#pButton, #audio-wrapper").click(function () {
        console.log("pButton clicked");
        var previousId = $(this).prev().attr('id');
        console.log("preivous element is " + previousId);
        playAudio(previousId);
    });
});

function playAudio(previousId) {
    $("#"+previousId).get(0).play();
}