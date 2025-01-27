package Inheritence3;

public class SimplePlaylist implements Playlist{

    private Song[] songs;
    private int count;

    public SimplePlaylist(int capacity) {
        songs = new Song[capacity];
        count =0;
    }

    @Override
    public String play(String title) {
        for (int i = 0; i < count; i++) {
            if (songs[i].getTitle().equals(title)) {
                return songs[i].toString();
            }
        }
        return null;
    }

    @Override
    public int getSongCount() {
        return count;
    }

    public void addSong(Song song) {
        if (count < songs.length) {
            songs[count++] = song;
        } else {
            System.out.println("Playlist is full. Cannot add more songs.");
        }



    }


}


