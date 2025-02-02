

class RepositorioCompras {
    private val compras: MutableList<Compra> = mutableListOf()

    fun agregarCompra(compra: Compra) {
        compras.add(compra)
    }

    fun domicilios(): List<Domicilio> {
        return compras.map { it.cliente.domicilio }
    }
}