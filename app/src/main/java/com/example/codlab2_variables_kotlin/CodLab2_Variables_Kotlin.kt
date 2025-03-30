package com.example.codlab2_variables_kotlin

fun main() {
    println("=== Variables Mutables ===")
    variablesMutables()
    println()

    println("=== Incremento y Decremento ===")
    incrementoDecremento()
    println()

    println("=== Tipos Double ===")
    ejemploDouble()
    println()

    println("=== Concatenación de Strings ===")
    concatenacionStrings()
    println()

    println("=== Secuencias de Escape ===")
    secuenciasEscape()
    println()

    println("=== Booleanos ===")
    booleanos()
    println()

    println("=== Comentarios ===")
    comentariosCodigo()
}

// 1. Variables mutables e inmutables
fun variablesMutables() {
    var cartTotal = 0
    println("Total: $cartTotal")

    cartTotal = 20
    println("Total: $cartTotal")
}

// 2. Incremento y decremento
fun incrementoDecremento() {
    var count = 10
    println("You have $count unread messages.")

    count++
    println("You have $count unread messages.") // 11

    count--
    println("You have $count unread messages.") // 10
}

// 3. Tipos de datos Double
fun ejemploDouble() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72

    val totalTripLength = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")
}

// 4. Cadenas de texto y concatenación
fun concatenacionStrings() {
    val nextMeeting = "Next meeting is: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"

    println(reminder)
}

// 5. Secuencias de escape
fun secuenciasEscape() {
    println("Say \"hello\"")
    println("First line\nSecond line")
}

// 6. Booleanos
fun booleanos() {
    val notificationsEnabled = false
    println("Are notifications enabled? " + notificationsEnabled)
}

// 7. Comentarios en el código
fun comentariosCodigo() {
    /**
     * Este programa muestra la cantidad de mensajes en la bandeja de entrada.
     */

    // Número de mensajes sin leer
    var count = 10
    println("You have $count unread messages.")

    // Disminuir el número de mensajes
    count--
    println("You have $count unread messages.")
}

// Función principal para ejecutar todos los ejemplos
