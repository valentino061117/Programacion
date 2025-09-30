fun main() {
    println("Este es mi primer programa kotlin")
    var nombre = "Valentino" //String
    var edad = 18 //Int
    var correo:String? = null
    lateinit var direccion: String
    val DNI = "123123A"

    // Hola soy valentino tengo 18 años y mi DNI es 123123A
    println("Hola mi nombre es $nombre tengo $edad y mi dni es $DNI")
    println("Mi nombre tiene ${nombre.length} letras")
    correo = "valentino061117@gmail.com"
    println("Mi correo es ${correo?.length ?: "sin asignar"}")
    direccion = "Cubas de la sagra"
    println("Mi direccion es $direccion")
}