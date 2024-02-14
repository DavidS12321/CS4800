public class Main {
    public static void main(String[] args) {
        Folder rootFolder = new Folder("Demo1");

        rootFolder.addFile(new File("htaaccess"));
        rootFolder.addFile(new File("htrouter"));
        rootFolder.addFile(new File("index.html"));

        Folder phalconFolder = new Folder("phalcon");
        Folder appFolder = new Folder("app");

        for (int i = 1; i <= 5; i++) {
            appFolder.addFile(new File("stuff" + i));
        }

        rootFolder.addSubFolder(phalconFolder);
        rootFolder.addSubFolder(appFolder);

        rootFolder.print("");
    }
}