import java.util.*


fun main(args: Array<String>) {
    dayOfWeek()
// if value inside a message
//val temperature =10
//val message = "You are ${if (temperature>50) "fried" else "safe"} fish"
//println(message)
    feedTheFish()
    println("Your fortune is , ${getFortuneCookie()}")
    var fortune:String
    for (i in 1..10){
        fortune=getFortuneCookie()
        println("\n Your fortune is : $fortune")
        if (fortune.contains("Take it easy") ) break
    }
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
    var birthday:String? = readLine()
    var birtdayInIntegerType:Int? = birthday?.toIntOrNull()
    if (birtdayInIntegerType != null){
        var result:Int = (birtdayInIntegerType?.div(listOfFortunes.size)!!)
        if (result < 7) {
            return listOfFortunes.get(result)
        }else
            return listOfFortunes.get(result%7)
    }else
        return "NULL"
}

fun fishFood(day:String): String {
    var food = "fasting"
    return when(day){
        "Monday" ->  "flaks"
        "Tuesday" -> "pallets"
        "Wednesday"->"redwores"
        "Thursday" ->"granules"
        "Friday" -> "mosquitoes"
        "Saturday" ->"lettuce"
        "Sunday" ->  "plankton"
        else -> "fasting"
    }
}

