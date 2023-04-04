import java.util.Scanner

fun main(args: Array<String>) {
    // declaring my variables 
    var ch: Char = ' '
    var num1 = 0
    var num2 = 0
    var result = 0
    
    print("Welcome to my Kotlin arithmetic calculator:\n")
    print("Choose operation to perform (+,-,*,/,%): ")
    ch = readLine()!!.first()
    // wanted the user to choose the operation to perform
    // readLine() is used to read the input from the user
    // Then the user enters two numbers to perform arithmetic operations
    print("Enter first number: ")
    num1 = Integer.valueOf(readLine())

    print("Enter second number: ")
    num2 = Integer.valueOf(readLine())


    // loop construct to perform the operation
    when (ch) {
        '+' -> result = add(num1, num2)
        '-' -> result = subtract(num1, num2)
        '*' -> result = multiply(num1, num2)
        '/' -> result = divide(num1, num2)
        '%' -> result = modulus(num1, num2)
        else -> println("Invalid operation.")
    }

    println("Result: $result")
}

// multi functions to perform the operations
fun add(a: Int, b: Int): Int {
    return a + b
}

fun subtract(a: Int, b: Int): Int {
    return a - b
}

fun multiply(a: Int, b: Int): Int {
    return a * b
}

fun divide(a: Int, b: Int): Int {
    return a / b
}

fun modulus(a: Int, b: Int): Int {
    return a % b
}