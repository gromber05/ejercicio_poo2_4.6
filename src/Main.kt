
fun main() {
    val domicilio1 = Domicilio("Calle Los del Python", 31)
    val domicilio2 = Domicilio("Av. Trabajo Duro", 9)

    val cliente1 = Cliente("JL", domicilio1)
    val cliente2 = Cliente("Astronauta", domicilio2)
    val cliente3 = Cliente("Mario", domicilio1)

    val compra1 = Compra(cliente1, "23", 100.0)
    val compra2 = Compra(cliente2, "12", 150.0)
    val compra3 = Compra(cliente3, "31", 200.0)

    val listaFacturados = RepositorioCompras()
    listaFacturados.agregarCompra(compra1)
    listaFacturados.agregarCompra(compra2)
    listaFacturados.agregarCompra(compra3)

    println("Domicilios:")
    listaFacturados.domicilios().forEach { println(it.dirCompleta()) }
}