fun main() {
    var timeA: Int = 300
    var timeB: Int = 320
    println(compareTime(timeA, timeB))
}

fun compareTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean{
    if (timeSpentToday > timeSpentYesterday)
    	return true
    else return false
}