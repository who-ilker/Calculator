import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int select;

        do{
            printMenu();
            System.out.print("Press a number (0-8) :  ");
            select = scanner.nextInt();
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    exponentiation();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    calculationRectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.print("You pressed an invalid number.");
                    break;
            }
        }while(select != 0);
    }
    static void printMenu(){
        String menu = "(1) Sum operation\n"
                +"(2) Subtraction operation\n"
                +"(3) Multiplication operation\n"
                +"(4) Divide operation\n"
                +"(5) Exponentiation operation\n"
                +"(6) Factorial operation\n"
                +"(7) Mode operation\n"
                +"(8) Rectangle area and environment calculation\n"
                +"(0) Quit\n";
        System.out.print(menu);
    }
    static void sum(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true){
            System.out.print(i++ +". sayi: ");
            number = scanner.nextInt();
            if (number == 0)
                break;
            result += number;
        }
        System.out.println("Result: "+result);
    }
    static void minus(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0, counter;
        System.out.print("How many number will you enter : ");
        counter = scanner.nextInt();
        for (int i = 1; i <= counter; ++i){
            System.out.print(i+". Number: ");
            number = scanner.nextInt();
            if(i == 1){
                result += number;
                continue;
            }
                result -= number;
        }
        System.out.println("Result: " + result);
    }
    static void multiplication() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = scan.nextInt();

            if (number == 1)
                break;
            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Result: " + result);
    }
    static void divide(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many number will you enter : ");
        int counter = scanner.nextInt();
        double number, result = 0.0;

        for(int i = 1; i <= counter; ++i){
            System.out.print(i+". Number: ");
            number = scanner.nextInt();
            if(i != 1 && number == 0){
                System.out.println("You cannot enter the divisor as 0!");
                continue;
            }
            if (i == 1){
                result = number;
                continue;
            }
            result /= number;
        }
        System.out.println("Result: "+result);
    }
    static void exponentiation(){
        Scanner scanner = new Scanner( System.in);
        int base, exponent, result = 1;
        System.out.print("Base: ");
        base = scanner.nextInt();
        System.out.print("Exponent: ");
        exponent = scanner.nextInt();

        for(int i = 1; i <= exponent; ++i)
            result *= base;
        System.out.println(base+"^"+ exponent +" = "+result);
    }
    static void factorial(){
        Scanner scanner = new Scanner( System.in);
        int fact, result = 1;
        System.out.print("Which number's factorial do you want: ");
        fact = scanner.nextInt();

        for(int i = fact; i > 0; i--)
            result *= i;
        System.out.println("Result: "+result);
    }
    static void mode(){
        Scanner scanner = new Scanner( System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Mod: ");
        int mod = scanner.nextInt();
        System.out.println(number+" mode "+mod+" = "+(number % mod));
    }

    static void calculationRectangle(){
        Scanner scanner = new Scanner( System.in);
        System.out.print("First edge of rectangle: ");
        int a = scanner.nextInt();
        System.out.print("Second edge of rectangle: ");
        int b = scanner.nextInt();

        System.out.println("Perimeter of rectangle: "+ 2 * (a+b));
        System.out.println("Area of rectangle: "+ (a*b));
    }

}