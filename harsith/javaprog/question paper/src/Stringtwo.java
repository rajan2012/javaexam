public class Stringtwo {

    public static String[] divide(String str, int parts) {

        if((str.length() % parts) != 0){
            return null;
        }

        String[] result = new String[parts];
        int partSize = str.length()/parts;

        for(int i=0; i<parts;i++){

           result[i] = str.substring(i*partSize, (i+1)*partSize);

        }

        return result;

    }

    public static void main(String[] args){


        String name = "abcdefghij";
        int num = 5;
        String[] dividedstring = divide(name, num);

        if(!dividedstring[0].equals("")){

            for (int i = 0; i < dividedstring.length; i++){

                System.out.println(dividedstring[i]);
            }

        }

        else {
            System.out.println("Cannot divide the string into equal parts");
        }

    }


}
