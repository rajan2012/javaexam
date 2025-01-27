package col3;

public abstract class SampleSet {

    Sample[] samples;

    public SampleSet(int size) {
        this.samples = new Sample[size];
    }

    public void addSample(Sample sample){

        for(int i=0; i< samples.length;i++){
            if(samples[i] == null){
                samples[i] = sample;
                break;
            }
        }

    }

    abstract  boolean test();
}
