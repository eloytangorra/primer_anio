"use strict"
let container =document.querySelector(".contenedor_cotizacion");
let form =document.querySelector("#form_cotizador");
form.addEventListener("submit", cotizar);

function cotizar(e){
    e.preventDefault();
    let formdata=new FormData(form);
    let cliente =formdata.get('cliente');
    let nroserie=formdata.get('nroserie');
    let valor =formdata.get('valor');
    let tipo =formdata.get('tipo');
    let cuota = 0;
    if (tipo === "robo") {
    cuota = valor * 0.1/100;
    } else {
    cuota = valor * 0.2/100;
    }
    container.innerHTML=`
    <p>cliente : ${cliente}</p>
    
    <p>dominio : ${nroserie}</p>

    <p>valor : ${valor}</p>

    <p>tipo : ${tipo}</p>

    <p>cuota mensual: : ${cuota}</p>
    `
}