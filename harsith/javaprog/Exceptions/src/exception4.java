public class exception4 {

    public static String bookinfo(String bkinfo) throws IllegalArgumentException{


        if(bkinfo==null|| bkinfo.isEmpty()){

            throw new IllegalArgumentException("Input cannot be null or empty.");

        }
        String[] parts = bkinfo.split(";");

        if (parts.length != 3) {
            throw new IllegalArgumentException("Invalid input format. Expected format: 'ISBN;Name;Comment'.");
        }


        int isbn = -1;

        try{
            isbn = Integer.parseInt(parts[0].trim());
        }
         catch (Exception e){
             System.err.println("Invalid ISBN format. Setting ISBN to -1.");

         }

        String name;

        name = parts[1].trim();
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty.");
        }

        String abstractText;

        abstractText = parts[2].trim();
        if (abstractText.isEmpty()) {
            throw new IllegalArgumentException("Comment cannot be empty.");
        }
// Constructing and returning the output directly
        return "Isbn: " + isbn + "\nName: " + name + "\nAbstract: " + abstractText;


    }




    public static void main(String[] args){

        String bkinfo = "1234;Harry Potter;This is a book"; // Example input
        try {
            System.out.println(bookinfo(bkinfo));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




    }
}
