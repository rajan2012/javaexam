import javax.swing.*;
public class K4B10E_Dice {
  public static void main( String args[] ) {
    int frequency[] = new int[ 8 ];

    for ( int roll = 1; roll <= 300; roll++ ) 
       frequency [ 1 + ( int ) ( Math.random () * 6 ) ] ++;  


    String output = "number of pips\tfrequency\thistogram";
    for ( int side = 0; side < frequency.length; side++ ) {
        output += "\n" + side + "\t" + frequency[ side ] + "\t";
        for ( int k = 0; k < frequency[ side ]; k++ )
           output += "*"; 
    }

    JTextArea outputArea = new JTextArea();
    outputArea.setText( output );
    JOptionPane.showMessageDialog( null, outputArea,
      "300 throws yield:", JOptionPane.INFORMATION_MESSAGE );
  }
}
