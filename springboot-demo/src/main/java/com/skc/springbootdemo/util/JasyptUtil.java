package com.skc.springbootdemo.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {
    public static void main(String[] args) {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("sljfsag");//这个就是盐。就是加密的一种方式吧。
        String name1 = encryptor.encrypt("sunkangchao");
        String name2 = encryptor.encrypt("wangyuyang");
        System.out.println(name1);
        System.out.println(name2);//通过你设定的盐加密形成的密文。
    }
}
