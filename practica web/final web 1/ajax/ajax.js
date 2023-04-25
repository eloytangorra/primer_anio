"use strict"
const url ='https://62bd990fc5ad14c110c27a9b.mockapi.io/api/usuarios';
let id =0;

async function obtenerdatos(){
    const lista =document.querySelector("#lista");
    lista.innerHTML='';
    try {
        let res = await fetch(url);
        let json =await res.json();
        console.log(json);
        for(let usuarios of json){
            let nombres =usuarios.nombre;
            let telefono = usuarios.telefono;
            lista.innerHTML+=`<li>nombre :${nombres} ${telefono}</li>`;
        }
    } catch (error) {
        
    }
}
async function enviardato(){
    let nombre=document.querySelector("#nombre").Value;
    let telefono =document.querySelector("#telefono").value;

    let usuario={
        "nombre":nombre,
        "telefono":telefono
    };
    try {
        let res= await fetch(url,{
            "method":"POST",
            "headers":{"content-type":"application/json"},
            "body":JSON.stringify(usuario)
        });
        if(res.status===201){
            document.querySelector("#texto").innerHTML="creado";
        }
    } catch (error) {
        
    }
}
async function modificarultimo(){
    let nombre=document.querySelector("#nombre").Value;
    let telefono =document.querySelector("#telefono").value;
    let usuario={
        "nombre":nombre,
        "telefono":telefono
};
try {
    let res =await fetch(url+"/"+id,{
          "method":"PUT",
          "headers":{"content-type":"application/json"},
          "body":JSON.stringify(usuario)

    });
    if(res.status===20){
        document.querySelector("#texto").innerHTML="modificado";
    }
} catch (error) {
    
}
}
async function borrarultimo(){
    try{   
    let res = await fetch (url+"/"+id,{
        "method":"DELETE"
    });
    if (res.stattus===200) {
        document.querySelector("#texto").innerHTML="eliminado";
    };
} catch(error){

    }
}
obtenerdatos();
document.querySelector("#enviar").addEventListener("click", enviardato);
document.querySelector("#modificar").addEventListener("click", modificarultimo);
document.querySelector("#borrar").addEventListener("click", borrarultimo);