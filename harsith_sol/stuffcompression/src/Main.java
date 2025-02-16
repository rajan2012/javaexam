//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

   String s ="aabcccccaaa";

   StringBuilder sb=new StringBuilder();

   int c=1;

   for(int i=0;i<s.length()-1;i++)
   {
       if(s.charAt(i)==s.charAt(i+1)||i==s.length())
       {
           System.out.println("i is in if"+i);
           c++;
           System.out.println(s.charAt(i));
       }
       else
       {
           sb.append(s.charAt(i)).append(c);
           c=1;
           System.out.println("i is in else"+i);
           System.out.println(s.charAt(i));
       }
   }

   System.out.println(sb.toString());

    }
}