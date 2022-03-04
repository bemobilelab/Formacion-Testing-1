package com.bemobile.formacionjunit.model

data class Persona(
    val nombre: String,
    var primerApellido: String,
    var segundoApellido: String?,
    val fechaNacimiento: String,
    var esDeveloper: Boolean,
    var trabajaEnBemobile: Boolean,
    var sabeHacerTests: Boolean
)