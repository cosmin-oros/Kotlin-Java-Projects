package Codewars

import kotlin.test.assertEquals
import org.junit.Test

fun winCheckerImpl(board : String) : String {
    val combos  = listOf(
        board.substring(0..2 ),
        board.substring(3..5 ),
        board.substring(6..8 ),
        String( charArrayOf( board[0],board[3],board[6]) ),
        String( charArrayOf( board[1],board[4],board[7]) ),
        String( charArrayOf( board[2],board[5],board[8]) ),
        String( charArrayOf( board[0],board[4],board[8]) ),
        String( charArrayOf( board[2],board[4],board[6]) )
    )
    var xWin = ""
    var zWin = ""
    val regex = Regex("""(XXX|OOO)""")
    for( s in combos ){
        if( s.matches( regex ) ){
            if( s[0] == 'X' )
                xWin = "X"
            if( s[0] == 'O' )
                zWin = "O"
        }
    }
    return xWin + zWin

}

fun winChecker(board : String) : Boolean {
    return winCheckerImpl( board ).isNotEmpty()
}


class Test {
    @Test
    fun someBoardsWithWinnersTests () {
        val winners = arrayOf("XXX-O-O-O", "X--OOOX-X", "O--OO-XXX", "O-XOX-O-X", "OXOOXOXX-", "X-O-OOXXO", "XO--X-OOX", "X-OXOOOXX")
        winners.forEach { winner ->
            println("Testing with board " + winner)
            assertEquals(true, winChecker(winner))
        }
    }

    @Test
    fun someBoardsWithoutWinnersTests () {
        val notWinners = arrayOf("XO-------", "XX-XOO---", "-XX-OO-O-", "OXO--XXO-", "OOXXXO---", "OXXX-XOO-", "OOXXX----", "XXOOXXOO-", "OXOXOX---")
        notWinners.forEach { notWinner ->
            println("Testing with board " + notWinner)
            assertEquals(false, winChecker(notWinner))
        }
    }

}

fun main(){
    println(winChecker("O-XOX-O-X"))
}