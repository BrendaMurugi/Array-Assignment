fun main() {
    languages(arrayOf("Python", "Kotlin", "Java", "Ruby"))

    citiess()

    myNumbers()

    names(arrayOf("Brenda", "Murugi", "Bree"))
}

//Create a function that takes in 4 strings  and creates an array out of them
//then prints out the array.

fun languages(a:Array<String>) {
    println(a.contentToString())
}

//Create a function that given an array prints out the names of the cities in the correct grammatical case.

fun citiess() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    for(city in cities){
        println(city.capitalize())
    }
}

//Create one function that given the below array:
//(i) prints out the sum of the second and fifth elements

fun myNumbers() {
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1] + numbers[4]
    println(sum)

//(ii) prints out the index of 158
    var index = numbers.indexOf(158)
    println(index)

//(iii) prints out the elements in ascending order
    var elements = numbers.sortedArray()
    println(elements.contentToString())
}

//Create a function that takes in 3 names and returns a string array containing
//all 3 names.

fun names(x:Array<String>):Array<String> {
    var namess = x
    println(namess.contentToString())
    return namess
}



