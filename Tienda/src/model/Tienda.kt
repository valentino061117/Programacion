package model

class Tienda(var nombre : String,
             /*var alamacen: Array<Producto?> = arrayOfNulls(6),
             var caja : Double*/) {
    //vamos a crear una tienda. Para ello crear la clase necesaria
    //donde se pueda asignar
    //1. Nombre de la tienda (obligatorio)
    //2. Almacen: sitio donde se guardan los productos.
    //   Tiene tamaño fijo
    //3. Caja: SE guardara la pasta cuando se venda un producto

    var caja: Double = 0.0
    lateinit var almacen: Array<Producto?>

    // init -> ejecuta si o si despues del constructor(primario o secundario)

    init {
        almacen = arrayOfNulls(6)
    }

    // un metodo para poder mostrar todos los productos del alamacen. En caso de
    // tener todos los huecos disponibles (vacios) sacar un aviso

    fun mostrarDatos(){
        if (almacen == null){
            println("")
        }
    }

    fun mostrarAlamacen (){
        var nulos = 0
        almacen.forEach {
            it?.mostrarDatos()  ?: nulos++
            /*if (it == null){
                nulos++
            }*/
            if (nulos == almacen.size){
                println("No hay productos en el almacen")
            }
        }
    }

    // agregar un elemento al almacen. En caso de no tener huec
    // disponible se mostrara un aviso

    fun agregarElemento(producto: Producto){
        for (item in 0 .. almacen.size-1){
            if (almacen[item] == null){
                almacen[item] = producto
                return
            }
        }
        println("El almacen esta completo")
    }

    // vamos a vender un producto. Para ello se solicita el id del producto
    // a vender. En caso de estar en el almacen:
        // se elimina de este
        // su precio se suma a la caja
    // si se vende se da aviso de prodicto vendido y se da el valor de la caja
    // si no se encuentra se da aviso de que no esta en el almacen

    fun venderProducto(id : Int){
        for (item in 0 .. almacen.size-1){
            if (id == almacen[item]?.id && almacen[item]!= null){
                caja += almacen[item]!!.precio
                almacen[item] = null
                return
            }
        }
        println("El id indicado no esta en la lista")
    }

    fun buscarProductosCategoria(categoria: Categoria){
        // filtrando -> obteniendo varios
        val filtro: ArrayList<Producto?> = almacen.filter {
            return@filter it?.categoria == categoria
        } as ArrayList<Producto?>

        println("El numero de elementos resultantes es ${filtro.size}")
    }

    fun buscarProductosId(id: Int) {
        // buscando -> obtengo solo un elemento
        var productoBusqueda : Producto? = almacen.find {
            return@find it?.id == id
        }
    }

}