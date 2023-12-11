package lv1

class Difference {
        fun solution(num1: Int, num2: Int): Int {
                var answer = num1 - num2
                return answer
        }
}

fun main() {
        println("숫자 : ")
        var num1 = readln().toInt()
        var num2 = readln().toInt()

        println("${Difference().solution(num1, num2)}")
    }

