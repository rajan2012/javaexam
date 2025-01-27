package col3;

public class Test {
    public static void main(String[] args) {
        // Initialize a FastSampleSet with a capacity of 5
        FastSampleSet sampleSet = new FastSampleSet(3);

        // Add some samples, some of which might be tainted
        sampleSet.addSample(new Sample("Sample1", "2023-01-01", false));
        sampleSet.addSample(new Sample("Sample2", "2023-01-02", true)); // This one is tainted
        sampleSet.addSample(new Sample("Sample3", "2023-01-03", false));

        // Perform the test on the sample set
        boolean isExperimentSuccessful = sampleSet.test();

        // Output the result of the test
        System.out.println("Experiment Successful: " + isExperimentSuccessful);

        // Check the contamination status of each sample after the experiment
        for (int i = 0; i < sampleSet.samples.length; i++) {
            if (sampleSet.samples[i] != null) {
                System.out.println(sampleSet.samples[i].name + " Tainted: " + sampleSet.samples[i].tainted);
            }
        }
    }
}

