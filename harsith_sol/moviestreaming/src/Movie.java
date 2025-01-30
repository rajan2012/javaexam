import java.util.List;

public class Movie {

    String title;
    List<String> genres;

    public Movie(String title,List<String> genres)
    {
        this.title=title;
        this.genres=genres;
    }

    void setTitle(String title)
    {
        this.title=title;
    }

    void setGenres(List<String> genres)
    {
        this.genres=genres;
    }

    String getTitle()
    {
        return title;
    }

    List<String> getGenres()
    {
        return genres;
    }

    @Override
    public String toString()
    {


        return "movie" + title +" genre "+genres;
        //genres.toString()
    }
}
