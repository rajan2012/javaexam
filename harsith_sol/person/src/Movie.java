public class Movie extends Tvitem{

    int duration;

    public Movie(String title,int duration) throws IllegalException
    {
        super(title);
        if(duration<=0)
        {
            throw new IllegalException(duration);
        }
        this.duration=duration;
    }
}
