//Print the even and odd numbers from 1 to 100
// using the ‘while’ and ‘do-while’ loop

fun main()
{
    var a = 1
    var b = 2
    print("Prints odd no up to 100     : ")
    while (a <= 100)
    {
        print("$a ")
        a+=2
    }
    print("\nPrint even number up to 100 : ")
    do {
         print("$b ")
        b+=2
    }while (b <= 100)
}