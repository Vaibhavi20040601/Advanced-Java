package stringtest;

public class StringPerformanceTest {
    public static void main(String[] args) {

        final int ITERATIONS = 10000;
        String textToAppend = "AIET";

        // --- Test with StringBuffer (Thread-safe, but slower)
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            stringBuffer.append(textToAppend);
        }

        long endTimeBuffer = System.nanoTime();
        long durationBuffer = endTimeBuffer - startTimeBuffer;

        // --- Test with StringBuilder (Not thread-safe, but faster)
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < ITERATIONS; i++) {
            stringBuilder.append(textToAppend);
        }

        long endTimeBuilder = System.nanoTime();
        long durationBuilder = endTimeBuilder - startTimeBuilder;

        // --- Results ---
        System.out.println("Time taken by StringBuffer: " + durationBuffer + " nanoseconds");
        System.out.println("Time taken by StringBuilder: " + durationBuilder + " nanoseconds");

        if (durationBuilder < durationBuffer) {
            System.out.println("✔ StringBuilder is faster.");
        } else {
            System.out.println("✔ StringBuffer is faster.");
        }
    }
}

