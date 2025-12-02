package mx.ipn.upiicsa.programacionmovil.entidades.entity

class ServicioListaPrecio(
    val idServicioListaPrecio: Int,
    var precio: Int
) {
    var servicio: Servicio? = null
    var listaPrecio: ListaPrecio? = null
}