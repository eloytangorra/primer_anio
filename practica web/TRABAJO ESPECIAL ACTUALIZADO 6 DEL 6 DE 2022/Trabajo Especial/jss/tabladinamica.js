"use strict";
//event listener
document.querySelector('#btn_agregar').addEventListener("click",agregar);
//document.querySelectorAll('#btn_agregarx3').addEventListener("click",agregarx3);
document.querySelector('#btn_vaciar').addEventListener("click",vaciar);
document.querySelector('#btn_ultimo').addEventListener("click",borrarultimo);

let jugadores = [];
let goles = [];

function agregar(){
let jugador = document.querySelector('#jugador').value;
jugadores.push(jugador);
console.log(jugadores);
let gol = document.querySelector('#gol').value;
goles.push(gol);
console.log(goles);
}

function vaciar () {
jugadores = [];
goles = [];
console.log(jugadores);
console.log(goles);

}


function borrarultimo () {
    goles.pop();
    jugadores.pop();
    console.log(jugadores);
    console.log(goles);
}