import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setFiles(List<File> files){
        this.files = files;
    }

    public List<File> getFiles(){
        return files;
    }

    public void setSubFolders(List<Folder> subFolders){
        this.subFolders = subFolders;
    }

    public List<Folder> getSubFolders(){
        return subFolders;
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubFolder(Folder subFolder) {
        subFolders.add(subFolder);
    }

    public void print(String indent) {
        System.out.print(indent + name + ": ");

        for (Folder subFolder : subFolders) {
            System.out.print("(folder) " + subFolder.getName() + ", ");
        }

        for (int i = 0; i < files.size(); i++) {
            System.out.print("(file) " + files.get(i).getName());
            if (i < files.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (Folder subFolder : subFolders) {
            subFolder.print(indent + "  ");
        }
    }

    public void delete() {
        for (File file : files) {
            file.delete();
        }
        for (Folder subFolder : subFolders) {
            subFolder.delete();
        }
    }
}