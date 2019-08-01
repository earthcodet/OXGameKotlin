fun main() {
    val table = arrayOf( arrayOf("-","-","-"),arrayOf("-","-","-"),arrayOf("-","-","-"))
//    print("Please input Row Col : ")
//    val input = readLine()
//    val rowcol:List<String>? = input?.split(" ")
//    print("input ${rowcol?.get(0)}")
    showTable(table)
    input()
}
fun input() {
    try {
        val input = readLine()
        val rowcol:List<String>? = input?.split(" ")
        if(rowcol?.size != 2){
            print("error != 2")
        }
        val row = rowcol?.get(0)?.toInt()
        val col = rowcol?.get(1)?.toInt()

        val result: List<Int?> = listOf(row,col)
        print(result)
    }catch (e : Throwable) {
        print("error number")
    }
}
fun showError() {
    //
}

fun showTable(table:Array<Array<String>>) {
    println("  1 2 3")
    for( i in table.indices){
        print("${i+1} ")
        for(j in table[i].indices){
            print("${table[i][j]} ")
        }
        println("")
    }
}
