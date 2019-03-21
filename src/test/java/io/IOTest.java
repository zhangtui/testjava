package io;

import domain.PayTypeEunm;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.*;

/**
 * Created by 张瑞 on 2019/3/8.
 */
public class IOTest {
    @Test
    public void test() throws IOException {
        File file = new File("E:\\homework");
        System.out.println(file.getAbsolutePath());
        file.mkdir(); //创建一个文件夹homework

        System.out.println(file.isDirectory());

        File file1 = new File(file.getAbsolutePath(),"abc.txt");
        file1.createNewFile(); //创建一个文件

        File[] listfile = file.listFiles();
        for(File file2:listfile){
            System.out.println(file2.getName());
        }

//        file1.delete();

    }

    public String createFile(String folder,String[] file,int index) throws IOException {
        File file1 = new File(folder);
        file1.mkdir();
        for(int i=0;i<file.length;i++){
            File file2 = new File(file1.getAbsolutePath(),file[i]);
            file2.createNewFile();
        }
//        File file2 = new File(file1.getAbsolutePath(),"aaa.txt");
//        File file3 = new File(file1.getAbsolutePath(),"bbb.txt");
//        File file4 = new File(file1.getAbsolutePath(),"ccc.txt");
//        file2.createNewFile();
//        file3.createNewFile();
//        file4.createNewFile();
        File[] listFiles= file1.listFiles();
        file1.getName();
        return listFiles[index-1].getName();
    }
    @Test
    public void test2() throws IOException {
        String folder = "e:\\domess";
        String[] file = {"aaa.txt","er.txt","ccc.txt"};
        String name= createFile(folder,file,2);
        System.out.println(name);
    }
    //字符流
    @Test
    public void inputStreamTest() throws Exception{
        InputStream fileInputStream = new FileInputStream("e:\\domess\\aaa.txt");
        byte[] bytes = new byte[2];  //设置一个字节流

        //循环取读取内容，每次智能读取2个字节，一致读取到结尾
        //里面的内容每次会被替换掉，也就是说后来的东西会把原来的东西挤出去

        while ((fileInputStream.read(bytes)!= -1)){
            System.out.println(new String(bytes));
        }
        fileInputStream.close();
    }
    @Test
    public void outputStreamTest() throws  Exception{
        OutputStream outputStream = new FileOutputStream("e:\\domess\\aaa.txt");
        String s = "hahaha";
        //把字符串转成字节
        outputStream.write(s.getBytes());
        outputStream.close();
    }
    @Test
    public void readerTest() throws Exception{
        Reader reader = new FileReader("e:\\domess\\aaa.txt");
        BufferedReader bufferedReader =new BufferedReader(reader);
        //你就可以按照一行一行的读取
        String s = null;
        while ((s=bufferedReader.readLine())!=null){
            System.out.println(s);
        }
        bufferedReader.close();
        reader.close();
    }
    @Test
    public void commonsIoTest() throws Exception{
        String filename = "E:\\domess\\bbb.txt";
        String s = IOUtils.toString(new FileInputStream("e:\\domess\\aaa.txt"),"GBK");
        System.out.println(s);
        //写入后面添加一个append :是否追加，参数未True 是追加文本
        FileUtils.write(new File(filename),"你好",true);
        FileUtils.copyFile(new File(filename),new File("e:\\domess\\ddd.txt"));

        //通过字节流或字符流读去读取，需要写一小段代码
        //参数格式，第一个参数，你要传入一个输入流也就是inputstream
        //IOUtiles.toString() 通过这个方法就可以把文件的内容读取出来
        //返回字符串的内容
        //参数格式是一个file，后面是你要输入的内容，编码格式utf-8 gbk,是否追加
        //fileUtiles。write 去写入文件
    }
    @Test
    public void randomAccessTest() throws Exception{
        String filename= "e:\\domess\\aaa.txt";
        RandomAccessFile file = new RandomAccessFile(filename, "r");
        file.seek(68);
        //会记录下来你现在的读取位置，下次可以再当前位置开始读取
        String s = null;
        StringBuffer stringBuffer = new StringBuffer();
        while ((s=file.readLine())!=null){
            stringBuffer.append(s+"\n");
        }
        System.out.println(stringBuffer.toString());
        System.out.println(file.length());
    }
    @Test
    public void payTest(){
        int payType=1;
        //买了一个手机然后使用微信支付，订单上一定有一个支付类型
        //对于服务器后台，不通得支付方式是不是显现不一样
        if(payType== PayTypeEunm.WeCharPay.value){
            System.out.println("微信支付");
        }else if(payType==PayTypeEunm.AliPay.value){
            System.out.println("支付宝支付");
        }else if(payType==PayTypeEunm.JdPay.value){
            System.out.println("京东支付");
        }

    }
    @Test
    public void t(){
        //其他得地方也需要支付类型得判断
        //你得10万行代码里面，有20个地方用到

    }
}
