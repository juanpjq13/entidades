package mx.ipn.upiicsa.programacionmovil.entidades.entity

class Rol(
    val idRol: Int,
    val nombre: String
) {
    var descripcion: String = ""
    var activo: Boolean = false

    constructor(idRol: Int, nombre: String, descripcion: String, activo: Boolean)
            : this(idRol, nombre) {
        this.descripcion = descripcion
        this.activo = activo
    }
}