"use strict"
let participantes=[];
let form =document.querySelector("#form_registro");
let sortear=document.querySelector("#btn_sortear");
let lista =document.querySelector("#lista_sorteo");
let mensaje =document.querySelector("#aviso_ganador");
let vaciar =document.querySelector("#vaciar");

form.addEventListener("submit",registrar);
sortear.addEventListener("click",sorteo);
vaciar.addEventListener("click",vaciar);
function registrar(e){
    e.preventDefault();
    let formdata=new FormData(form);
    let nombre=formdata.get("nombre");
    let dni = formdata.get("dni");
    let edad = formdata.get("edad");

    if(edad>=18){
        let persona ={
            "nombre":nombre,
            "dni":dni,
            "edad":edad
        };
        participantes.push(persona);
    }else{
        alert("el usuario no se pudo cargar por ser menor de edad");
    }
}
function sorteo(){
    mostrarlista();
    let g =Math.floor(participantes.length*Math.random());
    mensaje.innerHTML="<p>pow energy-beber con moderacion</p>";
    mensaje.innerHTML+="<p>el ganador es :"+ participantes[g].nombre+participantes[g].edad+participantes[g].dni+"</p>"
    if (edad<21){
        mensaje.innerHTML+="<p> el ganador debera ser acompañado de un mayor de 21 años para retirar el premio</P>";
    }
}
function mostrarlista(){
    for(let i of participantes){
        lista.innerHTML+="<li>"+ i.nombre + i.edad+"</li>";
    }
}
function vaciar(){
    participantes =[];
   mensaje.innerHTML ='';
   lista.innerHTML='';
}