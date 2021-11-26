package org.kotling.example

class Player(val name: String = "", var lives: Int, var level: Int, var score: Int = 0){    

    val weapon = Weapon("Fist", 1)

    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
        """
        )
    }
}