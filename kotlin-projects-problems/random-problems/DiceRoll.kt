fun main(){
    val myDice = Dice()
    myDice.roll()
}

class Dice {
    val sides = 6
    fun roll(){
        val randomNumber = (1..sides).random()
        println(randomNumber)
    }
}