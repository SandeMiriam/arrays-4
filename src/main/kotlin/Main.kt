fun main(){
colours(arrayOf("red","blue","pink","black"))
    places()
    nums()
   var name = arrayOf("Samina","Gikuku","Bumuntu")
    println(name.contentToString())
}
fun colours(name:Array<String>){
    println(name.contentToString())
}
fun places(){
    var cities= arrayOf("harare","mumbai","dodoma","jakarta")
    for (cities in cities)
    println(cities.capitalize())
}
fun nums(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = (numbers[1]+numbers[4])
    println(sum)
    println(numbers.indexOf(158))

    var order=numbers.sortedArray()
    println(order.contentToString())
}
fun names(name: Array<String>):Array<String>{
    return name
}

