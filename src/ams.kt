import java.util.*


fun main(args: Array<String>) {
dayOfWeek()

// if value inside a message
//val temperature =10
//val message = "You are ${if (temperature>50) "fried" else "safe"} fish"
//println(message)
    feedTheFish()

}

fun dayOfWeek(): Unit {
    println("What day is it today ?")
    println(Calendar.getInstance().get(Calendar.DAY_OF_WEEK))
    println(
            when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
    1 -> "Sunday"
    2 -> "Monday"
    3 -> "Tuesday"
    4 -> "Wednesday"
    5 -> "Thursday"
    6 -> "Friday"
    7 -> "Saturday"
    else-> "Time has stOppened"

})
}

fun randomDay(): String{
    val week = listOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}
fun feedTheFish(): Unit {
    val day = randomDay()
    val food = "pellets"
    println("Today is ${day} and the fish eat ${food}")
}

fun getFortuneCookie():String {
    val listOfFortunes = listOf("You will have a great day ! ","Things will go well for you today ","Enjoy a wonderful day of success","Take it easy and enjoy life !")
    print("Enter your birthday")
    var birthday:Int? = readLine()?.toIntOrNull()
    return ""
}
