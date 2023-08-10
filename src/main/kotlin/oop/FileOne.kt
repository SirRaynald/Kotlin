package oop

fun main(args: Array<String>) {
    println("Welcome to oop")
    var firstCar = Car("Prado", "v8", "KDM 514Z")
    var secondCar = Car("Mercedes Benz", "S500", "KDJ 434Z")
    println(secondCar.model)


    var firstFruit = Fruit("Mango","Yellow", 20.0)
    var secondFruit = Fruit("Apple","Green", 45.0)

    println(firstFruit.name)

var firstPhone = Phone("I phone", "IOS", "Type c")
var secondPhone = Phone("Samsung","Android", "Type c")
firstPhone.call("0721985726")

var firstStudent = Student("Raynald", "raynaldapopo1@gmail.com", "123")


var firstTeacher = Teacher("Raynald",
    "raynaldapopo1@gmail.com","123")
    firstTeacher.register()
    firstTeacher.login()
    firstTeacher.logout()
    firstTeacher.checkAttendance()

var firstHod = Hod("Peninah",
    "peninahimenje@gmail.com", "3456")
    firstHod.register()
    firstHod.login()
    firstHod.logout()
    firstHod.scheduleMeeting()
    firstHod.suspendTeacher()


    firstStudent.setIdNumber("13670324")
    println(firstStudent.getIdNumber())


    var maths = Maths()
    maths.grading()
    maths.standardizeResults()

    var history = History()
    history.grading()
    history.standardizeResults()
}


