import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String userName= "Thandeka_Siteba90";
        String passwoed= "Thandeka2006@";
        String phoneNumber= "+27895317985";
        //Creating a scanner to read input
        Scanner input= new Scanner (System.in);
        //Output
        System.out.println("Please enter a username:");
        String username = input.nextLine();
        //Output
        System.out.println("Please enter a password:");
        String password=input.nextLine();
        //Output
        System.out.println("Please enter a South African cell phone number:");
        String PhoneNumber= input.nextLine();

        login(username, password);


        if (CorrectUsername(username)){
            System.out.println("Username successfully captured.");
        }
        else{
            System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is more than five characters in length.");
        }
        if (CorrectPassword(password)){
            System.out.println("Password successfully captured.");
        }
        else{
            System.out.println("Password is not correctly formatted.  Please ensure that the password contains at least eight characters and a number.")
        }
        if (CorrectPhoneNumber(phoneNumber)){
            System.out.println("CellPhone number successfully added.");
        }

    }
    public static boolean CorrectUsername(String username){
        return username.contains("_")&& username.length() <=5;
    }
    public static boolean CorrectPassword(String password){
        return password.length()>=8;
        && Pattern.compile("[A-Z]").matcher(password).find();
        && Pattern.compile("[0-9]").matcher(password).find();
    }
    public static boolean CorrectPhoneNumber(String phoneNumber){
        return phoneNumber.length()==10;
    

    }
}


        public class Login{
            private String username;
            private String password;
            private String phoneNumber;


            public static void LoginMessage(String username, String password, String phoneNumber){
             //Checking if the username contains a "_" and has <= 5 characters
                public boolean CheckUsername(){
                    return username.contains("_")&& username.length()<=5;
                }
                // Checking if the password meets the password complexity rules
                public boolean checkPassword(){
                    boolean hasUppercase = false;
                    boolean hasNumber = false;
                    boolean hasSpecial = false;

                    if (password.length()<8){
                        return false;
                    }
                
                for (char ch: password.toCharArray()){
                    if Character.isUpperCase(ch)){
                        hasUppercase=true;
                    }
                    else if (Character.isDigit(ch)){
                        hasNumber = true;
                    }
                    else if (!Character.isLetterOrDigit(ch)){
                        hasSpecialChar = true;
                    }

                    }
                    return hasUppercase && hasNumber && hasSpecialChar;
                }
                //Check cellphone number has a + and the length is correct
                public boolean checkPhoneNumber(){
                    return phoneNumber.startsWith("+") && phoneNumber.length() >= 10;
                }
                //Register user 
                public String registerUser(){
                    if (!CheckUsername()){
                        System.out.println("User name is incorrectly formtted. It must contain an underscore and be no more than 5 character.");
                    }
                    if (!checkPassword()){
                        return "Password does not meet complexity requirements";
                    }
                    if (!checkPhoneNumber()){
                        return "Cellphone number is incorrectly formatted.";
                    }
                    else{
                        return "User registered successfully!";
                    }
                    //Login user 
                    public boolean loginUser(String enteredUsername, String enteredPassword){
                        return this. username. equals(enteredUsername)&& this.password.equals(enteredPassword);
                    }
                    // Return String returnLoginStatus(boolean loginSuccess){
                    if (loginSuccess){
                        return "Login successfull!";
                    }
                    else {
                        return"Login failed. Incorrect username or passed.";
                    }
                }

                if (CorrectUsername(Username)&& CorrectPassword(password)){
                    System.out.println ( "Welcome"+username + ", it is great to see you again.");
                }
                else {
                    System.out.println ("Username or password incorrect please try again.");
                }
                public static boolean CheckUsername(String userName){
                    return userName.contains("_")&&userName.length()<=5;
                }
                    public boolean checkPassword(String password){
                        if (password.length()<8) return false;

                
                }

            }
        
        

