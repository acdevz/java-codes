package basics;

import java.io.Console;

public class Consoles {
    public static void main(String[] args) {

        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }
        /* input from console */
        String username = console.readLine("Enter your username: ");
        char[] password = console.readPassword("Enter your password: ");

        /* writing to console */
        console.writer().println("Logging in...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        console.writer().println("Welcome " + username);
    }
}
