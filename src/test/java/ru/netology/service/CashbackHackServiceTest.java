package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void testCheck1Remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount= 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void testCheck2Remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}
