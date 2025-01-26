public class main14 {

    public static String abbreviateName(String name){

        String[] res = name.split("\\s+");
        StringBuilder sb = new StringBuilder();
        String newres = " ";


            for (int i = 0; i < res.length; i++) {

                if(i<res.length-1){

                   sb.append(res[i].charAt(0)).append(".");


            }
                else
                {
                    sb.append(res[i]);
                }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(abbreviateName("Peter Miller")); // Should print "P. Miller"
        System.out.println(abbreviateName("Edgar Allan Poe")); // Should print "E. A. Poe"
    }
}
