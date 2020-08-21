fun main() {
    val s = "welcome to Intershala ..."

    val Stringlength = s.length
    val Stringindex = s.get(9)
    val sequence = s.subSequence(0,7)

    println("The length of the string : "+Stringlength)
    println("The 10th index string character is :  "+Stringindex)
    println("The sequnce function result is $sequence ")
    println("the capitalize function is ${s.capitalize()}")
    println("the output of toupper is ${s.toUpperCase()}")
    println("the output of tittle ${s[1].toTitleCase()}")
}
