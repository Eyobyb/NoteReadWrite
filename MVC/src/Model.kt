import java.io.File
import java.io.InputStream



class Model {


    fun writer(value:String) {

//        val outString: String = "Kotlination\nBe Kotlineer - Be Simple - Be Connective."
        File("data.txt").printWriter().use { out -> out.println(value)
        }
    }
    fun reader():String{
        var message:String=""
        val inputStream: InputStream = File("data.txt").inputStream()
        val lineList = mutableListOf<String>()


        inputStream.bufferedReader().useLines { lines -> lines.forEach { lineList.add(it)} }
        lineList.forEach{message=message+it}
        return message

    }
}