"use strict"
let form =document.querySelector("#form_cotizador");
let conteiner=document.querySelector("#contenedor_cotizacion");
form.addEventListener("submit",cotizar);
function cotizar(e){
    e.preventDefault();
    let formdata = new FormData(form);
    let cliente =formdata.get('cliente');
    let dominio =formdata.get('dominio');
    let valor =formdata.get('valor');
    let tipo =formdata.get('tipo');

    let cuota =0;
    if(tipo==tercero){
        cuota=valor*0.5/100;
    }
    else{
        cuota =valor*1/100;
    }
    conteiner.innerHTML=`
    <p>nombre:${cliente}</p>
    <p>patente:${dominio}</p>
    <p>valor:${valor}</P>
    <p>tipo:${tipo}</p>
    `
}