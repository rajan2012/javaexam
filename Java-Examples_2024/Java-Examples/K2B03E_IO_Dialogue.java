//import java.util.Locale;

import javax.swing.JOptionPane;

public class K2B03E_IO_Dialogue {
  public static void main(String[] args) {
    int    inputNumber;
    String inputText;

//	  the following is used to guarantee English labels 
//    Locale locale = new Locale("en","US");
//    Locale.setDefault(locale);
//    JOptionPane.setDefaultLocale(locale);
    
    inputText=JOptionPane.showInputDialog("Please input:");

    inputNumber = Integer.parseInt(inputText);
 
    JOptionPane.showMessageDialog (null,"Input: " + inputNumber);
  }
}
