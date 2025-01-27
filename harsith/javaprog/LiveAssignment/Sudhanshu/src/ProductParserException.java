

    public class ProductParserException {

        @Override
        public String toString() {
            return "ProductParser{}";
        }

        public Product parse(String productString) throws Exception{


            String[] parts = productString.split(";");

            if (parts.length < 3) {
                throw new Exception("Product string format is invalid.");
            }

            String id = parts[0].trim();
            String name = parts[1].trim();
            String price = parts[2].trim();

            int newID = -1;
            if(parts[0].length() == 5 ) {

                try {

                    newID = Integer.parseInt(id);
                } catch (NumberFormatException e) {
                    newID = -1;
                }
            }

            if(name.isEmpty()){

                name = ("UNKNOWN");

            }

            double newPrice = 0.0;

            try{
                newPrice = Double.parseDouble(price);
            }
            catch (ArithmeticException e){
                newPrice = 0.0;
            }

           // String output = newID + name + newPrice; if product class not there use like this;

            return new Product(newID, name, newPrice);

        }



    public static void main(String[] args) throws Exception {
        ProductParserException parser = new ProductParserException();

        // Example product strings
        String productInfo1 = "12345;Smartphone;399.99";
        String productInfo2 = "12;Smartphone;399.99"; // ID should be set to -1
        String productInfo3 = ";Smartphone;399.99"; // ID should be -1, name is fine
        String productInfo4 = "12345;;399.99"; // Name should be set to "Unknown"
        String productInfo5 = ";;399.99"; // ID should be -1, Name should be "Unknown"

        // Parse and print product details
        System.out.println(parser.parse(productInfo1).getName()); // Should print "Smartphone"
        System.out.println(parser.parse(productInfo2).getId()); // Should print -1
        System.out.println(parser.parse(productInfo3).getId()); // Should print -1
        System.out.println(parser.parse(productInfo4).getName()); // Should print "Unknown"
        System.out.println(parser.parse(productInfo5).getId() + " " + parser.parse(productInfo5).getName()); // Should print "-1 Unknown"
    }
        public class Product {
            private int id;
            private String name;
            private double price;

            public Product(int id, String name, double price) {
                this.id = id;
                this.name = name;
                this.price = price;
            }

            // Getter methods
            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public double getPrice() {
                return price;
            }
        }

    }
