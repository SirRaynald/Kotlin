fun main(args: Array<String>) {
    val age = 18
    if (age > 18){
        println("TRUE")
    }
    else{
        println("FALSE")
    }
    if (age >= 18){
        println("FALSE")
    }else{
        println("TRUE")
    }

    var bettingNumber =0
    if (bettingNumber==1) {
        println("You have won a car")
    }else if (bettingNumber==2) {
        println("You won a horse")
    }else if (bettingNumber==3) {
        println("You won 3M")
    }else if (bettingNumber==4) {
        println("You lost")
    }else{
        println("Enter a number from 1-4 to bet")
    }

    var number = 0
    when (number){
        0 -> {
            println("You have selected a zero")
        }
        1 -> {
            println("You have selected a one")
        }
        2 -> {
            println("You have selected a two")
        }
        else -> {
            println("You havent selected a valid number")
        }

    }
}

