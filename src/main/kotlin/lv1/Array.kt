package lv1

//정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
class Array {
    fun solution (numbers: IntArray): Double {
        val sum = numbers.sum()
        val answer = sum.toDouble() / numbers.size
        if (numbers.isEmpty()) {
            return 0.0
        }
        return answer
    }
}