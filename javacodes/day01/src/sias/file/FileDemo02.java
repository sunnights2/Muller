package sias.file;

import java.io.File;

public class FileDemo02 {
    static String myFile = "E:\\java_code\\src\\sias\\file";

    public static void main(String[] args) {
        File f = new File(myFile + "java.txt");
        // public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
        // public boolean isFile()：测试此抽象路径名表示的File是否为文件
        // public boolean exists()：测试此抽象路径名表示的File是否存在
        System.out.println(f.isDirectory());
        System.out.println(f.isFile());
        System.out.println(f.exists());

        // public String getAbsolutePath()：返回此抽象路径名的绝对路径名字符串
        // public String getPath()：将此抽象路径名转换为路径名字符串
        // public String getName()：返回由此抽象路径名表示的文件或目录的名称
        System.out.println(f.getAbsolutePath());
        System.out.println(f.getPath());
        System.out.println(f.getName());
        System.out.println("--------");

        // public File[] listFiles()：返回此抽象路径名表示的目录中的文件和目录的File对象数组
        File f2 = new File("D:\\sias");
        File[] fileArray = f2.listFiles();
        for (File file : fileArray) {
            // System.out.println(file);
            // System.out.println(file.getName());
            if (file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }
}
