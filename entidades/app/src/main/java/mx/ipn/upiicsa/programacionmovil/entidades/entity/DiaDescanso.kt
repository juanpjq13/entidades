package mx.ipn.upiicsa.programacionmovil.entidades.entity

import java.util.Date

class DiaDescanso(
    val idDiaDescanso: Int,
    val descanso: Date
) {
    var empleado: Empleado? = null
}