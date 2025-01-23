//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        // Create a FastSampleSet with capacity for 5 samples
        FastSampleSet fastSampleSet = new FastSampleSet(5);

        // Create some Sample objects
        sample sample1 = new sample("Sample1", "2025-01-23");
        sample sample2 = new sample("Sample2", "2025-01-22");
        sample sample3 = new sample("Sample3", "2025-01-21");

        // Add samples to the set
        fastSampleSet.addSample(sample1);
        fastSampleSet.addSample(sample2);
        fastSampleSet.addSample(sample3);

        // Contaminate one of the samples
        sample2.tainted = true;

        // Perform the test
        boolean result = fastSampleSet.test();

        // Output the result
        System.out.println("Test result: " + result);  // Should output false because Sample2 is tainted

        // Check the tainted status of the samples after the test
        System.out.println("Sample1 tainted: " + sample1.tainted);  // Should be true
        System.out.println("Sample2 tainted: " + sample2.tainted);  // Should be true
        System.out.println("Sample3 tainted: " + sample3.tainted);
    }

}