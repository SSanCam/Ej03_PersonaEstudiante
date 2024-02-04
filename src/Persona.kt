open class Persona(val nombre: String, edad: Int = 0) {

    var edad: Int = edad
        private set(value) {
            requireEdad()
            field = value
        }

    init {
        //requireEdad()
        require(nombre.isNotBlank()) { "El nombre no puede ser una cadena vacía." }
    }

    fun cumple() {
        println("Ha cunmplido ${++edad} añitos!!")
    }

    open fun actividad(): String {
        return ("$nombre está realizando una actividad")
    }

    private fun requireEdad() {
        require(edad >= 0) { "La edad no puede ser negativa" }
    }

    override fun toString(): String {
        return "Persona (nombre: $nombre, edad: $edad.)"
    }


}