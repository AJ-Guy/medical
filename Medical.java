import java.util.Scanner;

public class Medical {
    public static void main(String[] args) {
     Scanner info = new Scanner(System.in);


        System.out.println("Hello, Welcome to MedicalAid");
        /* MedicalAid is the temporary name */
        System.out.println("What is your first name?");
        String nameFirst = info.nextLine();
        System.out.println("What is your last name?");
        String nameLast = info.nextLine();
        System.out.println("How old are you?");
        int age = info.nextInt();



    }
}
