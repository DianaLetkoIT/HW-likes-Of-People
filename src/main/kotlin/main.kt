fun main() {
    val likes = 11
    var people = "людям"
    if (likes == 11) {
        people = "людям"
    } else if ((likes - 1) % 10 == 0) {
        people = "человеку"
    }

    println("Понравилось $likes $people")
}