package pers.sereins.tools.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.builder.ExcelReaderBuilder;
import com.alibaba.excel.read.listener.PageReadListener;
import com.alibaba.fastjson.JSON;

public class ReadExcel {


    public void simpleRead(String filename) {


        new Thread(()->{}).start();

        ExcelReaderBuilder read = EasyExcel.read(filename, ExampleData.class, new PageReadListener<ExampleData>(dataList -> {
            for (ExampleData demoData : dataList) {
                System.out.println("读取到一条数据{}" + JSON.toJSONString(demoData));
            }
        }));

        read.sheet().doRead();
    }
}
