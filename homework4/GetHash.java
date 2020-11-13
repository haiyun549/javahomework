package homework4;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

public class GetHash {

    public static MessageDigest SHA1Checksum(String path, MessageDigest complete) throws Exception {
    	//导入文件目录，建立存放文件数组
    	File file = new File(path);
    	File[] files = file.listFiles();
        // 用于计算hash值的文件缓冲区
        byte[] buffer = new byte[1024];
        //按同一方式排序文件数组
        Arrays.sort(files);
        //遍历文件数组
        for(int i = 0 ; i < files.length; i++) {
        	//是文件目录则递归
        	if(files[i].isDirectory()) {
        		SHA1Checksum(path + File.separator + files[i].getName(), complete);
        	}
        	//是文件则更新hash值
        	if(files[i].isFile()) {
        		// 使用SHA1哈希/摘要算法
                FileInputStream is = new FileInputStream(files[i]);
                int numRead = 0;
                do {
                    // 读出numRead字节到buffer中
                    numRead = is.read(buffer);
                    if (numRead > 0) {
                        // 根据buffer[0:numRead]的内容更新hash值
                        complete.update(buffer, 0, numRead);
                    }
                // 文件已读完，退出循环
                } while (numRead != -1);
                // 关闭输入流
                is.close();
        	}
        }
        // 返回SHA1哈希值
        return complete;
    }

    public static void main(String[] args) {
        try {
        	Scanner in = new Scanner(System.in);
        	//输入文件目录路径
        	String path = in.nextLine();
        	MessageDigest complete = MessageDigest.getInstance("SHA-1");
        	//计算文件目录hash值
            byte[] sha1 = SHA1Checksum(path, complete).digest();
            //将计算结果转为字符串
            String result = "";
            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i]&0xFF, 16);
            }
            //输出结果
            System.out.println(result);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}