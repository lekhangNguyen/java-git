public class main {
    public static void main(String[] args) {
        String creator = "Your Name";
        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);
        int number1 = 5;
        int number2 = 2;
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);
        int multiplication = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        int addition = number1 + number2;
        double division = (double) number1 / number2;
        int subtraction = number1 - number2;
        // add addition
        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " / " + number2 + " = " + division);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
    }
}
