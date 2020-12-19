package com.gabi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.next();
        System.out.println("please enter your age");
        int age = scanner.nextInt();
        System.out.println("please enter your mail");
        String mail = scanner.next();
        System.out.println("please set your password");
        String passwordtoset = scanner.next();
        System.out.println("please set your username ");
        String username = scanner.next();
        //creating an object for the password
        password password = new password(name, age, mail, passwordtoset, username);
        System.out.println("hello");

        while (!password.validemail(password.getMail())){
            System.out.println("your mail is not valid ");
            System.out.println("please enter your mail");
            mail = scanner.next();
            password.setMail(mail);
            if (password.validemail(password.getMail())) {
                System.out.println("great all of your info is setelled in ");
                System.out.println("now please enter all of your details again so we can log you in the system," + '\n' + "first enter your username,then enter your password ");
                String passwordtocompare = null;
                String usernametocompare = null;
                int tries = 0;
                while (passwordtocompare != password.getPassword() && usernametocompare != password.getUsername() && tries <= 3) {
                    // a var to compare to the username he just created.
                    System.out.println("please enter your username");
                    usernametocompare = scanner.next();
                    // a var to compare to the password he just created
                    System.out.println("please enter your password");
                    passwordtocompare = scanner.next();
                    if (passwordtocompare.equals(password.getPassword()) && username.equals(password.getUsername())) {
                        System.out.println("hello");
                        break;
                    } else {
                        System.out.println("Your password and username is invalid code 1 for more details please send a mail request to thesun538@gmail.com");
                    }
                    tries++;
                }
            }
        }
    }
}