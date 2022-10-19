object Loop2
{
    def main(args: Array[String])=
    {
        var rank = 0;
        val ranklist = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         
        // For loop with yields
        var output = for{ rank <- ranklist
                    if rank > 4; if rank != 8 }
                    yield rank
         

        println(output)
        println(rank)

 
        // Display result
        for (rank <- output)
        {
            println("Author rank is : " + rank);
        }
    }
}