package lv1

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

class Average {
    fun solution(arr: IntArray): Double {
        var sum = arr.sum().toDouble()
        var answer = (sum / arr.size)
        return answer
    }
}