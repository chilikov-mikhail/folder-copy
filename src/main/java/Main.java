import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

            System.out.println("Укажите путь к папке, которую надо скопировать");
            Scanner scanner = new Scanner(System.in);
            String sourceDirectory = scanner.nextLine();

            System.out.println("Укажите куда копировать");
            scanner = new Scanner(System.in);
            String destinationDirectory = scanner.nextLine();

            FileUtils.copyFolder(sourceDirectory, destinationDirectory);
    }
}
