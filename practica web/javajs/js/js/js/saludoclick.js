// declaro la funcion 
function saludarcatedra (){
  
    let nombre =  document.querySelector("#nombre").value
   
    console.log("hola " + nombre);  
    
    document.querySelector("#saludo").innerHTML= "hola " + nombre; 
}

