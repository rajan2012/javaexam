import javax.swing.JOptionPane;
public class K3B07E_Switch {
 public static void main(String[] args) {
 
  int points = 0, caseid, grade = 0;
  String inWords = "wrong input";
  points = Integer.parseInt(
         JOptionPane.showInputDialog ("points: ") );

  if (points < 0  || points > 80) {}
  else {
    caseid = points / 10;
    switch (caseid) {  
      case 8:
      case 7:  grade = 1; inWords = "excellent";     break;
      case 6:  grade = 2; inWords = "good";          break;
      case 5:  grade = 3; inWords = "satisfactory"; break;
      case 4:  grade = 4; inWords = "sufficient";  break;
      default: grade = 5; inWords = "not sufficient"; 
    }
  }

  JOptionPane.showMessageDialog (null, 
        "grade: " + grade + " (" + inWords + ")");
 }
}
