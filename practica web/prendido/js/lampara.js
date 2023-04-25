document.getElementById("btn-prender").addEventListener("click", prender);
document.getElementById("btn-apagar").addEventListener("click", apagar);

function prender(){
    //cambiar la foto
    document.getElementById("img-lampara").src="imagenes5/prendida.png";

    //cambiar el fondo de color
    document.getElementById("fondo").classList.add("prendido");
}

function apagar(){
    document.getElementById("img-lampara").src="imagenes5/apagada.png";
    document.getElementById("fondo").classList.add("apagado");

}

