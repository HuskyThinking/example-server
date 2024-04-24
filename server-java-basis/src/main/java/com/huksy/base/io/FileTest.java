package com.huksy.base.io;

import cn.hutool.core.date.DateTime;
import cn.hutool.core.date.DateUtil;
import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.Date;
import java.util.Timer;

public class FileTest {

    public static void main(String[] args) {

        File file = new File("E:\\GitRepository\\图片 2024-04-22 142121.jpg");
        System.out.println(file.delete());
        String fileName = DateUtil.format(new DateTime(),"yyyyMMdd") + ".txt";
        StringBuilder contents = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            String applyId = "applyId" + i;
            String successFlag = "True";
            String content = applyId + "   " + successFlag + "\n";
            contents.append(content);
        }
        contents.insert(0,"chushu \\n");
        FileUtil.appendUtf8String(contents.toString(),"E:\\GitRepository\\" + fileName);
        Date date = DateUtil.parse("20240405","yyyyMMdd");
        System.out.println(date);
    }

}
