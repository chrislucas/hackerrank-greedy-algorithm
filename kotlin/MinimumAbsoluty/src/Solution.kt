
/**
 *
 * https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
 * */


fun abs(a : Int) : Int = if (a < 0) -a else a

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    var min = Int.MAX_VALUE
    /*
    for (i in 0 until arr.size - 1) {
        for (j in i+1 until arr.size) {
            val v = abs(arr[i] - arr[j])
            if (v < min)
                min = v
        }
    }
    */

    arr.sort()

    for (i in 0 until arr.size - 1) {
        val v = abs(arr[i] - arr[i+1])
        if (min > v)
            min = v
    }

    return min
}


fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val values = readLine()!!.split(" ").map { i -> i.toInt() }.toTypedArray()
    println(minimumAbsoluteDifference(values))
}