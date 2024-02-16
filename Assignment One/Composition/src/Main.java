import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Demo1");

        // Create and set files for the root folder
        List<File> rootFiles = new ArrayList<>();
        rootFiles.add(new File("htaaccess"));
        rootFiles.add(new File("htrouter"));
        rootFiles.add(new File("index.html"));
        rootFolder.setFiles(rootFiles);

        Folder phalconFolder = new Folder("phalcon");
        Folder appFolder = new Folder("app");

        List<File> appFiles = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            appFiles.add(new File("stuff" + i));
        }
        appFolder.setFiles(appFiles);

        List<Folder> subFolders = new ArrayList<>();
        subFolders.add(phalconFolder);
        subFolders.add(appFolder);
        rootFolder.setSubFolders(subFolders);

        rootFolder.print("");

        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals("app")) {
                subFolders.remove(i);
                break;
            }
        }
        rootFolder.setSubFolders(subFolders);

        System.out.println();
        System.out.println("Structure after deleting 'app' folder:");
        rootFolder.print("");
        System.out.println();

        for (int i = 0; i < subFolders.size(); i++) {
            if (subFolders.get(i).getName().equals("phalcon")) {
                subFolders.remove(i);
                break;
            }
        }
        rootFolder.setSubFolders(subFolders);

        System.out.println("Structure after deleting 'phalcon' folder:");
        rootFolder.print("");
    }
}