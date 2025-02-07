import javax.swing.JOptionPane;
public class K3B06E_nested_Branches {
 public static void main(String[] args) {
 
  int points = 0, grade = 0;
  String inWords = "wrong input";

  points = Integer.parseInt(
       JOptionPane.showInputDialog ("Points: "));
 
  if (points < 0  || points > 80) {}
  else 
   if (points <  40) { grade = 5; inWords = "not sufficient"; }
   else
    if (points < 50 ) { grade = 4; inWords = "sufficient"; }
    else
     if (points < 60 ) { grade = 3; inWords = "satisfactory"; }
     else
      if (points < 70 ) { grade = 2; inWords = "good"; }
      else
        { grade = 1; inWords = "excellent"; }

  JOptionPane.showMessageDialog (null, 
              "grade: " + grade + " (" + inWords + ")");
 }
}
