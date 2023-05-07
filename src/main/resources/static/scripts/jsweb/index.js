$(document).on("click", ".btn-editar", function(){
    $("#idAlumno").val($(this).attr("data-idalumno"));
    $("#nomAlumno").val($(this).attr("data-nomalumno"));
    $("#apeAlumno").val($(this).attr("data-apealumno"));
    $("#proce").val($(this).attr("data-proce"));
    $("#cboespecialidad").empty();
    var idestado = $(this).attr("data-idalumno");
    $.ajax({
        type: "GET",
        url: "/especialidades",
        dataType: "json",
        success: function(resultado){
            $.each(resultado, function(index, value){
                $("#cboespecialidad").append(
                    `<option value="${value.idEsp}">${value.nomEsp}</option>`
                )
            })
            $("#cboespecialidad").val(idEsp);
        }
    })
    console.log("entro");
    $("#modalNuevo").modal("show");
});

$(document).on("click", "#btnagregar", function(){
    $("#idAlumno").val("");
    $("#nomAlumno").val("");
    $("#apeAlumno").val("");
    $("#proce").val("");
    $("#cboespecialidad").empty();
    $.ajax({
        type: "GET",
        url: "/especialidades",
        dataType: "json",
        success: function(resultado){
            $.each(resultado, function(index, value){
                $("#cboespecialidad").append(
                    `<option value="${value.idEsp}">${value.nomEsp}</option>`
                )
            })
        }
    })
    $("#modalNuevo").modal("show");
});

$(document).on("click", ".btneliminar", function(){
    var idalumno = $(this).attr("data-idalumno");
    $.ajax({
        type: "DELETE",
        url: "/eliminar",
        contentType: "application/json",
        data: JSON.stringify({
            IdAlumno: idalumno
        }),
        success: function(resultado){
            if(resultado.respuesta){
                location.reload();
            }
            alert(resultado.mensaje);
        }
    });
});







$(document).on("click", "#btn-guardar", function(){
    var request = {
        idAlumno: $("#idAlumno").val(),
        apeAlumno: $("#apeAlumno").val(),
        nomAlumno: $("#nomAlumno").val(),
        idEsp: $("#cboespecialidad").val(),
        proce: $("#proce").val()
    };
    $.ajax({
        type: "POST",
        url: "/guardar",
        contentType: "application/json",
        data: JSON.stringify(request),
        success: function(resultado) {
            alert(resultado.mensaje);
            $("#modalNuevo").modal("hide");
        },
        error: function(jqXHR, textStatus, errorThrown) {
            alert("Error al registrar la Alumno: " + errorThrown);
        }
    });
});
