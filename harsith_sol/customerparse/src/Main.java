//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

                String rawData = "John Doe, 123 Main St, New York";

                // Create a CustomerParser object, which automatically parses the data
                CustomerParser customer = new CustomerParser(rawData);

                // Display formatted output
                System.out.println(customer.getFormattedCustomer());
            }
        }
