let nombre= prompt("ingrese su nombre");

console.log(nombre);

let edad= prompt("ingrese su edad")

let nodo = document.querySelector("#saludo");
nodo.innerHTML= "hola " + nombre  +  " de " + edad ;