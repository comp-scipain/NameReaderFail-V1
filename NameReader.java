import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NameReader {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        FileInputStream fstream = new FileInputStream("names.dat");
        DataInputStream inputFile = new DataInputStream(fstream);

        char name;
        boolean end = false;
        int matches = 0;
        System.out.println("Enter a length");
        int lengthInput = keyboard.nextInt();
        System.out.println("Names of length " + lengthInput);
        int nameLength;
        while (!end)
        {
            try {
                nameLength = inputFile.readInt();
                //if (nameLength == lengthInput) {
                    name = inputFile.readChar();
                    System.out.print(name);
                    matches++;
                //}
            } catch (IOException e) {
                end = true;

            }
        }
        //System.out.println(matches + " results");
        inputFile.close();
    }
}
