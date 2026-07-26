public class Engine {

    public void start() {
        System.out.println("Starting Engine");
    }

    public void start(boolean silentMode) {
        if (silentMode) {
            System.out.println("Silent Mode");
        }  else {
            System.out.println("Starting Vehicle");
        }
    }

}
