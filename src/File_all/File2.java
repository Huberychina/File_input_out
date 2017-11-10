package File_all;
import java.io.File;
import java.io.IOException;

class File2{

    public static void main(String[] args) {

        File file = new File("d:\\test_file.txt");
        File2.judeFileExists(file);

        File dir = new File("d:\\test_dir");
        File2.judeDirExists(dir);
    }

    // �ж��ļ��Ƿ����
    public static void judeFileExists(File file) {

        if (file.exists()) {
            System.out.println("file exists");
        } else {
            System.out.println("file not exists, create it ...");
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }

    // �ж��ļ����Ƿ����
    public static void judeDirExists(File file) {

        if (file.exists()) {
            if (file.isDirectory()) {
                System.out.println("dir exists");
            } else {
                System.out.println("the same name file exists, can not create dir");
            }
        } else {
            System.out.println("dir not exists, create it ...");
            file.mkdir();
        }

    }

}