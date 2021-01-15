package deadpool;

public class DeadPool {

    static {
        System.loadLibrary("deadpool");
    }

    public static void init() {
        native_init();
    }

    public static native void native_init();
}
