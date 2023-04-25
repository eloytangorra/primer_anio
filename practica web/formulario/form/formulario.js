"use strict";
 
let pedidos = [];
let descuentoAplicado = false;
 
let form = document.querySelector("#form_cerveza");
let vaciar = document.querySelector("#btn_vaciar");
let formCupon = document.querySelector("#form_cupon");
let total = document.querySelector("#precio_total");

form.addEventListener("submit",agregar);
vaciar.addEventListener("click",vaciarCarrito);
formCupon.addEventListener("submit",aplicar);
 
//funcion agregar para agregado de formulario
function agregar(e) {
   e.preventDefault(); //previene evento tipo submit
   let formData = new FormData(form);
   let cerveza = formData.get("cerveza");
   let cantidad = formData.get("cantidad");
 
   let totalPedidas = calcularCantidadCervezas();
   // lo importante es la validacion de la cantidad
 
 
   if (cantidad > 1 && cantidad < 10 && (totalPedidas + cantidad) <= 20) {
       let pedido = {
           'cerveza' : cerveza,
           'cantidad': cantidad,
       }
       pedidos.push(pedido);
       imprimir();
   } else {
        alert("no se puede cargar su pedido");
       //esto esta bien porque no esta especificada la notificacion al usuario
      }
   }
    
   function vaciarCarrito(e) {
      // aqui no es necesario el preventDefault
      let tBody = document.querySelector('#lista_pedido tbody');
      tBody.innerHTML = '';
      total.innerHTML = 0;
      pedidos = [];
      
   }
    
   function aplicar(e) {
      e.preventDefault(); // aqui si por el evento submit
      let formData = new FormData(formCupon);
      if (formData.get('cupon') == 'tudai2022') { // && !aplicadoDescuento 
          aplicadoDescuento = true;
      }
    
      actualizar(); // pueden borrar todo e imprimir de vuelta
    
   }
    
   function calcularCantidadCervezas() {
      let sum = 0;
      for (let index = 0; index < pedidos.length; index++) {
         sum += pedidos[index].cantidad;  
      }
      return sum;
   }
    
   function actualizar() {
    // imprimen la tabla de alguna manera, primero la vacian
     // CUALQUIER CODIGO PARA IMPRIMR LA TABLA 
    
     let cantidad = calcularCantidadCervezas();
     let totaluser = cantidad * 400;
     if (descuentoAplicado == true)
      total -= 200;
    total.innerHTML = totaluser;
   }
   