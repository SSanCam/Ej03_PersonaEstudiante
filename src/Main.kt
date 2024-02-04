fun pedirPersona(): Persona {
    var p: Persona? = null
    do {
        try {
            println("Introduzca el nombre: ")
            val nombre = readln()

            println("Introduzca la edad: ")
            val edad = readln().toInt()

            p = Persona(nombre, edad)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        } catch (e: NumberFormatException) {
            println("La edad debe ser un número entero positivo o 0.")
        }
    } while (p == null)
    return p
}

fun main() {
    val p = Persona("Juan", 55)
    println(p)

    p.cumple().also { println("Ha cumplido añitos") }
    println(p)
    //println("Nombre: $p.nombre, Edad: $p.edad")

    val e = Estudiante("Pablo", 23, "Medicina")
    println(e)
    println(e.actividad())

    e.cumple()
    println(e)

    val nuevaPersona = pedirPersona()
    println (nuevaPersona)
}