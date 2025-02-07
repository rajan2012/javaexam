public class K2B02E_IO_Console {
  public static void main(String[] args){
    int    inputNumber;
    String inputText;
    
    inputText = System.console().readLine("Input: ");

    inputNumber = Integer.parseInt(inputText);
    
    System.out.println("Output: " + inputNumber);
  }
}
