package winningNumber

import camp.nextstep.edu.missionutils.Console
import output.UserInterface

class WinningNumber {
    fun inputWinningNumber(): MutableList<String>{
        var winningNumber = mutableListOf<String>()
        while (true) {
            println(UserInterface.INPUT_WINNING_NUMBERS.mention)
            try {
                winningNumber = Console.readLine().split(",").toMutableList()
                WinningNumberCheck().checkWinningNumber(winningNumber)
                return winningNumber
            }catch (message: IllegalArgumentException){
                message.printStackTrace()
            }
            println("WinningNumber : $winningNumber")
        }
    }
}