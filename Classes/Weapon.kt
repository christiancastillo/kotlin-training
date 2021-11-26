package org.kotling.example

class Weapon(val name: String, var damageInflicted: Int){
    fun getWeapon(): String {
        return name
    }

    fun getDamage(): Int{
        return damageInflicted
    }
}