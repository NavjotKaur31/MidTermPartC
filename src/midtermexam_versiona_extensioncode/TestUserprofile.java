/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TestUserprofile {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // 2. Display list of possible genres
        String[] genres = {"Comedy", "Drama", "Action", "Mystery", "Sci-Fi", "Horror"};
        System.out.println("\nAvailable Genres:");
        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        // 3. Prompt user to choose a genre
        System.out.print("Choose your favorite genre (enter number 1-" + genres.length + "): ");
        int choice = scanner.nextInt();
        String selectedGenre = genres[choice - 1];

        // 4. Instantiate UserProfile object (assuming UserProfile constructor takes name and genre)
        UserProfile userProfile = new UserProfile(name, selectedGenre);

        // 5. Display confirmation message
        System.out.println("\nYour userProfile was created for " + userProfile.getUserID() + " with favorite genre " + userProfile.getGenre() + "!");

        scanner.close();
    }

    
}
