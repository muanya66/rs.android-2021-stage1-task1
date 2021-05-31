package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        throw NotImplementedError("Not implemented")

        val sadArray2 = sadArray.toMutableList()
        val i = 0
        val arrOfIndex = 1..(sadArray2.lastIndex-1)


        for (i in arrOfIndex) {
            if (sadArray2[i - 1] + sadArray2[i + 1] < sadArray2[i]) {
                sadArray2.removeAt(i)
                if (i != 1) {
                    i--
                } else{
                    i++
            }
        }
        }

        return sadArray2.toIntArray()
    }
}