package sort

/**
 * https://grokonez.com/kotlin/kotlin-array-sort-sortby-sortwith#1_sortWith
 * https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/sort-with.html
 * */


fun testComparator () {
    val comp = Comparator<Int> {
        p, q -> p.compareTo(q)
    }
}


fun main(args: Array<String>) {

}