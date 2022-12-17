package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SqeServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")

    void squareNumberTest(int borBott, int borTop, int expented ) {
        SQRService service = new SQRService();
        int actual = service.counterSqr(borBott, borTop);
        Assertions.assertEquals(expented,actual);
    }
}
