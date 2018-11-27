/**
 * https://www.hackerrank.com/challenges/luck-balance/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 * DONE
 * */


// Complete the luckBalance function below.
fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    var acc = 0
    var qImportantContests = 0
    for( i in 0 until  contests.size) {
        val p = contests[i]
        if (p[1] == 1) {
            // contar quantidade de contestes importantes que foram perdidos
            if (qImportantContests < k) {
                acc += p[0]
                qImportantContests++
            }
            else {
                acc -= p[0]
            }
        }
        else {
            acc += p[0]
        }
    }
    return acc
}

fun main(args: Array<String>) {
    val data = readLine()!!.split(" ").map(String::toInt).toTypedArray()
    val n = data[0]
    val k = data[1]
    val contest = Array(n) { it -> Array(2) {0}}
    for (i in 0 until  n) {
        contest[i] = readLine()!!.split(" ").map(String::toInt).toTypedArray()
    }
    val comp = Comparator<Array<Int>> {
        p, q ->
        val rs = q[1].compareTo(p[1])
        if (rs == 0)
             q[0].compareTo(p[0])
        else
        rs

    }
    contest.sortWith(comp)
    println(luckBalance(k, contest))
}