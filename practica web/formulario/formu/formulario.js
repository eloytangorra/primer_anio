"use strict"
//recuperatorio
let pedidos=[]
let descuentoaplicado=false;

let form =document.querySelector("#form_cerveza");
let vaciar =document.querySelector("#btn_vaciar");
let formcupon=document.querySelector("#form_cupon");
let total=document.querySelector("#precio_total");

form.addEventListener("click",agregar);
vaciar.addEventListener("click",vaciar);
formcupon=addEventListener("click",aplicar);

function agregar(e){
    e.preventDefault();
    let formData=new FormData(form);
    let cerveza=data.get('cerveza');
    let cantidad=data.get('cantidad');
    let totalpedidos = calcularCantidadCervezas();
    if(cantidad>1&&cantidad<10(totalpedidos + cantidad)<=20){
   let pedido={
    'cerveza':cerveza,
    'cantidad':cantidad
   };
   pedidos.push(pedido);
   imprimir();
    }
else{
    alert("el pedido no se pudo cargar");
}
}
function vaciar(){
    let tabla=document.querySelector("#listapedido");
    tabla.innerHTML="";
    total.innerHTML=0;
    pedidos=[]
}

function aplicar(e){
    e.preventDefault();
    let formdata=new FormData(formcupon);
    if(data.get("cupon")=='tudai2022'){
        descuentoapliado=true;
    }
actualizar();
}
function actualizar(){
    let cantidad=calcularCantidadCervezas;
    let total=cantidad*400;
    if(descuentoaplicado&&total>=200){
        total -=200;
        total.innerHTML=total;
    }
}
function calcularCantidadCervezas(){
    let suma=0;
    for(let i=0;i<pedidos.length;i++){   
    suma +=pedidos[i].cantidad;
}
return suma;
}







let conteiner = document.querySelector("#contenedor_cotizacion");
let formu=docuemnt.querySelector("#form_cotizador");

//parcial
formu.addEventListener("submit", cotizar);
function cotizar(e){
    e.preventDefault();
    let formData = new FormData(formu);
    let nombre = data.get('nombre');
    let nroserie=data.get('nroserie');
    let valor =data.get('valor');
    let tipo =data.get('tipo');
   
    let cuota =0;
    if(tipo==rotura){
        cuota =valor *0.1/100;
    }
    else(tipo==robo){   
        cuota=valor*0.2/100;
    }
    conteiner.innerHTML=`
    <p>nombre:${nombre}</P>
    <p>nombre:${nroserie}</P>
    <p>nombre:${valor}</P>
    <p>nombre:${tipo}</P>
    `
}

