package Codewars

fun decode(str:String):Int {
    var ans = 0
    var prev = '_'
    for (token in str)
    {
        when (token)
        {
            'I' ->                                  ans += 1
            'V' -> if (prev == 'I') ans += 3   else ans += 5
            'X' -> if (prev == 'I') ans += 8   else ans += 10
            'L' -> if (prev == 'X') ans += 30  else ans += 50
            'C' -> if (prev == 'X') ans += 80  else ans += 100
            'D' -> if (prev == 'C') ans += 300 else ans += 500
            'M' -> if (prev == 'C') ans += 800 else ans += 1000
        }
        prev = token
    }
    return ans
}

fun main(){
    println(decode("XXI"))
}