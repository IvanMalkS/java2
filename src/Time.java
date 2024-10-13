public class Time {
    final private long seconds;

    public Time(long seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Invalid input: time cannot be negative.");
        }
        this.seconds = seconds;
    }

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || minutes < 0 || seconds < 0) {
            throw new IllegalArgumentException("Invalid input: time cannot be negative.");
        }
        if (hours >= 24 || minutes >= 60 || seconds >= 60) {
            throw new IllegalArgumentException("Invalid input: time values are out of range.");
        }
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }


    public int getHours() {
        return (int) (seconds / 3600) % 24;
    }


    public int getMinutes() {
        return (int) (seconds / 60) % 60;
    }

    public int getSeconds() {
        return (int) seconds % 60;
    }

    @Override
    public String toString() {
        long totalSeconds = this.seconds % (24 * 3600);
        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

}
