package Codewars

object FileNameExtractor {
    fun extractFileName(dirtyFileName: String): String {
        return dirtyFileName
            .replaceBefore("_", "")
            .replaceAfterLast(".", "")
            .removeSurrounding("_",".")
    }
}

fun main(){
    println(FileNameExtractor.extractFileName("1_This_is_an_otherExample.mpg.OTHEREXTENSIONadasdassdassds34"))
}