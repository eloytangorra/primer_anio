"use strict";
let btn=document.querySelector("#btn");
btn.addEventListener("click", confirmar);
let valor1 = document.querySelector("#numero1");
let valor2 = document.querySelector("#numero2");
let usuario= document.querySelector("#input");
let mensaje= document.querySelector("#mensaje");


let num1 = Math.floor(Math.random()*10);
let num2 = Math.floor(Math.random()*10);
valor1.innerHTML = num1;
valor2.innerHTML = num2;




function confirmar(){
    
    if((num1 + num2)== usuario.value){
        mensaje.innerHTML = "captcha valido"
    }
    else{
        mensaje.innerHTML = "vuelva a intentarlo"
    }
    

}
