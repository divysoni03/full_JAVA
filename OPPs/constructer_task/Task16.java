// 16. Static Factory Method:
//      Create a 'Task16' class with fields 'hour' and 'minute'. Implement a private constructor and a static factory method 'of' that takes 'hour' and 'minute' as parameters and returns a new 'Task16' object. The factory method should validate that the 'hour' is between 0 and 23 and the 'minute' is between 0 and 59.

public class Task16 {
    private int hour;
    private int minute;

    private Task16(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public static Task16 of(int hour, int minute) {
        if (hour < 0 || hour > 23) {
            System.out.println("Error: Hour must be between 0 and 23.");
            return null;
        }
        if (minute < 0 || minute > 59) {
            System.out.println("Error: Minute must be between 0 and 59.");
            return null;
        }
        return new Task16(hour, minute);
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }

    // @Override
    // public String toString() {
    //     return String.format("%02d:%02d", hour, minute);
    // }

    public static void main(String[] args) {
        Task16 validTime = Task16.of(14, 30);
        if (validTime != null) {
            System.out.println("Valid Task16: " + validTime);
        }
    }
}
