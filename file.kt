import java.io.File
import java.util.*

fun main() {
    val path = prepath()
    Newfile(path)
}

private fun Newfile(path: String): Any {

    println("해당경로에 생성할 파일이름을 입력하세요")
    val name = readln()
    if (name.isEmpty()) {
        println("end")
        return 0
    }
    val path1 = "$path\\$name"
    val file = File(path1)
    if (!file.exists()) {
        file.mkdir()
    } else println("파일이 있습니다.")
    println(path1)
    return Newfile(path1)
}

private fun prepath(): String {
    var path = "C:\\Users\\injae"
    while (true){
        val file = File(path)
        println(path)
        if (file.list()?.isEmpty() == true){
            break
        }else {
            println(Arrays.toString(file.list()))
        }

        val name = readln()
        if (name.isEmpty()){
            println("--------------")
            break
        }else {
            val file1 = File("$path\\$name")
            if (file1.isDirectory) {
                path = "$path\\$name"
            }
        }
    }
    return path
}