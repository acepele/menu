fun main() {
    var userAns = 0
    print("Please select from the following menu: ")



    do {
        println("1.Chicken Sandwich")
        println("2.Ham Sandwich")
        println("3.Hamburger")
        println("4.Gyro")
        println("5.Toast")
        println("6.Exit")

        print("Enter Choice: ")
        userAns = readLine()!!.toInt()
    } while (userAns != 6)

    println("You have selected the following item: $userAns")
}
