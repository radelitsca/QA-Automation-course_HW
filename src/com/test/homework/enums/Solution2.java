package com.test.homework.enums;

public class Solution2 {
    /*
    Implement enum Week, that each element has the name of the week (String) and the number of weekday (int)
    Print these values to the console in the formant - Monday - day of the week: 1
     */
    public static void main(String[] args) {
        printDays();
    }

    private static void printDays() {
        for (Week day : Week.values()) {
            String result = String.format("%s - day of the week - %d", day.name(), day.numOfDay);
            System.out.println(result);
        }
    }

    public enum Week {
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6),
        SUNDAY(7);
        private final int numOfDay;

        Week(int numOfDay) {
            this.numOfDay = numOfDay;
        }
    }
}