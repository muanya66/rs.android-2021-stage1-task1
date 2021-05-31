package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        throw NotImplementedError("Not implemented")

        val sadArray = sadArray.toMutableList()
        val i = 1
        //val arrOfIndex = 1..(sadArray.lastIndex-1)


        while (i < sadArray.size - 1) {
            if (sadArray[i - 1] + sadArray[i + 1] < sadArray[i]) {
                sadArray.removeAt(i)
                if (i != 1) {
                    i--
                }
                else{
                    i++
            }
        }
        }

        return sadArray.toIntArray()
    }
}