package com.lesson.spring.javastudy.javalotto;

import com.lesson.spring.javastudy.javalotto.game.LottoWinningNumber;
import java.util.List;

public class LottoMain {

    public static void main(String[] args) {
        System.out.println("로또 용지를 작성해주세요");

        LottoNumber lottoNumber1 = new LottoNumber(1);
        LottoNumber lottoNumber2 = new LottoNumber(2);
        LottoNumber lottoNumber3 = new LottoNumber(3);
        LottoNumber lottoNumber4 = new LottoNumber(4);
        LottoNumber lottoNumber5 = new LottoNumber(5);
        LottoNumber lottoNumber6 = new LottoNumber(6);

        List<LottoNumber> game = List.of(lottoNumber1, lottoNumber2, lottoNumber3,
                lottoNumber4, lottoNumber5, lottoNumber6);

        LottoNumbers lottoNumbers = new LottoNumbers(game);
        boolean isAuto = true;

        LottoGame lottoGame = new LottoGame(null, true);

        Lotto lotto = new Lotto(List.of(lottoGame));

        System.out.println("로또가게에 제출");
        LottoShop lottoShop = new LottoShop(lotto);
        Lotto lottoPaper = lottoShop.getMakeLotto();
        System.out.println(lottoPaper);

        System.out.println("--------------------");
        System.out.println("당첨번호보기");
        LottoWinningNumber lottoWinningNumber = new LottoWinningNumber();
        LottoNumbers winningNumbers = lottoWinningNumber.generateLottoNumbers();
        System.out.println(winningNumbers);

        System.out.println("-------------------");
        System.out.println("구매한 로또랑 당첨번호 비교하기");

        // 1. 자동으로 만들어낸 번호 6개가 필요
        // 2. 당첨기에서 만들어내 번호 6개 필요
        // 3. 두 개의 번호들을 비교하기

        // Q. 구매한 로또가 여러장이라면?
        List<LottoNumber> submittedNumbers = lottoPaper.getLottoGames().get(0).getLottoNumbers()
                .getLottoNumbers();

        List<LottoNumber> winningNumbersList = winningNumbers.getLottoNumbers();

        int matchingCount = countMatchingNumbers(submittedNumbers, winningNumbersList);
        System.out.println("일치하는 번호 개수: " + matchingCount);
    }

    //  Q. 메서드를 위해서 클래스를 만드는지?
    public static int countMatchingNumbers(List<LottoNumber> submittedNumbers,
            List<LottoNumber> winningNumbers) {
        int count = 0;
        for (LottoNumber submittedNumber : submittedNumbers) {
            for (LottoNumber winningNumber : winningNumbers) {
                if (submittedNumber.getNumber() == winningNumber.getNumber()) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }


}
