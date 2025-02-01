/**
 * @author Peter Birke
 *         birke@uni-trier.de
 *
 * 12.02.2013
 */
public class Account {

  private int id;
  protected double balance;
  private String customer;
  
  public Account(int id, double balance, String customer) {
    this.id = id;
    this.balance = balance;
    this.customer = customer;
  }

  public final void deposit(double d) {
    if (d > 0) balance += d;
  }

  public void withdraw(double d) {
    if (d > 0)
      balance -= d;
  }
}
