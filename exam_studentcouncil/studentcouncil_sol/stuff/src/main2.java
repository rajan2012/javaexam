//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class main2 {
    public static void main(String[] args) {

       String s="rajan";
       int[] ch=new int[256];

       for(char c:s.toCharArray())
       {
           if(ch[c]!=0)
           {
              System.out.println("first repeated char "+c);
              break;
           }
           else
           {
               ch[c]++;
           }
       }
    }
}