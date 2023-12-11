package lv1
class Quotient {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = num1 / num2
        return answer
    }
}

fun main() {
    println("숫자: ")
    var num1: Int = readLine()!!.toInt()
    var num2: Int = readLine()!!.toInt()
    println("${num1} 나누기 ${num2}의 몫은 ${Quotient().solution(num1, num2)}입니다. ")
        }
