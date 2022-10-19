// Scala program to illustrate how to
// use for loop with collection
object Main
{
    def main(args: Array[String])=
    {
        var rank = 0;
        val ranklist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         
        // For loop with collection
        for( rank <- ranklist){
            println("Author rank is : " +rank);
        }
    }
}