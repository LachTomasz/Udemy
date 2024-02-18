public class zadania {
    public static void main(String[] args) {
        toMilesPerHour(3);
    }

    public static long toMilesPerHour(double kilometersPerHour) {

        long result;

        if (kilometersPerHour < 0) {
            result = -1;
        } else {
            printConversion(kilometersPerHour);
            result = 1;
        }
        return result;
    }

    public static void printConversion(double kilometersPerHour) {

        long milesPerHour = Math.round(kilometersPerHour * 1.609);

        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }


    }

}