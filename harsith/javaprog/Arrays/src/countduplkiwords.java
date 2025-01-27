public class countduplkiwords {

    public static void printDuplicateCounts(String s){

        String[] dupi = s.toLowerCase().split("\\s+");


        for(int i=0; i< dupi.length;i++){
            boolean isdupi = false;
            int dupicount =1;
            for(int j=0; j<i;j++){

                if(dupi[i].equals(dupi[j])){
                    isdupi = true;
                    dupicount++;

                }
            }
            if(dupicount>1){
                System.out.println("Word: '" + dupi[i] + "' Count: " + dupicount);
        }

        }

    }

    public static void main(String[] args) {
        String testString = "This is a test string with is a duplicate words and and duplicate words";
        printDuplicateCounts(testString);
    }
}
