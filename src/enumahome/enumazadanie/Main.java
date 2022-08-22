package enumahome.enumazadanie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String man = scanner.nextLine();
        Weeks oneDay = Weeks.valueOf( man);
        switch (oneDay) {
            case MONDAY -> System.out.println(Weeks.MONDAY.getLesson());
            case TUESDAY -> System.out.println(Weeks.TUESDAY.getLesson());
            case WEDNESDAY -> System.out.println(Weeks.WEDNESDAY.getLesson());
            case THURSDAY -> System.out.println(Weeks.THURSDAY.getLesson());
            case FRIDAY -> System.out.println(Weeks.FRIDAY.getLesson());
            case SATURDAY -> System.out.println(Weeks.SATURDAY.getLesson());
            case SUNDAY -> System.out.println(Weeks.SUNDAY.getLesson());

        }
    }
}