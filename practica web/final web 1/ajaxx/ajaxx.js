"use strict"
let url = "https://unicen/";
let id = 0;
let lista = document.querySelector("#lista");
lista.innerHTML = '';

async function consultar(){
    try {
        let res =await fetch(url);
        let json =await res.json()
        console.log(json);
        for(let i of json){
            let nombre=i.nombres;
            lista.innerHTML+="<li>${nombres}</li>";
        }
    } catch (error) {
        console.log(error);
    }
}

async function agregar(){
    let nombre=document.querySelector("#nombre").value;

    let jugador ={
        "nombre":nombre
    };
    try {
        let res = await fetch (url,{
            "method":"POST",
            "headers":"{content-type:applications/json",
            "body":JSON.stringify(jugador)
        });
        if(res.status===201){
            console.log("dato enviado correctamente");
        }
    } catch (error) {
        console.log(error);
    }
}

async function borrar(){
    try {
        let res = await fetch(url+"/"+id,{
            "method":"DELETE"
        });
        if(res.status===200){
            console.log("el juagador fue eliminado");
        }
    } catch (error) {
        console.log("error")
    }
    
}
async function modificar (){
    let nombre=document.querySelector("#nombre").value;
    let jugador={
        "nombre":nombre
    };
    try {
        let res =await fetch (url+"/"+id,{
            "method":"PUT",
            "headers":{"content-type":"applications/json"},
            "body":JSON.stringify(jugador)
        });

        if (res.status===201) {
            console.log("modificado correctamente");
        }
    } catch (error) {
        console.log("error");
    }
}
let modificar=document.querySelector("#modificar").addEventListener("click",modificar);
let borrar = document.querySelector("#eliminar").addEventListener("click",borrar);
let agregar =document.querySelector("#agregar").addEventListener("click",agregar);
consultar();

//1. Escriba el código para agregar al servicio REST un
//dato fijo:
//"nombre": "Martina Lopez",
//" dni": 39512314
//2. Escriba el código para consultar el servicio REST y
//mostrar por consola el dni de las personas censadas y
//la cantidad de personas que fueron censadas.

async function  agregarnombre(){
    let persona={
        "nombre": "Martina Lopez",
          " dni": 39512314
    };
    try {
        let res =await fetch (url,{
            "method":"POST",
            "headers":{"content-type":"applications/json"},
            "body":JSON.stringify(persona)
        });
        if(res.stattus===200){
            console.log("#creado");
        }
    } catch (error) {
        console.log("error");
    }

}
async function senco(){
    try {
        let res = await fetch (url);
        let json =await res.json()
        console.log("cantidad de personas censadas"+json)
        for(let i of json){
            console.log(i.dni);
        }
        } catch (error) {
        console.log ("error")
    }
}