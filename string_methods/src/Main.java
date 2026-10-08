import java.util.Locale;

public class Main{
    public static void main(String[] args){

        String name = "Password";
//        name = name.trim();
//        int length = name.length();
//        char letter = name.charAt(5);
//        int index = name.indexOf(" ");
//        int lastIndex = name.lastIndexOf("o");

//        name = name.toUpperCase();
//        name = name.toLowerCase();
//        name = name.trim();
//
//        name = name.replace("o", "a");

//        System.out.println(name.isEmpty());

//        System.out.println(name);

//        if(name.isEmpty()){
//            System.out.println("Your name is empty");
//        } else {
//            System.out.println("Hello " + name);
//        }

//        if(name.contains(" ")){
//            System.out.println("Your name contains a space");
//        }
//        else {
//            System.out.println("Your name doesn't contain any spaces");
//        }
        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name con't be password");
        } else{
            System.out.println("Hello " + name);
        }
    }
}