public abstract class SampleSet {
    sample[] samples;

    void addSample(sample sample)
    {
        if(samples[0] !=null)
        {
            return;
        }
         samples[0]=sample;
    }

   abstract boolean test();
}
