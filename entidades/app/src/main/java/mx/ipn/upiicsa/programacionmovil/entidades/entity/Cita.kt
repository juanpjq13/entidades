package mx.ipn.upiicsa.programacionmovil.entidades.entity

import java.sql.Timestamp

class Cita(
    val idCita: Int,
    val inicio: Timestamp,
    val fin: Timestamp
) {
    var servicio: Servicio? = null
    var persona: Persona? = null
    var listaPrecio: ListaPrecio? = null
}