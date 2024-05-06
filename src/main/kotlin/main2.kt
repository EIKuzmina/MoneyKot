fun main() {
    val likes = 11
    val human = "Человеку"
    val people = "Людям"
        if (likes % 10 in 2..9 || likes % 10 == 0 || likes % 100 == 11) {
            println("Понравилось $likes $people")
        } else if (likes % 10 == 1) {
        println("Понравилось $likes $human")
    }
}