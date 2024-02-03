package playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class PlaylistAdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        System.out.println("Welcome to the Music Playlist Manager!");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Remove a song from the playlist");
            System.out.println("3. Display the current playlist");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1, 2, 3, or 4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song: ");
                    scanner.nextLine(); // Consume the newline character left by nextInt()
                    String songName = scanner.nextLine();
                    playlist.add(songName);
                    System.out.println("Song added to the playlist: " + songName);
                    break;

                case 2:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Cannot remove a song.");
                    } else {
                        System.out.print("Enter the name of the song to remove: ");
                        scanner.nextLine(); // Consume the newline character left by nextInt()
                        String removeSong = scanner.nextLine();
                        if (playlist.remove(removeSong)) {
                            System.out.println("Song removed from the playlist: " + removeSong);
                        } else {
                            System.out.println("Song not found in the playlist.");
                        }
                    }
                    break;

                case 3:
                    if (playlist.isEmpty()) {
                        System.out.println("Playlist is empty. Add some songs first!");
                    } else {
                        System.out.println("Current Playlist:");
                        for (String song : playlist) {
                            System.out.println("- " + song);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting Music Playlist Manager. Goodbye!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
            }
        }
    }
}


