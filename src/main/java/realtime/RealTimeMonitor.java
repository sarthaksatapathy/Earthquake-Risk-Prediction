package realtime;

import ml.RiskPredictionModel;
import java.util.ArrayDeque;
import java.util.Deque;

public class RealTimeMonitor {

    private static final Deque<String> history = new ArrayDeque<>();

    public static void newReading(double magnitude) {

        String prediction = RiskPredictionModel.predict(magnitude);

        System.out.println("New seismic reading: Magnitude " + magnitude);

        if (prediction.contains("High")) {
            System.out.println("Warning: " + prediction + "!");
        } else {
            System.out.println("Status: " + prediction + ".");
        }

        history.addFirst("Magnitude: " + magnitude + ", Prediction: " + prediction);

        if (history.size() > 5) {
            history.removeLast();
        }
    }

    public static void showHistory() {
        System.out.println("\nPrediction History (most recent first):");
        history.forEach(System.out::println);
    }
}
