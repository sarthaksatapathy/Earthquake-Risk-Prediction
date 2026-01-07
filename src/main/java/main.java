import realtime.RealTimeMonitor;

public class main {

    public static void main(String[] args) {

        RealTimeMonitor.newReading(4.7);
        RealTimeMonitor.newReading(6.2);

        RealTimeMonitor.showHistory();
    }
}
