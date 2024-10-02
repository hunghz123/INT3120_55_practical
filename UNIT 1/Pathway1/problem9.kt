fun main() {
    val Steps = 4000
    val caloriesBurned = pedometerStepsToCalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}