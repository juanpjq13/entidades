package mx.ipn.upiicsa.programacionmovil.entidades.entity

import java.sql.Time

class Horario(
    val idHorario: Int,
    val inicio: Time,
    val fin: Time
) {
    var diaLaboral: DiaLaboral? = null
    var sucursal: Sucursal? = null
}