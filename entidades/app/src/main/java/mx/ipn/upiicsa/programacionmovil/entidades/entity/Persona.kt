package mx.ipn.upiicsa.programacionmovil.entidades.entity
import java.time.LocalDate

class Persona(
    val id: Int,
    val nombre: String,
    val primerApellido: String,
    val segundoApellido: String,
    val nacimiento: LocalDate
) {
    var genero: Genero? = null
}