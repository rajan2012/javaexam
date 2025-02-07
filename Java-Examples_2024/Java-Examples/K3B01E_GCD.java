import javax.swing.JOptionPane; 
/* greatest common divisor  */ 

public class K3B01E_GCD { 

public static void main(String[] args) { 

  int a,b; 

  a  = Integer.parseInt(JOptionPane.showInputDialog ("A = "));
  b  = Integer.parseInt(JOptionPane.showInputDialog ("B = ")); 

  // Euklidian Algorithm
  while (a !=  b)
  {
    if (a > b) a = a - b;
    else  b = b - a;
  } 
  
  JOptionPane.showMessageDialog (null,"The gcd is: " + a);
  }
} 
