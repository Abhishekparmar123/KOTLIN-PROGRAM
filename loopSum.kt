
//try to calculate the sum of the first 100 natural numbers using the concept of loops.

fun main()
{
    var sum = 0

    for (i in 1..100)
    {
        sum += i
    }
    print("Sum of first 100 natural number : $sum")
}
