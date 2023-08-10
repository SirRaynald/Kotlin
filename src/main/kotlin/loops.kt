fun main(args: Array<String>) {

    var counterOne = 0
    while (counterOne <= 5){
        println(counterOne)
        counterOne++
    }

    var counterTwo = 10
    do {
        println(counterTwo)
        counterTwo++
    }while (counterTwo <= 15)

    for (i in 20 .. 25){
        println(i)
    }
    for (j in 50  downTo  45){
        println(j)
    }
    var names = arrayListOf("Raynald", "Bertrand", "Rose")
    for (jina in names){
        println(jina)
    }
    names.forEach {
        println(it)
    }
    repeat( 2){
        println("Hello There")
    }

}