package com.jackwan.md5_aes_cbc.Controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MainTest {

    //此项目主要用于加密算法的demo  包括MD5 aes  cbc   hello word


    public static void main(String[] args) {

        String myname="这是一个密码";
          byte[] namebytes=null;
          try {
              namebytes= MessageDigest.getInstance("md5").digest(
                      myname.getBytes()
              );
          }catch (Exception e){
              System.out.println("error:"+e);
          }

         String afterMd5= new BigInteger(1,namebytes).toString(16);

        System.out.println("得到加密算法后的一些基本的位数"+namebytes.length+"具体的值是："+namebytes);
        String ourMD5text="";

        for(int i=0;i<namebytes.length;i++){
             ourMD5text="0"+namebytes.toString();
        }
        System.out.println("测试结果为"+ourMD5text);

          for(int i=0;i<32-afterMd5.length();i++){
              afterMd5="0"+afterMd5;
          }

        System.out.println("得到加密之后的文本是"+afterMd5);



    }


  public static  String EncryptMd5(String Encontext){

     Byte[] encodeByetes=null;
     //创建一个 md
     MessageDigest messageDigest=null;
     String afterMD5="";
     byte[] bytes=null;
     bytes= Encontext.getBytes();//将字符串
     try {
           byte[] afternU =MessageDigest.getInstance("MD5").digest(bytes);

     }catch (Exception e){
         System.out.println("出现错误："+e.toString());
     }
     //创建一个字符数组
     char[] charArray= Encontext.toCharArray();
     //字节数组 为需要加密的字符串的字符长度
     byte[] byteArray= new byte[charArray.length];
      for(int i=0;i<charArray.length;i++){
          //字符数组的长度

      }



        return "";
  }


}
