import java.io.*

fun main() {
    val input = BufferedReader(InputStreamReader(System.`in`))
    val datos = input.readLine().split(",").toTypedArray()

    val cuenta = datos[0]
    val monto = datos[1].toInt()
    val saldoBanco = datos[2].toInt()

    if (monto > saldoBanco) {
        println("No hay suficiente dinero en el banco para retirar $monto€ de la cuenta $cuenta.")
    } else {
        println("Se ha retirado $monto€ con éxito de la cuenta $cuenta.")
    }
}
