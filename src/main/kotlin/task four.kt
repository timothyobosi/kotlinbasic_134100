fun main(array: Array<String>){
    //prints on the screen and prompts
    //the user to enter a nuber
    print("Enter a number:")

    //reads line from standard inut -keyboard
    //and !! operator ensures the input is not null
   val stringInput = readLine()!!

   //converts the string input to integer
   var integer:Int=stringInput.toInt()

   //println() prints the following line to the output stream
   println("You entered: $integer")
}