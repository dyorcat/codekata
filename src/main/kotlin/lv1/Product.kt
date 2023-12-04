package lv1
class Product {
    fun product(num1: Int, num2: Int): Int {
        var answer: Int = num1 * num2
        return answer
    }
}

fun main() {
    println("숫자 : ")
    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    println("${Product().product(num1, num2)}")

}