// while loop in kotlin

fun main()
{
    var i = 1
    println("Output of while loop : ")
    while (i in 1..10)
    {
        println(i)
        i+=2
    }
    println("Output of do while loop : ")
    var k = 1
    do {
        println(k)
        k+=2
    }while (k in 1..10)
}