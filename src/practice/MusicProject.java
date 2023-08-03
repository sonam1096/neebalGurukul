package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class MusicTrack {
    String track;
    String artist;
    String genre;
    int bpm;
    int popular;

    public MusicTrack(String track, String artist, String genre, int bpm, int popular) {
        this.track = track;
        this.artist = artist;
        this.genre = genre;
        this.bpm = bpm;
        this.popular = popular;
    }

    // Getter methods for each field (track, artist, genre, bpm, popular) can be added here.
    // For simplicity, we are omitting them in this example.
}

public class MusicProject {
    private List<MusicTrack> musicTracks;

    public MusicProject() {
        musicTracks = new ArrayList<>();
    }

    public void addMusicTrack(MusicTrack track) {
        musicTracks.add(track);
    }

    public void readMusicList() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of music tracks:");
        int numTracks = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        for (int i = 0; i < numTracks; i++) {
            System.out.println("Enter track name:");
            String track = scanner.nextLine();

            System.out.println("Enter artist name:");
            String artist = scanner.nextLine();

            System.out.println("Enter genre:");
            String genre = scanner.nextLine();

            System.out.println("Enter BPM:");
            int bpm = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.println("Enter popular:");
            int popular = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            MusicTrack trackN = new MusicTrack(track, artist, genre, bpm, popular);
            addMusicTrack(trackN);
        }

        
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome! What's the name of the user?");
        String userName = scanner.nextLine();

        System.out.println("\nWho's your favorite artist?");
        String favoriteArtist = scanner.nextLine();

        System.out.println("\nWhat's your favorite genre?");
        String favoriteGenre = scanner.nextLine();

        System.out.println("\nWhat's your preferred BPM? [78]");
        int preferredBPM = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("\nDo you like popular music? (Y/N) [y]");
        String likePopularMusic = scanner.nextLine().trim().toLowerCase();
        boolean likePopular = likePopularMusic.isEmpty() || likePopularMusic.equals("y");

        System.out.println("\nHi " + userName + "!\n");

        
    }

    public static void main(String[] args) {
        MusicProject recommender = new MusicProject();

        recommender.readMusicList();
        recommender.run();
    }
}

