package Chapter8;

import java.util.Scanner;

public class PasswordValidation {
    static Scanner input= new Scanner(System.in);

    public static void main(String args[]){
        System.out.println("Enter the Username:");
        String username = input.nextLine();

        System.out.println("Enter the old password:");
        String oldpassword = input.nextLine();

        System.out.println("Enter the new password:");
        String newpassword = input.nextLine();
        boolean isValid = true;

        if (newpassword.equals(oldpassword)){
            System.out.println("Error Message: Your new password matches you old password");
            isValid = false;
        }
        if (newpassword.contains(username)){
            System.out.println("Error Message: Your new password matches your login username");
            isValid = false;
        }
        if(newpassword.length()<8){
            System.out.println("Error Message: Password length is less than 8");
            isValid = false;
        }
        if(!UpperCaseLetter(newpassword)){
            System.out.println("Error Message: Password has no Upper case letter, " +
                    "password should contain at least one Upper case letter");
            isValid = false;
        }
        if(!containsSpecialCharacter(newpassword)){
            System.out.println("Error Message: Password should contain a special character");
            isValid = false;
        }

        if (isValid) {
            System.out.println("The proposed password is valid");

        }
      else {
        System.out.println("The proposed password is invalid due to the above errors.");
    }


    }
    public static boolean UpperCaseLetter(String newpassword){
        for(char ch: newpassword.toCharArray()){
            if(Character.isUpperCase(ch)){
                return true;
            }
        }
        return false;
    }
    private static boolean containsSpecialCharacter(String newpassword) {
        String specialCharacters = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
        for (char ch : newpassword.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(ch))) {
                return true;
            }
        }
        return false;
    }



}
