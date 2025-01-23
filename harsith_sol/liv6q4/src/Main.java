import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Map<String,Integer> m=new HashMap<>();

    public static  Map<String,Integer> addTime(String line, Map<String,Integer> records)
    {
        String[] part=line.split(":");
        String name=part[0];

        String score=part[1];

        System.out.println(name);

        System.out.println(score);

        Integer s=Integer.valueOf(score);

        System.out.println(s);

            if(records.containsKey(name))
            {
                System.out.println(records.get(name));
                if(records.get(name)>s)
                {
                    records.put(name,s);
                }
            }
            else
            {
                records.put(name,s);
            }

        return records;



    }

    public static void main(String[] args) {

        Map<String, Integer> records = new HashMap<>();

        Scanner sc =new Scanner(System.in);

        String d=sc.next();

       // Map<String,Integer> m1=addTime(d,m);

        m=addTime(d,m);

        for(String e:m.keySet())
        {
            System.out.println(e +"has"+ " value"+ m.get(e));
        }


    }
}