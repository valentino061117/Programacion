package model

class Producto(var id : Int,
               var precio: Double = 10.00,
               var categoria: Categoria = Categoria.Generica,
               var nombre:String? = null,
               var descripcion:String?= null) {

    // id
    // precio
    //var nombre:String?=null
    //var descripcion:String?=null
/*
    constructor(id: Int,precio: Double,nombre:String): this(id,precio){
        this.nombre = nombre
    }
    // crear constructor solo con descripcion y otro con nombre y descrepcion

    constructor(id: Int,precio: Double,descripcion: String?): this(id,precio){
        this.descripcion = descripcion
    }

    constructor(id: Int,precio: Double,descripcion:String,nombre: String):this(id,precio){
        this.descripcion = descripcion
        this.nombre = nombre
    }*/

    //metodo para poder mostrar todos los datos del producto concreto
    // si no hay nombre, aparede SIN NOMBRE
    // si no hay descipcion aparece SIN DESCRIPCION

    fun mostrarDatos(){
        println("ID: $id")
        println("Precio: $precio")
        println("Nombre: ${nombre?: "Sin definir"}")
        println("Categoria: ${categoria.name}")
        println("Descripcion: ${descripcion?:"Sin definir"}")
    }

}