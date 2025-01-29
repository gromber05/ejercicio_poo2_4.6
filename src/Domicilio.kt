
data class Domicilio(val calle: String, val numero: Int) {
    /**
     * Clase Cliente
     * @param nombre nombre del cliente
     * @param domicilio domicilio del cliente
     * @constructor Crea un cliente con nombre y domicilio
     */
    fun dirCompleta(): String {
        return "$calle $numero"
    }



}