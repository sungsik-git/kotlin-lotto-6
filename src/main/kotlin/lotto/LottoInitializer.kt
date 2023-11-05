package lotto

import camp.nextstep.edu.missionutils.Randoms

class LottoInitializer {
    companion object{
        const val LOTTO_MIN_NUMBER = 1
        const val LOTTO_MAX_NUMBER = 45
        const val LOTTO_SIZE = 6
    }

    fun init(){
        println("로또번호 생성")
    }

    fun makeLottoNumber(): List<Int>{
        var lotto = Randoms.pickUniqueNumbersInRange(LOTTO_MIN_NUMBER, LOTTO_MAX_NUMBER,
            LOTTO_SIZE)
        return lotto
    }

    fun dividePriceByThousand(price: Int): Int{
        val amountOfLotto = price / 1000
        checkPriceMultipleOfThousands(price)
        return amountOfLotto
    }

    fun checkPriceMultipleOfThousands(input: Int){
        if(input % 1000 != 0){
            throw IllegalArgumentException("[ERROR] 로또 구매 금액은 1,000원 단위로 입력 되어야 합니다.")
        }
    }

    fun sortLottoNumber(lottoNumber: List<Int>): List<Int>{
        var sortNumber = lottoNumber.sorted()
        return sortNumber
    }
}