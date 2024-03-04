package udemy;

public class SpeedConverter {

    public static void main(String[] args) {

        canPack(2,1,11);

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // write code here
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static final int BIG_PACK = 5;
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }


        if (goal == bigCount*BIG_PACK + smallCount){
            return true;
        }
        return false;
    }
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reverse = reverse(number);
        int leadingZeroes = getDigitCount(number) - getDigitCount(reverse);


        int num = 0;
        String sNumber = "";
        String tmp = "";

        if (number == 0){
            sNumber = "Zero";
        }
        while (reverse != 0){
            num = reverse%10;
            switch(num){
                case 0 -> tmp = "Zero";
                case 1 -> tmp = "One";
                case 2 -> tmp = "Two";
                case 3 -> tmp = "Three";
                case 4 -> tmp = "Four";
                case 5 -> tmp = "Five";
                case 6 -> tmp = "Six";
                case 7 -> tmp = "Seven";
                case 8 -> tmp = "Eight";
                case 9 -> tmp = "Nine";
            }
            sNumber += tmp+" ";
            reverse /= 10;
        }
        String zero = "";
        for (int i = 0; i < leadingZeroes; i++){
            zero += "Zero ";
        }
        sNumber += zero;
        System.out.println(sNumber);

    }
    public static int reverse(int number){
        int reverse = 0;
        while (number != 0){
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        return  reverse;
    }
    public static int getDigitCount (int number){
        if (number<0){
            return -1;
        }
        if(number ==0){
            return 1;
        }
        int count=0;
        for (int i=number; i>0; i=i/10){
            count += 1;
        }
        return count;
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for(int i = 1; i < number; i++){
            if(number%i==0){
                sum += i;
            }
        }
        return number==sum;
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if (first <10 || second <10){
            return -1;
        }
        int count = first < second ? first : second;
        int GreatestCommonDivisor=0;
        for (int i = 1; i <= count; i++){
            if (first%i==0 && second%i==0){
                GreatestCommonDivisor=i;
            }
        }
        return GreatestCommonDivisor;
    }

    public static void printFactors(int num){
        if (num < 1){
            System.out.print("Invalid Value");
        }
        else{
            for (int i = 1; i <= num; i++){
                if (num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
    }


    public static boolean hasSharedDigit(int n1, int n2){
        if (n1 >= 99 || n1 <= 10 || n2 >= 99 || n2 <= 10){
            return false;
        }
        int n11 = n1/10;
        int n12 = n1%10;
        int n21 = n2/10;
        int n22 = n2%10;
        boolean first = n11 == n21 || n11 == n22;
        boolean second = n12 == n21 || n12 == n22;
        return first == second;
}
    public static int sumFirstAndLastDigit(int number){
        int orig = number;
        int last =  number % 10;
        int first =0;
        while(orig !=0){
            first = orig % 10;
            orig /= 10;
        }
        if (number < 0){
            first *= -1;
        }
        return first + last;
    }
    public static boolean isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        while (num != 0){
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return  (number == reverse);
    }

    public static  void testPrime(int number1, int number2){
        int count = 0;
        for(int i = number1; i <= number2; i++){
            if(isPrime(i)){
                System.out.println("number" + i+ " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers between " + number1 + " and " + number2 + " is " + count);
    }
    public static boolean isPrime(int wholeNumber){
        if(wholeNumber <=2) return (wholeNumber == 2);
        for(int divisor = 2; divisor <=wholeNumber / 2; divisor++){
            if(wholeNumber % divisor == 0) return false;
        }
        return true;
    }
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
