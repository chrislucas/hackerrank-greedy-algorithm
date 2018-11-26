/**
 * https://www.hackerrank.com/challenges/marcs-cakewalk/problem?h_r=next-challenge&h_v=zen
 * */

fun marcsCakewalk(calorie: Array<Int>): Long {
    calorie.sortDescending()
    var acc = 0L
    for (i in 0 until calorie.size) {
        acc += (1L shl i) * calorie[i]
    }
    return acc

}


fun main(args: Array<String>) {

    println((1L shl 32))
    val k = readLine()!!.toInt()
    val values = readLine()!!.split(" ").map { i -> i.toInt() }.toTypedArray()
    println(marcsCakewalk(values))


}