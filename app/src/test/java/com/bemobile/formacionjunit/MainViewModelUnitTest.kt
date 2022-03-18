package com.bemobile.formacionjunit

import com.bemobile.formacionjunit.model.Persona
import com.bemobile.formacionjunit.ui.main.MainViewModel
import org.junit.*
import org.junit.Assert.*

class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @Before
    fun setUp() {
        viewModel = MainViewModel()
    }

    @After
    fun tearDown() {

    }

    // TIP: Para que el email tenga un formato correcto,
    // tiene que tener mínimo un caracter antes de la arroba, una arroba,
    // un caracter después de la arroba, un punto y un caracter después del punto.
    // ejemplo de un email correcto: a@b.c
    @Test
    fun `Ejercicio 1 - Comprobar que el email tenga un formato correcto`() {
        //GIVEN
        val fakeEmail = "test@email.com"

        //WHEN
        val isEmailValid = viewModel.isEmailValid(fakeEmail)

        //THEN
        assertTrue(isEmailValid)
    }

    // TIP: Para que el email tenga un formato incorrecto,
    // no tiene que cumplir el caso anterior.
    // ejemplo de un email incorrecto : a+@@__.^
    @Test
    fun `Ejercicio 2 - Comprobar que el email tiene un formato incorrecto`() {
        //GIVEN
        val wrongEmail = "a_@z@.@.com"

        //WHEN
        val isEmailValid = viewModel.isEmailValid(wrongEmail)

        //THEN
        assertFalse(isEmailValid)
    }

    // TIP: Crear un modelo tipo Persona, rellenar sus valores y modificarlos
    // hay que comprobar que una vez modificados, conserven los valores que hemos puesto.
    @Test
    fun `Ejercicio 3 - Comprobar que creando un modelo tipo Persona, cambiando sus valores, comprobamos que al final se conservan `() {
        //GIVEN
        val fakePerson = Persona(
            "Pepe",
            "Fernandez",
            "Gutierrez",
            "08-10-1976",
            esDeveloper = true,
            trabajaEnBemobile = false,
            sabeHacerTests = false
        )

        //WHEN
        fakePerson.primerApellido = "Bolaño"
        fakePerson.sabeHacerTests = true
        if (fakePerson.sabeHacerTests) {
            fakePerson.trabajaEnBemobile = true
        }

        //THEN
        assertNotNull(fakePerson)
        assertTrue(fakePerson.nombre == "Pepe")
        assertEquals(fakePerson.primerApellido, "Bolaño")
        assertEquals(fakePerson.sabeHacerTests, true)
        assertEquals(fakePerson.trabajaEnBemobile, true)
    }

    // TIP: Hay que crear una lista de cualquier modelo e intentar acceder a un índice superior al número de items
    // devuelva una excepción y que sea del tipo que esperamos.
    @Test
    fun `Ejercicio 4 - Comprobar que al obtener un objeto con un índice mayor al número de elementos en la array, devuelve una Excepcion `() {
        //GIVEN

        //WHEN

        //THEN
    }

}