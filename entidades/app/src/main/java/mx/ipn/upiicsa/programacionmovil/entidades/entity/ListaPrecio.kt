package mx.ipn.upiicsa.programacionmovil.entidades.entity
import java.sql.Timestamp

class ListaPrecio(
    val idListaPrecio: Int,
    val nombre: String,
    val inicio: Timestamp,
    val fin: Timestamp
) {
    var estado: EstadoListaPrecio? = null
}