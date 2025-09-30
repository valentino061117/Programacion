import model.Categoria
import model.Cliente
import model.Producto
import model.Tienda

fun main() {
    var camiseta : Producto = Producto(id = 1, precio = 14.99, categoria = Categoria.Ropa)
    var zapatillas = Producto(id = 2, precio = 20.0, categoria = Categoria.Ropa)
    // id,precio, nombre
    var pantalones = Producto(id = 3, precio = 30.0, nombre = "Pantalones", categoria = Categoria.Ropa)
    var gorra = Producto(id = 4, precio = 20.0, descripcion = "Gorra molona", categoria = Categoria.Ropa)
    var cartera = Producto(id = 5, precio = 5.0, nombre = "cartera", descripcion = "Cartera para guardar pasta",
        categoria = Categoria.Ropa)

    var telefono = Producto(id = 6, precio = 500.00, nombre = "Iphone", descripcion = "telefono movil",
        categoria = Categoria.Tecnologia)


    val listaProducto: Array<Producto?> = arrayOf(camiseta,zapatillas,pantalones,gorra,cartera,telefono)

    val listaProductosVacio: Array<Producto?> = arrayOfNulls(5)

    //listaProducto[listaProducto.size-1].mostrarDatos()
    // Para cambiar un dato de algun producto
    //listaProducto.last().precio=20.0
    listaProducto[2] = null

    /*for (i in listaProducto){
        i?.mostrarDatos()
    }*/

    /*listaProducto.forEach {
        it?.mostrarDatos()
    }*/

    /*listaProducto.forEachIndexed { index, producto ->
        println("Mostradndo producto en poscicion $index")
        producto?.mostrarDatos()
    }*/

    //vamos a crear una tienda. Para ello crear la clase necesaria
    //donde se pueda asignar
    //1. Nombre de la tienda (obligatorio)
    //2. Almacen: sitio donde se guardan los productos.
    //   Tiene tamaño fijo
    //3. Caja: SE guardara la pasta cuando se venda un producto

    var tienda: Tienda = Tienda("calvaland")
    //tienda.almacen = listaProducto
    //tienda.mostrarAlamacen()
    tienda.buscarProductosCategoria(Categoria.Ropa)
    var cliente: Cliente = Cliente(1,"Valentino")
    //cliente.mostrarElementoCarrito()
    cliente.agregarProductoCarrito(gorra)
    cliente.agregarProductoCarrito(pantalones)
    //cliente.mostrarProductoEnPosicion(0)


}

