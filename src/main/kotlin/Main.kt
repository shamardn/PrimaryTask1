import kotlin.math.round

fun main(args: Array<String>) {

}

fun aRepetition(listOfString: List<String>):Double{
    var countOfA = 0

    for (element in listOfString){
        if (element.equals("a") || element.equals("b")){
            if (element.equals("a")) countOfA += 1
        }else return -1.0
    }

    val avg  = round(countOfA / listOfString.size.toDouble() * 1000) /10

    return avg
}