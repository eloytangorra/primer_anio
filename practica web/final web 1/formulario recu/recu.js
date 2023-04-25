"use strict"
let descuento = flase;
let pedido=[];

let form= document.querySelector("#form_cerveza");
let formcupon=docuemnt.querySelector("#form_cupon");
let total =document.querySelector("#precio_total");
let vaciarcarrito = document.querySelector("#btn_vaciar");

form.addEventListener("submit",agregar);
vaciarcarrito.addEventListener("click", vaciar);
formcupon.addEventListener("submit", aplicar);

function agregar(e){
    e.preventDefault()
    let formdata =new FormData(form);
    let cerveza =formdata.get('cerveza');
    let cantidad =formdata.get('cantidad');
    let totalpedidas = calcularcantidad();

    if (cantidad >1 && cantidad < 10 (totalpedidas + cantidad)<=20){
        let pedido ={
            'cerveza': cerveza,
            'cantidad':cantidad,
        }
        pedidios.push(pedido);
        imprimir();
    }else{
        alert ("no se pudo cargar el pedido intente nuevamente");
    }

}
function vaciar (){
    let tabla = document.querySelector("#lista_pedido");
    tabla ='';
    total = 0;
    pedidos =[];

}
function aplicar(e){
    e.preventDefault();
    let formdata = new FormData(formcupon);
    if (formdata.get('cupon')=="tudai2022"){
        descuento=true;
    }
    actualizar();
}
function calcularcantidad(){
    let suma =0;
    for (let i =0; i<pedidos.lenght;i++){
        suma+= pedidos[i].cantidad;
    }
    return suma;
}
function actualizar(){
    let cantidad = calcularcantidad();
    let totalprecio = cantidad*400;
    if (desceunto && totalprecio>=200){
        total -=200;
    }
    total.innerhtml=totalprecio;
}
