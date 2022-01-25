public class Decimalcomparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.123, 3.1234));
    }

    public static boolean areEqualByThreeDecimalPlaces(double Number1, double Number2) {
        int num1 = (int) (Number1 * 1000);
        int num2 = (int) (Number2 * 1000);
        if (num1 == num2) {
            return true;
        }
        return false;
    }
}