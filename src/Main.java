 public class Main {
    public static void main(String[] args) {
        transport myTransport = transport.getInstance("BMW", "Black", (float) 4.4);
        System.out.println("In Aktau there is one white BMW with 4.4 volume");
        if (myTransport != null) {
            myTransport.getInfo();
        }
    }
}