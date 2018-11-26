/**
 * https://www.hackerrank.com/challenges/luck-balance/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * */


// Complete the luckBalance function below.
fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    var acc = 0

    return acc
}
/**
3 2
5 1
1 1
4 0
 * */

fun main(args: Array<String>) {
    val data = readLine()!!.split(" ").map(String::toInt).toTypedArray()
    val n = data[0]
    val k = data[1]
    val contest = Array(n) { it -> Array(2) {0}}
    for (i in 0 until  n) {
        contest[i] = readLine()!!.split(" ").map(String::toInt).toTypedArray()
    }
    val comp = Comparator<Array<Int>> {
        p, q -> q[1].compareTo(p[1])
    }
    contest.sortWith(comp)
    println(luckBalance(k, contest))
}