package mx.ipn.upiicsa.programacionmovil.entidades.entity

class Sucursal(
    val idSucursal: Int,
    val nombre: String,
    var ubicacion: Int
) {
    var establecimiento: Establecimiento? = null
}