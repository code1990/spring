package org.springframework;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private static final String path = "D:\\IdeaProjects\\spring-framework";
    private static final String parent = "D:\\temp\\spring-framework\\";
    private static final String allProjectName = "spring-aop,spring-aspects,spring-beans,spring-context,spring-context-indexer,spring-context-support,spring-core,spring-expression,spring-framework-bom,spring-instrument,spring-jcl,spring-jdbc,spring-jms,spring-messaging,spring-orm,spring-oxm,spring-test,spring-tx,spring-web,spring-webflux,spring-webmvc,spring-websocket\n" +
            "\n";
    private static final String mainPath = "src\\main\\java\\org";
    private static final String testPath = "src\\test\\java\\org";

    public static void main(String[] args) {

        String[] projectNameArray = allProjectName.split(",");
        for (int i = 0; i < projectNameArray.length; i++) {
            String mainsPath = parent + projectNameArray[i] + "\\" + testPath;
            test(mainsPath);

            String testsPath = parent + projectNameArray[i] + "\\" + testPath;
            test(testsPath);

        }



    }

    public static void getChildFileName() {
        File file = new File(path);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getName());
            }
        }
    }


    public static void test(String fileDir) {
        List<String> list = new ArrayList<>();
        List<File> fileList = new ArrayList<File>();
        File file = new File(fileDir);
        File[] files = file.listFiles();// 获取目录下的所有文件或文件夹
        if (files == null) {// 如果目录为空，直接退出
            System.out.println("222");
            return;
        }
        // 遍历，目录下的所有文件
        for (File f : files) {
            if (f.isFile()) {
                fileList.add(f);
            } else if (f.isDirectory()) {
                System.out.println("111");
                list.add(f.getAbsolutePath());
                System.out.println(f.getAbsolutePath());
                test(f.getAbsolutePath());
            }
        }
        for (File f1 : fileList) {
            System.out.println("-----");
            System.out.println(f1.getPath());
//            if(f1.getPath().contains(".java") && f1.exists()){
//                f1.delete();
//                System.out.println("ok");
//            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("0000");
            System.out.println();
            String str = list.get(i).replace("temp","temps");
            File filess = new File(str);
            filess.mkdirs();
            System.out.println(filess.exists());
        }
    }


}
