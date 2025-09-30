package model

class Cliente(var id: Int,var nombre: String){
    lateinit var carrito : ArrayList<Producto>
    var factura: Double = 0.0

    init {
        carrito = arrayListOf()
    }

    fun agregarProductoCarrito(producto: Producto){
        carrito.add(producto)
        println("Producto agregado al carrito correctamente")
    }

    // mostrar todos los elementos del carrito
    fun mostrarElementoCarrito(){
        if (carrito.isEmpty()){
            println("El carrito esta vacio")
        }else{
            carrito.forEach { it.mostrarDatos() }
        }
    }

    // mostrar el producto que esta en una posicion indicada

    fun mostrarProductoEnPosicion(posicion: Int){
        if (posicion>carrito.size){
            println("Id fuera de rango")
        }else{
        carrito[posicion].mostrarDatos()
        }

    }

    // eliminar un producto del carrito
        //En caso de no estar el id en el carrito aviso de que no se encuentra
        //En caso de que si esta en el carrito y solo existir uno, lo elimina
        //En caso de si estar en el carrito y existir varios, confirmacion de eliminar 1

    fun eliminarProductoCarrito(id: Int){
        /*carrito.removeAll(carrito.filter {
            return@filter true
        })*/
        var listaFiltrada = carrito.filter {
            return@filter it.id == id
        }

        if (listaFiltrada.isEmpty()){
        println("El numero de resultados es ${listaFiltrada.size} por lo que no se puede borrar")
        }else if (listaFiltrada.size == 1){
            carrito.remove(listaFiltrada.first())
            println("Borrado correctamente")
        }else{
            println("Se han encontrado varias coincidencias, cual quieres borrar: (1 para el primero " +
                    "/ n para resto")
            val opcion: String = readln()
            if (opcion.equals("1", true)){
                carrito.remove(listaFiltrada.first())
            }else if (opcion.equals("n",true)){
            carrito.removeAll(listaFiltrada.toSet())
            }
        }

    }

    // hacer un metodo para calcular la factura del cliente
    // cuando un cliente pide la factura se muestra por consola y vacia el carrito

    fun pedirFactura(){
        if (carrito.isEmpty()){
            println("No puedes pedir, no hay productos en carrito")
        }else{
            carrito.forEach {
                factura+=it.precio
            }
            println("Debes un total de $factura")
            carrito.clear()
        }
    }

}