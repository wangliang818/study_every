package file_test;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * 关于文件的操作
 * file描述文件和目录
 * 1.如何构造file文件对象  看java api
 *
 */
public class Test {
    public static void main(String[] args) {

        /*1.创建
                2.构造*/
        newFolder();

        new New().main();

    }

    private static void newFolder() {
        System.out.println("Hello World!");
        try {
            String filePath = "D:\\demo.txt";
            filePath = filePath.toString();
            File  myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
                System.out.println("Hello !");
                FileWriter resultFile = new FileWriter(myFilePath);
                PrintWriter myFile = new PrintWriter(resultFile);
                String strContent = "创建";
                myFile.println(strContent);
                resultFile.close();
            }
        }
        catch (Exception e) {
            System.out.println("新建目录操作出错");
            e.printStackTrace();
        }

    }

}
