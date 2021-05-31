package subtask2


class BillCounter {

    // TODO: Complete the following function

    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        throw NotImplementedError("Not implemented")
        val billNew = (bill.sum() - bill[k]) / 2
        return if (billNew == b) {
            "Bon Appetit"
        } else {
            (b - billNew).toString()
        }
    }
}
