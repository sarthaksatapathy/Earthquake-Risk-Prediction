package ml;

public class RiskPredictionModel {

    public static String predict(double magnitude) {

        if (magnitude >= 6.0) {
            return "High risk of earthquake";
        } else if (magnitude >= 4.5) {
            return "Moderate risk";
        } else {
            return "Low risk of earthquake";
        }
    }
}
