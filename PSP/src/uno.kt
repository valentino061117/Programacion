import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args:Array<String>) {
    val linea = BufferedReader(
        InputStreamReader(
            ProcessBuilder(
                "C:\\Users\\Dell\\.jdks\\openjdk-22.0.2\\bin\\java.exe",
                "-javaagent:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\lib\\idea_rt.jar=54816:C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2024.2.1\\bin",
                "-Dfile.encoding=UTF-8",
                "-Dsun.stdout.encoding=UTF-8",
                "-Dsun.stderr.encoding=UTF-8",
                "-classpath",
                "C:\\CesJuanpablosegundo\\Programacion\\PSP\\out\\production\\PSP;" +
                        "C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\kotlin\\kotlin-stdlib\\2.0.10\\kotlin-stdlib-2.0.10.jar;" +
                        "C:\\Users\\Dell\\.m2\\repository\\org\\jetbrains\\annotations\\13.0\\annotations-13.0.jar",
                "LlamarKt"
            ).start().inputStream
        )
    ).readLine()
    println(linea.uppercase())
}