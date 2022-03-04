package com.bemobile.formacionjunit

import com.bemobile.formacionjunit.ui.main.MainViewModel
import org.junit.AfterClass
import org.junit.Assert.*
import org.junit.BeforeClass
import org.junit.Test

class MainViewModelUnitTest {

    private lateinit var viewModel: MainViewModel

    @BeforeClass
    fun setUp() {
        viewModel = MainViewModel()
    }

    @AfterClass
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

        //WHEN

        //THEN

    }

    @Test
    fun `Ejercicio 3 - Comprobar que `() {
        //GIVEN

        //WHEN

        //THEN
    }

    // TIP: Hay que crear una lista de cualquier modelo e intentar acceder a un índice
    @Test
    fun `Ejercicio 4 - Comprobar que al obtener un objeto con un índice mayor al número de elementos en la array, devuelve una Excepcion `() {
        //GIVEN
        val arrayOfWords = arrayListOf("exampleOne", "exampleTwo", "numberThree")

        //WHEN

        //THEN
        assertThrows(IndexOutOfBoundsException::class.java) { arrayOfWords[4] }
    }

    @Test
    fun `Ejercicio 5 - Comprobar `() {
        //GIVEN

        //WHEN

        //THEN
        assert
    }
}