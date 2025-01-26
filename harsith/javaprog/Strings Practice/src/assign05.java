public class assign05 {

    static int overlap(String str1, String str2){

        String[] res1 = str1.toLowerCase().split("\\s+");
        String[] res2 = str2.toLowerCase().split("\\s+");
        int overlapcount =0;

        for(int i=0; i< res1.length;i++){

            for(int j=0; j< res2.length;j++){

                if(res1[i].equals(res2[j]) && res2[j] != null){

                    overlapcount++;
                    res2[j] = null;
                    break;

                }

            }

        }
        return overlapcount;
    }



    public static void main(String[] args) {
        String str1 = "This is an easy example";
        String str2 = "This is another example";
        System.out.println("Overlap: " + overlap(str1, str2)); // Overlap: 3

        String str1b = "Just another example";
        String str2b = "This is a sentence";
        System.out.println("Overlap: " + overlap(str1b, str2b)); // Overlap: 0
    }
}
