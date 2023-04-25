"use strict"
let participantes = [];
let form =document.querySelector("#form_registro");
let sorteo =document.querySelector("#btn_sortear");
let lista =document.querySelector("#lista_sorteo");
let aviso = document.querySelector("#aviso_ganador");

form.addEventListener("submit",registrar);
sorteo.addEventListener("click",sortear);

function registrar (e){
    e.preventDefault();
    let formdata=new FormData(form);
    let nombre = formdata.get('nombre');
    let dni = formdata.get('dni');
    let edad =formdata.get('edad');
    if (edad >=18){
        let persona ={
            'nombre':nombre,
            'dni': dni,
            'edad':edad,
        }
        }else{
         alert ("no se pudo registrar el usuario porque es menor de edad");
        }
        participantes.push(persona);
    }
    
    function sorteo(){
        mostrarparticipantes();
        let ganador =Math.floor(participantes.length*Math.random());
        aviso.innerHTML="<P>energizer -beber con moderacion</p>";
        aviso.innerHTML+="<p>EL GANADOR ES :"+participantes[ganador].nombre+""+participantes[ganador].dni+""+
        participantes[ganador].edad+"</P>";
        if(participantes[ganador].edad <21){
            aviso.innerHTML+="<p>el ganador debera ir acompañado de un adulto para retirar el premio</P>";

        }
    }
    
    function mostrarparticipantes(){
        for(let i of participantes){
            lista.innerHTML= "<li>"+i.nombre+""+i.dni+"</li>";
        }
    }
