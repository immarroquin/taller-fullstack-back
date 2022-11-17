$(document).ready(function() {
    cargarUsuarios();
    listarMonedas();
});

async function cargarUsuarios() {
      const request = await fetch('api/usuariosback', {
        method: 'GET',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }
      });
      const usuarios = await request.json();


    let listadoHtml = "";
    for (let usuario of usuarios) {
       let botonEliminar = '<button  onclick="eliminarUsuario(' + usuario.id + ')" >Eliminar</button>'
         let usuarioHtml = '<tr><th scope="row">'+usuario.id+'</th><td>'+usuario.nombre+'</td><td>'+usuario.email+'</td><td>'+usuario.idpais+'</td><td>'+botonEliminar+'</td></tr>'
     listadoHtml += usuarioHtml;
    }

     document.querySelector("#usuariostabla tbody").outerHTML = listadoHtml;


}

async function eliminarUsuario(id) {

  if (!confirm('¿Desea eliminar este usuario?')) {
    return;
  }
const request = await fetch('api/usuariosback/' + id, {
        method: 'DELETE',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json',
        }
      });

      location.reload()
 }

 async function listarMonedas() {
       const request = await fetch('api/monedasback', {
         method: 'GET',
         headers: {
           'Accept': 'application/json',
           'Content-Type': 'application/json',
         }
       });
       const monedas = await request.json();

     let listadoHtml = "";
     for (let moneda of monedas) {
          let monedasHtml = '<tr><th scope="row">'+moneda.id+'</th><td>'+moneda.simbolo+'</td><td>'+moneda.valor+'</td><td>'+moneda.nombre+'</td></tr>'
      listadoHtml += monedasHtml;
     }

      document.querySelector("#monedastabla tbody").outerHTML = listadoHtml;


 }