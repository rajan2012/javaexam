public class abbreviatestring {

    public static String abbreviateName(String name){

        String[] parts = name.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=0;i< parts.length;i++){

            if(i<parts.length-1){

                sb.append(parts[i].charAt(0)).append(".");

            }
            else{
                sb.append(parts[i]);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbreviateName("Peter Miller")); // Should print "P. Miller"
        System.out.println(abbreviateName("Edgar Allan Poe")); // Should print "E. A. Poe"
    }
}