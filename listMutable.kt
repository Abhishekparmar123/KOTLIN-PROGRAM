fun main()
{
    val listOfString = mutableListOf<String>("Box", "Table", "Chair")

    listOfString[1] = "Bed"
    listOfString.add("TV")
    listOfString.add(2,"AirConditioner")
    println(listOfString)
    listOfString.removeAt(1)
    println(listOfString)
}
