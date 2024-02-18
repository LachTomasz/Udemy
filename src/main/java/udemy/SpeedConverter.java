package udemy;

public class SpeedConverter {

    public static void main(String[] args) {

        getDaysInMonth(2, 2023);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // write code here
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean isLeapYear(int year){

        if (year < 1 || year > 9999) return false;
        if (year % 4 == 0){
            if (year % 100 !=0) return true;
            else if(year % 400 == 0)return true;
            else return false;
        }
        else return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year >9999)return -1;
        return switch (month){
            case 1,3,5,7,8,10,12 -> 31;
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4,6,9,11 -> 30;
            default -> -1;
        };
    }

    public static void printNumberInWord(int num){
        switch(num){
            case 0 -> System.out.println("ZERO");
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.println("NINE");
            default -> System.out.println("OTHER");
        }
    }





    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) System.out.println("Invalid Value");
        else {
            long days = minutes / 1440;
            long years = days / 365;
            long remeinderdays = days % 365;

            System.out.println(minutes + " min = " + years + " y and " + remeinderdays + " d");
        }
    }
}
