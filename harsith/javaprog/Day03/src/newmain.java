public class newmain {

    public static String[] divide(String str, int parts){

      if(str.length()%parts != 0)  {
          return null;
      }

        int partsize = str.length()/parts;
        String[] res = new String[parts];

        for(int i=0;i< res.length;i++){

            res[i] = str.substring(i*partsize,(i+1)*partsize);

        }

        return res;

}




    public static void main(String[] args) {


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
