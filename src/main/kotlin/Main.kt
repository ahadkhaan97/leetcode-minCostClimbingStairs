fun main() {
    print(minCostClimbingStairs1(intArrayOf(0, 2, 2, 1)))
}
fun minCostClimbingStairs1(cost: IntArray): Int {
    var prev1 = cost[0]
    var prev2 = cost[1]
    for (i in 2 until cost.size) {
        val current = cost[i] + minOf(prev1, prev2)
        prev1 = prev2
        prev2 = current
    }
    return minOf(prev1, prev2)
}