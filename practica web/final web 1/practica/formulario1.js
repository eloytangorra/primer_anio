"use strict"
let container = document.querySelector(".contenedor");
let form = document.querySelector("#formulario")
form.addEventListener("submit",enviardatos);

function enviardatos(e){
    e.preventDefault();
    
    let formdata = new FormData(form);
    let nombre =formdata.get("nombre");
    let apellido=formdata.get("apellido");
    let email=formdata.get("email");

    container.innerHTML=`
    <p>nombre:${nombre}</p>
    <p>apellido:${apellido}</p>
    <p>email:${email}</p>
    `
    ;
}