public class Main {

    public static void main(String[] args) {
        Book b = new Book("raj", "sapiens of humankind", 2002, 200);

        b.append("abcdef");

        Book.setPublisher("oiley");

       String res= b.quote(1,15);

        System.out.println(b.getcontent());

        System.out.println(res);

        System.out.println(Book.count);



        System.out.println(b.toString());
    }
}
