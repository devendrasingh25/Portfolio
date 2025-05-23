public class SimpleInput {
    public static void main(String[] args) {
        byte[] inputBuffer = new byte[100];
        int bytesRead;

        try {
            System.out.print("Enter your name: ");
            bytesRead = System.in.read(inputBuffer);
            String name = new String(inputBuffer, 0, bytesRead - 2); // -2 to remove newline characters
            System.out.println("Hello, " + name + "!");
        } catch (IOException e) {
            System.err.println("An error occurred while reading input.");
        }
    }
}

