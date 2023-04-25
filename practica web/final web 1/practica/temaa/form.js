"use strict"
let container =document.querySelector(".contenedor_cotizacion");
let form = document.querySelector("#form_cotizador");
form.addEventListener("submit",cotizar);

function cotizar(e){
    e.preventDefault();
    let formdata =new FormData(form);
    let cliente = formdata.get('cliente');
    let dominio = formdata.get('dominio');
    let valor = formdata.get('valor');
    let tipo = formdata.get('tipo');

    let cuota =0;
    if(tipo == "terceros"){
        cuota +=valor*0.5/100;
    }else{
        cuota += valor*1/100;
    }
  
    container.innerHTML = `
    <p>cliente : ${cliente}</p>
    
    <p>dominio : ${dominio}</p>

    <p>valor : ${valor}</p>

    <p>tipo : ${tipo}</p>

    <p>cuota mensual: : ${cuota}</p>
    `


}