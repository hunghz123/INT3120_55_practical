class Song(
    val tieuDe: String,
    val ngheSi: String,
    val namXuatBan: Int,
    val soLanPhat: Int
){
    val isPopular: Boolean
        get() = soLanPhat >= 1000

    fun moTa() {
        println("$tieuDe, do $ngheSi thực hiện, được phát hành vào $namXuatBan")
    }
}