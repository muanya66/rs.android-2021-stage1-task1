package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {

        val sadArray = sadArray.toMutableList()
        var i = 1

        while (i < sadArray.size - 1) {
            var delete = false
            if (sadArray[i - 1] + sadArray[i + 1] < sadArray[i]) {
                sadArray.removeAt(i)
                if (i > 1) {
                    i--
                    delete = true
                }
            }
            if (!delete) {
                i++
            }
        }

        return sadArray.toIntArray()
    }
}