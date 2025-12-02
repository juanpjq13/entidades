package mx.ipn.upiicsa.programacionmovil.entidades.entity

class Usuario(
    val idUsuario: Int,
    val login: String,
    var password: String
) {
    var activo: Boolean = false
    var rol: Rol? = null
    var persona: Persona? = null
}