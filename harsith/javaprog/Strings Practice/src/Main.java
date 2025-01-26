public class Main {
    public static void main(String[] args) {

    String s  = "jojo";
    char[] ch = s.toCharArray();
    String search = "j";
    char ser = search.charAt(0);
    int count =0;

      for(int i=0; i<ch.length;i++){

          if(ch[i] == ser)
              count++;


    }

      System.out.println(count);


    }
}