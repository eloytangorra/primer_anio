"use strict:";
console.log(tabla);

const url='https://62bc8ea66b1401736cfcf32d.mockapi.io/api/usuarios';
let id =0;

async function obtenerdatos(){
    const tabla = document.querySelector("#tabla");
    tabla.innerHTML="";

try {
    let res = await fetch(url);
    let json=await res.json();
    console.log(json);
for(let usuarios of json){
    let nombre =usuarios.nombre;
    let documento=usuarios.documento;
    id =usuarios.id;
    tabla.innerHTML+=`
    <tr>
    <td>${nombre}</td>
    <td>${documento}</td>
    <td><button  data-id=${id} class="btn-editar" type="button">editar</button>
    <button  data-id=${id} class="btn-eliminar" type="button" >eliminar</button></td>
    </tr>`
    let botoneseliminar=document.querySelectorAll(".btn-eliminar");
    for(let buttonb of botoneseliminar){
        buttonb.addEventListener('click',eliminar);
    }
    let botoneseditar=document.querySelectorAll(".btn-editar");
    for(let buttone of botoneseditar){
        buttone.addEventListener('click',editar);
    }
}
} catch (error) {
    
}
}
async function editar(e){
    e.preventDefault();
    let nombre=document.querySelector("#nombre").value;
    let documento=document.querySelector("#documento").value;
    let id = this.dataset.id;
    let usuarios={
        "nombre":nombre,
        "documento":documento
    };
    
    try {
        let editar =await fetch(`${url}/${id}`,{
            "method":"PUT",
            "headers":{"content-type":"application/json"},
            "body":JSON.stringify(usuarios)
        });
            if(editar.status===200){
                console.log("editado");
            }
    } catch (error) {
        console.log(error);
    }
    obtenerdatos();
}
async function eliminar(e){
    e.preventDefault();
    let id =this.dataset.id;
    try{
        let borrar =await fetch(`${url}/${id}`,{
            "method":"DELETE"});
            if(borrar.status===200){
                console.log("borrado");
            }
        }
        catch(error){
            console.log(error);
        }
        obtenerdatos();
    }
async function agregardatos(){
    let nombre=document.querySelector("#nombre").value;
    let documento=document.querySelector("#documento").value;
    let usuarios={
        "nombre":nombre,
        "documento":documento
    };
    try {
        let res=await fetch(url,{
            "method":"POST",
            "headers":{"content-type":"application/json"},
            "body":JSON.stringify(usuarios)
        });
        if(res.status===201){
            console.log("creado")
            
        }
    } catch (error) {
        console.log(error);
    }
    obtenerdatos();
}

async function agregardatosx3(){
   
    let nombre=document.querySelector("#nombre").value;
    let documento=document.querySelector("#documento").value;
    let usuarios={
        "nombre":nombre,
        "documento":documento
    };
   for (let i = 0; i < 3; i++ ) { try {
        let res=await fetch(url,{
            "method":"POST",
            "headers":{"content-type":"application/json"},
            "body":JSON.stringify(usuarios)
        });
        if(res.status===201){
            console.log("creado")
            
        }
    } catch (error) {
        console.log(error);
    } }
    obtenerdatos();


}
document.querySelector("#Agregartres").addEventListener('click', agregardatosx3);
document.querySelector("#enviar").addEventListener('click',agregardatos);
obtenerdatos();


