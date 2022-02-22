
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

/**
 *
 * @author brand
 */
public class TestUserprofile {

    public static void main(String[] args) {
        String userID = " ";
        String genre = " ";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name here.");

        userID = input.nextLine();
        
        System.out.println("Whats your Favorite genre Comedy, Drama, Action or Mystery");
        
        genre = input.nextLine();
        
       System.out.println("Congats" + userID + " your account" + genre + "has been created");

    }
}
