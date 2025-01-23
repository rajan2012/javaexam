public abstract class SampleSet {
    sample[] samples;

    void addSample(sample sample) {
        for (int i = 0; i < samples.length; i++) {
            if (samples[i] != null) {
                samples[i] = sample;
            }
        }
    }

   abstract boolean test();
}
