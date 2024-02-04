package com.example.codingtest.exercism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BirdWatcherTest {

    @Test
    void getLastWeek() {
        new BirdWatcher(new int[]{0, 6, 5, 2, 2, 8, 3});
        assertEquals(BirdWatcher.getBusyDays(), 3);
    }

    @Test
    void getToday() {
        new BirdWatcher(new int[]{0, 6, 5, 0, 2, 0, 3});
        assertEquals(BirdWatcher.getToday(), 3);
    }

    @Test
    void incrementTodaysCount() {
        new BirdWatcher(new int[]{0, 6, 5, 2, 2, 8, 3});
        BirdWatcher.incrementTodaysCount();
        assertEquals(BirdWatcher.getToday(), 4);
    }

    @Test
    void hasDayWithoutBirds() {
        new BirdWatcher(new int[]{0, 6, 5, 0, 2, 0, 3});
        assertTrue(BirdWatcher.hasDayWithoutBirds());
    }

    @Test
    void getCountForFirstDays() {
        new BirdWatcher(new int[]{0, 6, 5, 2, 2, 8, 3});
        assertEquals(BirdWatcher.getCountForFirstDays(3), 11);
    }

    /**
     * The getCountForFirstDays method returns overall count when number of days is higher than array size
     */
    @Test
    void getCountForFirstDays_MoreThanSevenDays() {
        new BirdWatcher(new int[]{0, 3, 2, 3, 2, 4, 2});
        assertEquals(16, BirdWatcher.getCountForFirstDays(10));
    }

    @Test
    void getBusyDays() {
        new BirdWatcher(new int[]{0, 6, 5, 2, 2, 8, 3});
        assertEquals(BirdWatcher.getBusyDays(), 3);
    }
}