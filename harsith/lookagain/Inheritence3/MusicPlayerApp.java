package Inheritence3;

public class MusicPlayerApp {

    public static void main(String[] args) {
        // Create a playlist with a capacity of 5 songs
        SimplePlaylist myPlaylist = new SimplePlaylist(5);

        // Add songs to the playlist
        myPlaylist.addSong(new Song("Yesterday", "The Beatles"));
        myPlaylist.addSong(new Song("Bohemian Rhapsody", "Queen"));
        myPlaylist.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));

        // Try to play a song that exists
        String songDetails = myPlaylist.play("Yesterday");
        if (songDetails != null) {
            System.out.println("Now playing: " + songDetails);
        } else {
            System.out.println("Song not found.");
        }

        // Try to play a song that doesn't exist
        songDetails = myPlaylist.play("Imagine");

        if (songDetails != null) {
            System.out.println("Now playing: " + songDetails);
        } else {
            System.out.println("Song not found.");
        }

        // Display the number of songs in the playlist
        System.out.println("Total songs in playlist: " + myPlaylist.getSongCount());
    }





}
