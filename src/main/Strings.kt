package main

fun main() {
    val surname = " Castilhos"
    val name = "Igor"
    println(name.plus(surname))
    println("".isEmpty())

    // String Template
    val age: Int = 23
    val msg: String = "$name $age"

    // Multiline Strings
    val email = """
        Olá, %s
            como
                vai você?
    """.trimIndent()

    println(email.format(name))
}