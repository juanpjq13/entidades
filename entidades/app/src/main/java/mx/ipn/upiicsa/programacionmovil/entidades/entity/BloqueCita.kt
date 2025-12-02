package mx.ipn.upiicsa.programacionmovil.entidades.entity

import java.sql.Timestamp

class BloqueCita(
    val inicio: Timestamp,
    val fin: Timestamp
) {
    var sucursal: Sucursal? = null
}