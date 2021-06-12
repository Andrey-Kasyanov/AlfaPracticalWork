package work22;

public class Task22 {
    public static void main(String[] args) {
            long p_currentTime = System.currentTimeMillis() / 1000;
            long p_sec = p_currentTime % 60;
            p_currentTime /= 60;
            long p_minute = p_currentTime % 60;
            p_currentTime /= 60;
            long p_hour = p_currentTime % 24;
            p_currentTime /= 24;

            System.out.println("dd:hh:mm:ss -> " + p_currentTime + ":" + p_hour + ":" + p_minute + ":" + p_sec);
    }
}
