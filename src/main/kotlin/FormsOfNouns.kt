fun main() {
    val likes: Int = 191
    println("Понравилось $likes ${getNounForCount(likes)}.")
}

/**
 * Возвращает нужное существительное в зависимости от количества людей.
 */
fun getNounForCount(likes: Int): String {
    return when {
        likes % 10 == 1 && likes % 100 != 11 -> "человеку"
        else -> "людям"
    }
}