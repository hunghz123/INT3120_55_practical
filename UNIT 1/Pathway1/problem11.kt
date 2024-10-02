fun main() {
    println(weatherStatus("Ankara", 27, 31, 82))
    println(weatherStatus("Tokyo", 32, 36, 10))
    println(weatherStatus("Cape Town", 59, 64, 2))
    println(weatherStatus("Guatemala City", 50, 55, 7))
}

fun weatherStatus(cityName: String, minTemp: Int, maxTemp: Int, chanceOfRain: Int): String{
    val res: String = "City: $cityName\nLow temparature: $minTemp, High temperature: $maxTemp\nChance of Rain: $chanceOfRain%\n\n"
    return res;
}