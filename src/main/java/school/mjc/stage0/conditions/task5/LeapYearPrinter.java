package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeapYearBool = year%4 == 0 && (year % 100 != 0 || year % 400 == 0);
        int leap;
        if (isLeapYearBool) {
            leap = 1;
        } else {
            leap = 0;
        }
        switch (leap) {
            case 1:
                System.out.println("leap");
                break;
            case 0:
                System.out.println("not leap");
                break;
        }
    }
}
