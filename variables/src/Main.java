public class Main {
    public static void main(String[] args){

        int age = 21;
        int year = 2025;
        int quantity = 1;

        System.out.println(year);
        System.out.println(age);

        System.out.println("The year is " + year);


        double price = 19999.99;
        double gpa = 3.5;
        double temperature = -12.5;

        System.out.println("$" + price );

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        System.out.println(grade);
        System.out.println(symbol);
        System.out.println(currency);


        boolean isStudent = false;
        boolean forSale = true;
        boolean isOnline = true;

        System.out.println(isStudent);
        System.out.println(forSale);
        System.out.println(isOnline);

        if(isStudent){
            System.out.println("You are a student!");
        }
        else {
            System.out.println("You are not a student!");
        }

        String name = "Asan Zhorobaev";

        System.out.println("Hello " + name);

        String food = "pizza";

        System.out.println("Your favorite food is: " + food);

        String email = "fake123@gmail.com";

        System.out.println("Your email is " + email);

        String car = "Mustang";
        String color = "Red";

        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);

        System.out.println("Your choice is a " + color + " " + year+ " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale){
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("The " + car + " is not for sale");
        }

        String secondName = "Bro Code";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

    }
}
