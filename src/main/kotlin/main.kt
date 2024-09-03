
fun main() {
    val likes = 121
    var people = "людям"
    if ((likes-1)%10 == 0) {
        people = "человеку"
    }

    println ("Понравилось $likes $people")
}