package ru.netology.sqr;

public class SQRService {
    public int counterSqr(int borBott, int borTop) {
        int sqr;
        int sqrNumber = 0;
        for (int i = 10; i <= 99; i++) {
            sqr = i * i;
            if (sqr >= borBott && sqr <= borTop) {
                sqrNumber=sqrNumber +1;
            }
        }
        return sqrNumber;
    }
}
