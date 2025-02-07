import javax.swing.JOptionPane;
import java.util.*;

/*public*/ class RationalNumber {
   private int nominator, denominator;

   //------------------------------------------------------
   //  Constructor:
   //  - Initialization of an object "rational number"
   //  - parameter values assigned to variables
   //  - nominator contains the sign 
   //  - representation in canonical form (cancel)
   //  - no check if denominator is 0
   //------------------------------------------------------
   public RationalNumber (int nom, int denom) {

      if (denom < 0) {
         nom = -nom;
         denom = -denom;
      }
      nominator = nom;
      denominator = denom;

      cancel();
   }

   //------------------------------------------------------
   //  retrieves nominator
   //------------------------------------------------------
   public int getNominator () {
      return nominator;
   }

   //------------------------------------------------------
   //  retrieves denominator
   //------------------------------------------------------
   public int getDenominator () {
      return denominator;
   }

   //------------------------------------------------------
   // returns the inverse as a rational number
   //------------------------------------------------------
   public RationalNumber inverse () {
      return new RationalNumber (denominator, nominator);
   }

   //------------------------------------------------------
   //  - addition of two rational numbers
   //  - returns the sum as rational number
   //------------------------------------------------------
   public RationalNumber add (RationalNumber op2) {
      int commonDenominator = denominator * op2.getDenominator();
      int nominator1 = nominator * op2.getDenominator();
      int nominator2 = op2.getNominator() * denominator;
      int sum = nominator1 + nominator2;
      return new RationalNumber (sum, commonDenominator);
   }

   //------------------------------------------------------
   //  - subtraction (this number - parameter op2)
   //  - returns difference
   //------------------------------------------------------
   public RationalNumber subtract (RationalNumber op2) {
      int commonDenominator = denominator * op2.getDenominator();
      int nominator1 = nominator * op2.getDenominator();
      int nominator2 = op2.getNominator() * denominator;
      int difference = nominator1 - nominator2;
      return new RationalNumber (difference, commonDenominator);
   }

   //------------------------------------------------------
   //  - multiplikation of two rational numbers
   //  - returns product as rational number
   //------------------------------------------------------
   public RationalNumber multiply (RationalNumber op2) {
      int nom = nominator * op2.getNominator();
      int denom = denominator * op2.getDenominator();
      return new RationalNumber (nom, denom);
   }

   //------------------------------------------------------
   //  - division (this number / parameter op2)
   //  - returns quotient as rational number
   //------------------------------------------------------
   public RationalNumber divide (RationalNumber op2) {
      return multiply (op2.inverse());
   }

   //------------------------------------------------------
   //  compare two rational numbers 
   //  (in canonical form by construction)
   //------------------------------------------------------
   public boolean equals (RationalNumber op2) {
      return ( nominator == op2.getNominator() 
                      && denominator == op2.getDenominator() );
   }

   //------------------------------------------------------
   //  transform a rational number to a String
   //------------------------------------------------------
   public String toString () {
      String result;
      if (nominator == 0)
         result = "0";
      else
         if (denominator == 1)
            result = nominator + "";
         else
            result = nominator + "/" + denominator;
      return result;
   }

   //------------------------------------------------------
   //  cancel a rational number
   //  (i.e., convert it into its canonical form)
   //------------------------------------------------------
   private void cancel () {
      if (nominator != 0) {
         int common = gcd (Math.abs(nominator), denominator);
         nominator = nominator / common;
         denominator = denominator / common;
      }
   }

   //------------------------------------------------------
   //  - greatest common divisor of two integers
   //  - returns gcd
   //------------------------------------------------------
   private int gcd (int number1, int number2) {
      while (number1 != number2)
         if (number1 > number2)
            number1 = number1 - number2;
         else
            number2 = number2 - number1;
      return number1;
   }
}


public class K5B03E_RationalNumbers {
   public static void main (String[] args) {
	   RationalNumber r1, r2;
      int nominator, denominator;
      char operator;
      String input = "1|-2 * 2|2"; //JOptionPane.showInputDialog ("Input:\n(Syntax: number | number operator number | number operator ... )" );
      StringTokenizer tokens = new StringTokenizer (input, " |");
         nominator = Integer.parseInt (tokens.nextToken () );
         denominator = Integer.parseInt (tokens.nextToken () );
         r1 = new RationalNumber (nominator, denominator);
      while (tokens.hasMoreTokens () ) {
         operator = tokens.nextToken().charAt(0);
         nominator = Integer.parseInt (tokens.nextToken () );
         denominator = Integer.parseInt (tokens.nextToken () );
         r2 = new RationalNumber (nominator, denominator);
         switch (operator) {
            case '+': r1 = r1.add (r2); break;
            case '-': r1 = r1.subtract (r2); break;
            case '*': r1 = r1.multiply (r2); break;
            case '/': r1 = r1.divide (r2); break;
         }
      }
      System.out.println("Result: "+r1); //JOptionPane.showMessageDialog (null,"Result: " + r1.toString());
   }
}
