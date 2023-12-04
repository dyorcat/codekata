package lv1

class Difference
        fun defference(num1: Int, num2: Int): Int {
                var answer: Int = 0
                answer = num1 - num2
                return answer
}

fun main() {
        println("숫자 : ")
        var num1 = readln().toInt()
        var num2 = readln().toInt()

        println("${defference(num1, num2)}")
    }

