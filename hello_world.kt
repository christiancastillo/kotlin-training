fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    /*   --------------------- VARIABLES*/
    //VAR stands for VARIABLE


    var jim: String
    var chris = "Christian Castillo" //String chris = "Christian Castillo" 
    var apellido: String
    apellido = " Covarrubias"
    var lives: Int = 3    
    var salario: Int = 270
    var mensual: Int = salario * 31
    println("Salario: $salario")
    println("Salario mensual: \$$mensual")
    println("Nombre completo: ${chris+apellido}")

    /* VAL stands for VALUE*/
    //We declare variables as VAL when we don't expect them to change

    jim = "James T Kirk"
    val apples: Int = 6
    val oranges: Int = 5
    val fruit: Int = apples - oranges
    val isGameOver: Boolean = (lives < 1)
    println(fruit)

    println("${apples/4}")
    println()

    val weeks: Int = 234
    val years: Double = weeks/52.0

    println("$weeks weeks in $years")
    println("Jim is $jim")

    println("-------------------CONDITIONALS--------------------")

    println(isGameOver)
    if (isGameOver){
        println("Game over!!")
    } else {
        println("You're still alive!")
    }

    println("How old are you \\?")
    //val age = readLine()!!.toInt()
    val age = 21
    println("You are $age years old!")

    val message: String

    if (age < 18) {
        message = "You're to young to vote. \n\n"        
    } else if (age == 100){
        message = "Congratulations!"
    } else {
        message = "You can vote!"
    }

    println(message)
}