package mx.ipn.upiicsa.programacionmovil.entidades.entity

class Servicio(
    val idServicio: Int,
    val nombre: String
) {
    var descripcion: String = ""
    var activo: Int = 0
    var duracion: Int = 0
}