package lv1
class Compare {
    fun compare(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if (num1 == num2) {
            answer = 1
        } else {
            answer = -1
        }
        return answer
    }
}

fun main() {
    println("숫자 : ")
    var num1 = readln().toInt()
    var num2 = readln().toInt()
    if (num1 == num2) {
        println("num1이 ${num1}이고 num2가 ${num2}이므로 같습니다. 따라서 ${Compare().compare(num1, num2)}을 return합니다.")
    } else {
        println("num1이 ${num1}이고 num2가 ${num2}이므로 다릅니다. 따라서 ${Compare().compare(num1, num2)}을 return합니다.")
    }
}