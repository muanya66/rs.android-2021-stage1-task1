package subtask3


class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): MutableList<String> {
        //throw NotImplementedError("Not implemented")
        var i = 0
        val result = mutableListOf<String>()

        while (i != inputString.length) {
            if (inputString[i] == '('  || inputString[i] == '['  || inputString[i] == '<') {
                var j = 0
                val str = inputString.substring(i + 1, inputString.length)


                when (inputString[i]) {
                    '(' -> while (str[j] != ')') j++
                    '[' -> while (str[j] != ']') j++
                    '<' -> while (str[j] != '>') j++
                }
                result.add(str.substring(0, j))

                i += j
            }
            i++
        }
        return result
        }
    }

