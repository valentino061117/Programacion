import java.io.*
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var saldoBanco = 1000
    println("Bienvenido al Banco. Saldo inicial: $saldoBanco€")

    while (true) {
        if (saldoBanco <= 0) {
            println("El banco se ha quedado sin dinero. Cerrando programa.")
            break
        }

        print("\nIntroduce tu número de cuenta (o 'salir' para terminar): ")
        val cuenta = scanner.nextLine()
        if (cuenta.lowercase() == "salir") {
            println("Gracias por usar el Banco. Hasta luego!")
            break
        }

        print("Introduce la cantidad que deseas extraer: ")
        val montoInput = scanner.nextLine()
        val monto = montoInput.toIntOrNull()
        if (monto == null || monto <= 0) {
            println("Cantidad inválida. Intenta de nuevo.")
            continue
        }

        val proceso = ProcessBuilder(
            "C:\\Users\\Dell\\.jdks\\openjdk-22.0.2\\bin\\java.exe",
            "-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\lib\\idea_rt.jar=50781:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\bin",
            "-Dfile.encoding=UTF-8",
            "-Dsun.stdout.encoding=UTF-8",
            "-Dsun.stderr.encoding=UTF-8",
            "-classpath",
            "C:\\CesJuanpablosegundo\\Programacion\\untitled1\\out\\production\\untitled1;" +
                    "C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.10\\kotlin-stdlib-2.0.10.jar;" +
                    "C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
            "HijoKt"
        )

        val procesoArrancado = proceso.start()

        val out = OutputStreamWriter(procesoArrancado.outputStream)
        out.write("$cuenta,$monto,$saldoBanco\n")
        out.flush()

        val leer = BufferedReader(InputStreamReader(procesoArrancado.inputStream))
        val respuesta = leer.readLine()
        println(respuesta)

        if (respuesta.contains("éxito")) {
            saldoBanco -= monto
            println("Saldo restante en el banco: $saldoBanco€")
        }
    }
}
