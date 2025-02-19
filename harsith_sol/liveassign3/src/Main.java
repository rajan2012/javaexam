//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String rearrange3(String word, int[] sequence) {
        // Validate the sequence for invalid indices

        for (int index : sequence) {
            if (index < 0 || index >= word.length()) {
                return "Invalid Sequence"; // Return "Invalid Sequence" if any index is out of bounds
            }
        }

        // Create a character array to store the rearranged characters
        char[] rearranged = new char[word.length()];

        // Rearrange the characters in the word according to the sequence
        for (int i = 0; i < sequence.length; i++) {
            rearranged[i] = word.charAt(sequence[i]);
        }

        // Convert the character array to a string and return
        return new String(rearranged);
    }

    public static String rearrange2(String word, int[] sequence)
    {
        char[] s=new char[word.length()];



        for(int i=0;i<word.length();i++)
        {
            if(sequence[i]<0 ||sequence[i]>9) {
                return "invalid";
                //can i use break here

            }
            else
            {

                s[i] = word.charAt(sequence[i]);
            }

        }

        return new String(s);
    }

    public static String rearrange(String word, int[] sequence) throws IndexOutOfBoundsException
    {
        char[] s=new char[word.length()];

        String s2="";


        for(int i=0;i<word.length();i++)
        {
            if(sequence[i]<0 ||sequence[i]>9) {
                throw new IndexOutOfBoundsException("illegal out"+sequence[i]);
                //can i use break and leave

            }
            else
            {
                s2 += word.charAt(sequence[i]);
            }

        }

        return s2;
    }


    public static void main(String[] args) {

       // int[] a=new int[5, 6, 7, 8, 9, 0, 1, 2, 3, 4];

        int[] a={5, 6, 7, 8, 9, 0, -1, 2, 9, 4};

        try {
            String s2 = rearrange("juiceApple", a);
            System.out.println(s2);
        }
        catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }


        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}