package files;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the file:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("File does not exist. Creating a new file.");
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("An error occurred while creating the file.");
                e.printStackTrace();
                return;
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Read the file");
            System.out.println("2. Write to the file");
            System.out.println("3. Update the file");
            System.out.println("4. Delete the file");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    readFile(file);
                    break;
                case 2:
                    writeFile(file);
                    break;
                case 3:
                    updateFile(file);
                    break;
                case 4:
                    deleteFile(file);
                    return;
                case 5:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void readFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            System.out.println("File content:");
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    private static void writeFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the content to write to the file:");
            String content = scanner.nextLine();
            writer.write(content);
            System.out.println("Content successfully written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    private static void updateFile(File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            readFile(file);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the content to append to the file:");
            String content = scanner.nextLine();
            writer.newLine();
            writer.write(content);
            System.out.println("Content successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }

    private static void deleteFile(File file) {
        try {
            Files.deleteIfExists(file.toPath());
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while deleting the file.");
            e.printStackTrace();
        }
    }
}

                




