public class FastSampleSet extends SampleSet {

    public FastSampleSet(int size) {
        samples = new sample[size];
    }

    @Override
    public boolean test() {
        boolean allClean = true;

        // Check for contamination in each sample
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] != null && samples[i].tainted) {
                // If the sample is contaminated, mark all samples as tainted
                for (int j = 0; j < samples.length; j++) {
                    if (samples[j] != null) {
                        samples[j].tainted = true;
                    }
                }
                allClean = false;  // The experiment is not successful
                break;
            }
        }

        // If all samples are clean, the test was successful
        return allClean;
    }
}
