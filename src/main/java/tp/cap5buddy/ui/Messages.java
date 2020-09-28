package tp.cap5buddy.ui;

public class Messages {
    private static final String STARTING_MESSAGE = "Welcome to Cap 5.0 Buddy!";

    private static final String CLOSING_MESSAGE = "Program shutting down, hope to see you again!";

    public static String getStart() {
        return STARTING_MESSAGE;
    }

    public static String getClose() {
        return CLOSING_MESSAGE;
    }

    //not done
    public String moduleDetails(Module module) {
        return "wtf";
    }
}
