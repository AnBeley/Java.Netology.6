package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.WorkLifeService;


public class WorkLifeServiceTest {


    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/index.csv")
    public void testIncomeSmall(int expected, int income, int expenses, int threshold) {
        WorkLifeService service = new WorkLifeService();


        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }
}

