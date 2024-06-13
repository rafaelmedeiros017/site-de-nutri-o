$('.slider-principal').slick({
dots: true,
infinite:true,
spped:300,
slidestoshow:3,
adaptiveheight:true,
autoplayspeed:2000

});
let cout=1;
document.getElementById("slider-principal").checked=true;
setInterval(function(){
    nextimage();
},2000)
function nextimage(){
    cout++;
    if(cout>3){
        cout=1;
    }
    document.getElementById("slider-principal"+cout).checked=true;
}
