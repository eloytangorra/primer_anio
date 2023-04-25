"use strict"
/*
Escribir el código de Javascript para cumplir los siguientes requerimientos:
- Se deben ir registrando los usuarios que se van inscribiendo a través del formulario, con el
requerimiento que los usuarios deben ser mayores de 18 años y no pueden inscribirse más de una
vez.
- Luego que se oprime el botón Sortear se debe mostrar un listado con los nombres y dni de cada
uno de los participantes registrados en el sorteo.
6
- Al oprimir Sortear, el ganador debe ser evaluado al azar entre el total de las personas registradas y
deben mostrarse los datos del ganador en la página (nombre, edad y dni).
- El aviso del ganador debe aparecer con letra verde acompañado del texto “PowEnergy - Beber con
moderación”. En el caso que el ganador sea menor de 21 años se debe mostrar el aviso del
ganador con letra de color rojo e indicando además un texto que anuncie “Para retirar el premio el
gandor debe ir acompañado de un mayor de 21 años”.
*/
let participantes =[];
let form = document.querySelector("#form_registro");
let sorteo =document.querySelector("#btn_sortear");
let container = document.querySelector("#aviso_ganador");
let lista=document.querySelector("#lista_sorteo");

form.addEventListener("submit", registrar);
sorteo.addEventListener("click", sortear );

function registrar (e){
    e.preventDefault();
    let formdata =new FormData(form);

    let nombre =formdata.get('nombre');
    let dni = formdata.get('dni');
    let edad =formdata.get('edad');

    let persona ={
        'nombre':nombre,
        'dni':dni,
        'edad':edad
    }
   if (edad>18){
    participantes.push(persona);
   

   }else{
    alert("no se pudo cargar el pedido")
   }
   
}
function sortear(){
    mostrarparticipantes();
    let indexganador = Math.floor(participantes.length*Math.random());
    container.innerHTML="<p>powenergy -beber con moderacion</P>";
    container.innerHTML+="<p>El ganador es: " + participantes[indexganador].nombre +
    " " +
    participantes[indexganador].dni + " " + participantes[indexganador].edad + "</p>";
    if(participantes[indexganador].edad < 21) {
    avisoGanador.innerHTML += "<p>Para retirar el premio el ganador debe ir acompañado de un mayor de 21 años</p>";
    }
    
    

}
function mostrarparticipantes (){
for (let i of participantes){
    lista.innerhtml+=
    "<li>" + i.nombre + " " + i.dni + "</li>";
}
}


