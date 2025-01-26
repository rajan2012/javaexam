//if is used to satisfy condtion that last name should not be abbreviated.

public class su4 {

    public static String abbreviateName(String name){

        String[] parts = name.split("\\s+");
        StringBuilder ab = new StringBuilder();

        for(int i=0; i<parts.length;i++){

            if(i<parts.length-1){
                ab.append(parts[i].charAt(0)).append(".");
            }
            else{
                ab.append(parts[i]);
            }


        }

        return ab.toString();

    }


    public static void main(String[] args) {
        System.out.println(abbreviateName("Peter Miller")); // Should print "P. Miller"
        System.out.println(abbreviateName("Edgar Allan Poe")); // Should print "E. A. Poe"
    }



}
