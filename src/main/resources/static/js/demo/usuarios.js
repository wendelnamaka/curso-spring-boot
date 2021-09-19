// Call the dataTables jQuery plugin
$(document).ready(function() {

  carregarUsuarios();
  $('#usuarios').DataTable();
});

async function carregarUsuarios(){

  const request = await fetch('usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const usuarios = await request.json();

    let listadoHtml = '';
    for(let usuario of usuarios){

  let usuarioHtml = '<tr><td>'+usuario.id+'</td><td>'+usuario.nome+' '
  +usuario.apelido+'/td><td>'
  +usuario.email+'</td><td>'
  +usuario.telefone+'</td><td><a href="#" class="btn btn-danger btn-circle"><i class="fas fa-trash"></i></a></td></tr>';

    listadoHtml += usuarioHtml;

  }

document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

}