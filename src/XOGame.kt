class XOGame{
    val row:Int = 0
    val table:Array<Array<String>> = arrayOf( arrayOf("-","-","-"),arrayOf("-","-","-"),arrayOf("-","-","-"))
    fun main() {
        print("dasdas")
        showTable(table)
        //input()
    }
//    fun input() {
//        try {
//            val input = readLine()
//            val rowcol:List<String>? = input?.split(" ")
//            if(rowcol?.size != 2){
//                print("error != 2")
//            }
//            val row = rowcol?.get(0)?.toInt()
//            val col = rowcol?.get(1)?.toInt()
//
//            val result: List<Int> = listOf(row,col) as List<Int>
//        }catch (e : Throwable) {
//          //  showError()
//        }
//    }

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

}
