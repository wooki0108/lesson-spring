package com.lesson.spring.javastudy.javalotto.game;

import com.lesson.spring.javastudy.javalotto.LottoNumber;
import com.lesson.spring.javastudy.javalotto.LottoNumbers;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

// TODO: AutoLottoNumbersGenerator 랑 코드가 거의 일치하는데 어떻게 처리해야할지
// 로또 당첨 번호 생성
public class LottoWinningNumber implements LottoNumbersGenerator {

    private static final int COUNT = 6;
    private static final int RANGE_START_NUMBER = 1;
    private static final int RANGE_END_NUMBER = 45;

    @Override
    public LottoNumbers generateLottoNumbers() {
        Set<Integer> randomNumbers = RandomNumberUtils.makeUniqueRandomNumbers(COUNT,
                RANGE_START_NUMBER, RANGE_END_NUMBER);

        List<LottoNumber> winningNumbers = new ArrayList<>();

        for (int randomNumber : randomNumbers) {
            LottoNumber lottoNumber = new LottoNumber(randomNumber);
            winningNumbers.add(lottoNumber);
        }

        winningNumbers.sort(LottoNumber::compareTo);

        return new LottoNumbers(winningNumbers);
    }
}
