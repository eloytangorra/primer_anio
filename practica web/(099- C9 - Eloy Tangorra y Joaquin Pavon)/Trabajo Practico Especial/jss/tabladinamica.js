"use strict:";



form = document.querySelector('form');
form.addEventListener('submit', adduser);
tabla = document.querySelector('#tabla');
console.log(tabla);
Agregartres=document.querySelector('#Agregartres');
Agregartres.addEventListener('click', crearTresUsuarios);
let borrar = document.querySelector('#borrar');
borrar.addEventListener('click', borrarTodo);

const users = [
    {
        name: 'Joaquin Pavon',
        documento: '39550783'
    },
    {
        name: 'Eloy Tangorra',
        documento: '38951159'
    }
];


function adduser(e) {
    e.preventDefault();
    let data = new FormData(form);

    let name = data.get('name');
    let documento = data.get('documento');

    let user = {
        name: name,
        documento: documento
    }
    users.push(user);
    console.log(users);
    viewusers()
    form.reset();
};


function viewusers() {
   
    let tablauser='';

    for (let user of users) {
    tablauser += `
            <tbody>
            <tr>
                <td>${user.name}</td>
                <td>${user.documento}</td>
            </tr>
        `;
         };
tabla.innerHTML = tablauser;
}

function crearTresUsuarios() {
    for (let i = 0; i < 3; i++) {
        let data = new FormData(form);

    let name = data.get('name');
    let documento = data.get('documento');

    let user = {
        name: name,
        documento: documento
    }
        users.push(user);
    }
    viewusers();
}

    
function borrarTodo() {
    users.length = 0;
    tabla.innerHTML = ``;
    viewusers();
}
viewusers();