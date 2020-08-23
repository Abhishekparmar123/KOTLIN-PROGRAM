fun main()
{
    val num = 12

    when(num)
    {
        in 1..10 -> print("between 1 and 10 ..")
        in 11..20 -> print("between 11 to 20 ..")
        else -> print("none")
    }
}
