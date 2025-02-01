public class Evaluation {
    public static void main(String[] args) {

        Song sg1 = new Song("Living In A Ghost Town", "Rolling Stones");
        Song sg2 = new Song("Yesterday", "The Beatles");
        Song sg3 = new Song("If Tomorrow Never Comes", "Ronan Keating");
                

        System.out.println("Testing Song Class");
            
        Playlist db = new SimplePlaylist(2);
            
        db.addSong(sg1);
        System.out.println("Size: " +db.getSize());
        db.addSong(sg2);
        System.out.println("Size: " + db.getSize());
        db.addSong(sg3);
        System.out.println("Size: " + db.getSize());

        Song sgA = db.play("Yesterday");
        System.out.println(sgA.getTitle());
        System.out.println(sgA.getBand());
        
        Song sgB = db.play("If Tomorrow Never Comes");
        System.out.println(sgB);
            
    }
}
