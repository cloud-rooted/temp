public class CommandLineDemo {
    public static void main(String[] args) {

        if(args.length == 0) {
            System.out.println("No arguments provided");
            return;
        }

        System.out.println("Command Line Arguments:");
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }

        // Example: sum of two numbers passed as arguments
        if(args.length >= 2) {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println("Sum of first two arguments: " + (a + b));
        }
    }
}
