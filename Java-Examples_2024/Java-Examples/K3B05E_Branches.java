import javax.swing.JOptionPane;
public class K3B05E_Branches {
   public static void main(String[] args) {
 
      int points=0, grade = 0;
           // list of declarations with initialization
      String inWords = "wrong input";
           //  more on Strings later

      points = Integer.parseInt(JOptionPane.showInputDialog ("Points: "));
 
      if (points <  40 && points >= 0) 
         { grade  = 5; inWords  = "not sufficient";  }
      if (points >=  40 && points < 50 ) 
         { grade = 4; inWords  = "sufficient";  }
      if (points >=  50 && points < 60 ) 
         { grade = 3; inWords  = "satisfactory";  }
      if (points >=  60 && points < 70 ) 
         { grade = 2; inWords  = "good";  }
      if (points >=  70 && points <= 80) 
         { grade = 1; inWords  = "excellent";  }

      JOptionPane.showMessageDialog (null, "grade: " + grade + " (" + inWords + ")");
   }
}
