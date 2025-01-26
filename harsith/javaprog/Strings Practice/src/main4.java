public class main4 {

    public static void main(String args[]){
        String name = "@This @is shubham";
        StringBuilder sb = new StringBuilder();

        String[] in = name.split("\\s+");

        String res2 = " ";

        for(int j=0; j<in.length;j++) {

            if (in[j].contains("@")) {

                res2 = res2 + in[j] + " ";
            }
        }
            System.out.println(res2.trim());

        for(int i=in.length-1;i>=0;i--){

            if(in[i].contains("@")) {

                sb.append(in[i]).append(" ");
            }
        }

         System.out.println(sb);

    }

}
