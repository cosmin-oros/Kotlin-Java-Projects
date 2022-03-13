package Codewars

fun areaOrPerimeter(l:Int,w:Int):Int {
    if (l==w) return l*l
    else return 2*(l+w)
}

fun main(){
    print(areaOrPerimeter(3,3))
}