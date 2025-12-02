package mx.ipn.upiicsa.programacionmovil.entidades.entity

class Genero(
    val id: Int,
    val nombre: String
) {
    var descripcion: String = ""
    var activo: Boolean = false

    constructor(id: Int, nombre: String, descripcion: String, activo: Boolean)
            : this(id, nombre) {
        this.descripcion = descripcion
        this.activo = activo
    }
}