import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val proceso = ProcessBuilder("C:\\Users\\Dell\\.jdks\\openjdk-22.0.2\\bin\\java.exe \"-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\lib\\idea_rt.jar=60434:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\bin\" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\\CesJuanpablosegundo\\Programacion\\PSP\\out\\production\\PSP;C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.10\\kotlin-stdlib-2.0.10.jar;C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar HijoKt")
    val procesoEjecutado = proceso.start()

    val output = OutputStreamWriter(procesoEjecutado.outputStream)
    output.write("hola hijo")
    output.flush()
    val input = BufferedReader(InputStreamReader(procesoEjecutado.inputStream)).readLine()
    print(input)
}
