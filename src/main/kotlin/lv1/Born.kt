package lv1

class Born
    fun born(age: Int): Int {
        var answer: Int = 2023 - age
        return answer
    }
fun main() {
    println("나이: ")
    var age: Int = readln().toInt()
    println("${born(age)}년생입니다. ")

}
