data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
) {
    
}

enum class Daypart{
    MORNING, AFTERNOON, EVENING
}