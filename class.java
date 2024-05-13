

var input_nombre = document.getElementById("campo_nombre");
var input_mail = document.getElementById("campo_mail");
var input_tematica = document.getElementById("elegir_tematica");
var boton = document.getElementById("boton_form");


console.log(input_nombre);


boton.addEventListener("click", enviarFormulario);

function enviarFormulario (event){
    event.preventDefault();
    var valor_nombre = input_nombre.value;
    console.log(valor_nombre);
     
    var placeholder_nombre = document.getElementById("campo_nombre-placeholder");

    placeholder_nombre.innerHTML = valor_nombre;

    elemento_feedback = document.getElementById("feedback");
    elemento_feedback.classList.remove("oculto");

    elemento_feedback = document.getElementById("portada");
    elemento_feedback.classList.add("oculto");
    
    elemento_feedback = document.getElementById("parrafos");
    elemento_feedback.classList.add("oculto");

    elemento_feedback = document.getElementById("bullets");
    elemento_feedback.classList.add("oculto");

    elemento_feedback = document.getElementById("formulario");
    elemento_feedback.classList.add("oculto");

    elemento_feedback = document.getElementById("testers");
    elemento_feedback.classList.add("oculto");

    elemento_feedback = document.getElementById("divisor");
    elemento_feedback.classList.add("oculto");

    elemento_feedback = document.getElementById("divisor1");
    elemento_feedback.classList.add("oculto");   
}
