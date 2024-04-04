package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacantMonthServiceTest {

    @Test
    public void calcThreeVacantMonths() {
        VacantMonthService service = new VacantMonthService();
        int expected = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void calcTwoVacantMonths() {
        VacantMonthService service = new VacantMonthService();
        int expected = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }
}
