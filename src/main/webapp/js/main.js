var username = new URL(location.href).searchParams.get("username");
var user;

$(document).ready(function () {

    $(function () {
        $('[data-toggle="tooltip"]').tooltip();
    });

    getUsuario().then(function () {
        
        $("#mi-perfil-btn").attr("href","profile.html?username=" + username);
        

        getPeliculas(false, "ASC");

  
    });
});


async function getUsuario() {

    await $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletUsuarioPedir",
        data: $.param({
            username: username
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                user = parsedResult;
            } else {
                console.log("Error recuperando los datos del usuario");
            }
        }
    });

}
function getPeliculas(ordenar, orden) {

    $.ajax({
        type: "GET",
        dataType: "html",
        url: "./ServletPeliculaListar",
        data: $.param({
            ordenar: ordenar,
            orden: orden
        }),
        success: function (result) {
            let parsedResult = JSON.parse(result);

            if (parsedResult != false) {
                mostrarPeliculas(parsedResult);
            } else {
                console.log("Error recuperando los datos de las peliculas");
            }
        }
    });
}


function mostrarPeliculas(peliculas) {

    let contenido = "";

    $.each(peliculas, function (index, pelicula) {

        pelicula = JSON.parse(pelicula);
       


       

            contenido += '<tr><th scope="row">' + pelicula.id + '</th>' +
                    '<td>' + pelicula.titulo + '</td>' +
                    '<td>' + pelicula.genero + '</td>' +
                    '<td>' + pelicula.duracion + '</td>' +
                    '<td>' + pelicula.pais + '</td>' +
                    '<td>'+ pelicula.direccion;
          

        
    });
    $("#peliculas-tbody").html(contenido);
}