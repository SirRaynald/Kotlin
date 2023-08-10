fun main(args: Array<String>) {
    var marks = 55
    var grade = if (marks<= 40){
        "E"
    }else if (marks<=50){
        "D"
    }else if (marks<=60){
        "C"
    }else if (marks<=70){
        "B"
    }else{
        "A"
    }
    println(grade)

    var bettingnumber = 0
    var bettingresult =  when(bettingnumber){
        1 ->{
            "You won a car"
        }

        2 -> {
            "You won a horse"
        }

        3 -> {
            "You won 23M"
        }

        4 -> {
            "Better luck Next time"
        }

        else -> {
            "Invalid Entry"
        }
    }

    println(bettingresult)
}