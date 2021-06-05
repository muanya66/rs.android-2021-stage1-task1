package subtask3

class StringParser {


    fun getResult(inputString: String): Array<String> {
        val myStrArray = mutableListOf<String>()
        val myStrArrayInd = mutableMapOf<Int, Int>()

        val brack1 = mutableListOf<Int>() //переменная "круглые скобки"
        val brack2 = mutableListOf<Int>() //переменная "квадратные скобки"
        val brack3 = mutableListOf<Int>() //переменная "треугольные скобки"

        for (index in inputString.indices) { //обработка массива круглых скобок
            when (inputString[index]) {
                '(' -> brack1.add(index)
                ')' -> if (brack1.isNotEmpty()) {
                    myStrArrayInd[brack1.last() + 1] = index
                    brack1.removeAt(brack1.lastIndex)
                }
                '[' -> brack2.add(index)  //обработка массива квадратных скобок
                ']' -> if (brack2.isNotEmpty()) {
                    myStrArrayInd[brack2.last() + 1] = index
                    brack2.removeAt(brack2.lastIndex)
                }
                '<' -> brack3.add(index)  //обработка массива треугольных скобок
                '>' -> if (brack3.isNotEmpty()) {
                    myStrArrayInd[brack3.last() + 1] = index
                    brack3.removeAt(brack3.lastIndex)
                }
            }

        }
        for ((firstIndex, lastIndex) in myStrArrayInd.toSortedMap()) { //добавление substr в массив
            myStrArray.add(inputString.substring(firstIndex, lastIndex))
        }
        return myStrArray.toTypedArray() } }
