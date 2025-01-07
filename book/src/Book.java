import java.util.*;

class Book
{
    private String author;
    private String title;
    private int yearOfPublication;
    private int pageNumber;
    private  String content="";

    static int count=0;

    private static String publisher="";

    public Book(String author, String title,
                int yearOfPublication, int pageNumber)
    {
        this.author=author;
        this.title=title;
        this.yearOfPublication=yearOfPublication;
        this.pageNumber=pageNumber;
        count++;
        content="";


    }

    public void append(String str)
    {
        this.content=this.content.concat(str);
    }

    public static void setPublisher(String p)
    {
        publisher=p;
    }

    public String getcontent()
    {
        return this.content;
    }


    public String quote(int start, int length)
    {
        if(content.length()<length)
        {
            return content.substring(start);
        }
        else
        {
            return content.substring(start,length);
        }
    }

    @Override
    public String toString()
    {
        return "The book "+title+" with "+ pageNumber +" by the author "+ author+ " has been published by the publishing company "+ publisher+ " in "+yearOfPublication;
    }




}