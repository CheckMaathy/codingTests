package com.example.codingtest.exercism;

import java.util.Arrays;
import java.util.Collections;


/**
 * You're an avid bird watcher that keeps track of how many birds have visited your garden in the last seven days.
 * You have six tasks, all dealing with the numbers of birds that visited your garden.
 */
public class BirdWatcher {

    public static void main(String[] args) {
        new BirdWatcher(getLastWeek());
        System.out.println("Birds Last Week: " + Arrays.toString(getLastWeek()));
        System.out.println("Birds Last day of week: " + getToday());
        incrementTodaysCount();
        System.out.println("Incremented Today: " + getToday());
        System.out.println("New Birds in Last Week: " + Arrays.toString(birdsPerDay.clone()));
        System.out.println("Has days without birds: " + hasDayWithoutBirds());
        System.out.println("Number of birds in the first days of week: " + getCountForFirstDays(4));
        System.out.println("Number of busy days: " + getBusyDays());
    }

    private static int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    /**
     * For comparison purposes, you always keep a copy of last week's counts nearby,
     * which were: 0, 2, 5, 3, 7, 8 and 4. Implement the BirdWatcher.getLastWeek()
     * method that returns last week's counts
     * @return lastWeekCount
     */
    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    /**
     * mplement the BirdWatcher.getToday() method to return how many birds
     * visited your garden today. The bird counts are ordered by day, with the
     * first element being the count of the oldest day, and the last element being today's count.
     * @return
     */
    public static int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    /**
     * Implement the BirdWatcher.incrementTodaysCount() method to increment today's count:
     */
    public static void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    /**
     * Implement the BirdWatcher.hasDayWithoutBirds() method that returns true if there was a
     * day at which zero birds visited the garden; otherwise, return false:
     * @return
     */
    public static boolean hasDayWithoutBirds() {
        boolean hasDayWithoutBirds = false;
        for (int birds : birdsPerDay) {
            if (birds == 0) {
                hasDayWithoutBirds = true;
                break;
            }
        }
        return hasDayWithoutBirds;
    }

    /**
     * Implement the BirdWatcher.getCountForFirstDays() method that returns the
     * number of birds that have visited your garden from the start of the week, but limit the count
     * to the specified number of days from the start of the week.
     * @param numberOfDays
     * @return
     */
    public static int getCountForFirstDays(int numberOfDays) {
        if (numberOfDays > 7) {
            throw new Error("Max days permitted is 7");
        }
        int totalBirds = 0;
        for (int i = 0; i < numberOfDays; i++) {
            totalBirds = totalBirds + birdsPerDay[i];
        }
        return totalBirds;
    }

    /**
     * Some days are busier that others. A busy day is one where five or more birds have visited your garden.
     * Implement the BirdWatcher.getBusyDays() method to return the number of busy days:
     * @return
     */
    public static int getBusyDays() {
        int daysWithMoreThanFiveBirds = 0;
        for (int birds : birdsPerDay) {
            if (birds >= 5) {
                daysWithMoreThanFiveBirds++;
            }
        }
        return daysWithMoreThanFiveBirds;
    }
}
