import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username="admin", password="qwe123", givenUser, givenPass, newPass,  selection;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        givenUser = input.nextLine();

        System.out.print("Enter password: ");
        givenPass = input.nextLine();

        if (givenUser.equals(username) && givenPass.equals(password)) {
            System.out.println("Successful login");
        }
        else if(givenUser.equals(username) && !givenPass.equals(password)){
            System.out.println("Your password is wrong. Do you want to reset the password? If yes write 'YES' if not write 'NO' ");
            selection = input.nextLine();

            switch (selection) {
                case "YES":
                    System.out.print("Enter your new password: ");
                    newPass = input.nextLine();
                    if (newPass.equals(password)) {
                        System.out.println("New password cannot be same with old one!");
                        break;
                    }
                    else {
                        System.out.println("New password is created");
                        break;
                    }

                case "NO":
                    System.out.println("See you!");
                    break;

                default:
                    System.out.println("Careful with spelling!");
                    break;
            }

        }
        else {
            System.out.println("Wrong username and password!");
        }

    }
}
