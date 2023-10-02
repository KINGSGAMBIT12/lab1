public class transport {
    private final String name;
    private final String color;
    private final float volume; // Change to double if needed
    private static transport instance;

    private transport(String name, String color, float volume) { // Change to double if needed
        this.name = name;
        this.color = color;
        this.volume = volume;
    }

    public static transport getInstance(String name, String color, float volume) { // Change to double if needed
        if (instance == null) {
            instance = new transport(name, color, volume);
        }
        return instance;
    }

    public static transport getInstance() {
        return instance;
    }

    public void getInfo() {
        System.out.println("Name: " + name + ", color: " + color + ", volume: " + volume + " liters");
    }
}