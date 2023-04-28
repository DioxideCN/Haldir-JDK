package haldir.extension;

public class RetrialHandler {

    static void retrialHandler(Runnable block) {
        System.out.println("Hello JDK");
        block.run();
    }

    private RetrialHandler() {
    }

}
