package col3;

public class FastSampleSet extends SampleSet{

    public FastSampleSet(int size) {
        super(size);
    }

    @Override
    public void addSample(Sample sample) {
        super.addSample(sample);
    }


    @Override
    boolean test() {
        boolean experimentSuccessful = true; // Assume success
        for (Sample sample : samples) {
            if (sample != null && sample.tainted) {
                experimentSuccessful = false; // Found contamination, mark experiment as failed
                break; // Exit loop early as we already found a tainted sample
            }
        }
        if (!experimentSuccessful) {
            // If the experiment failed, mark all samples as tainted
            for (Sample sample : samples) {
                if (sample != null) {
                    sample.tainted = true;
                }
            }
        }
        return experimentSuccessful;  // Return the status of the experiment
    }

}
