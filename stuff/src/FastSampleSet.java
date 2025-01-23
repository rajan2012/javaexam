public class FastSampleSet extends SampleSet {

    public FastSampleSet(int size) {
        samples = new sample[size];
    }

    boolean test() {
        for (int i = 0; i < samples.length; i++) {
            if (samples[i].tainted == false) {
                return false;

            }
            samples[i].tainted=true;
        }
        return false;

    }
}
