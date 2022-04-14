package sereins.tools;

import org.junit.jupiter.api.Test;
import pers.sereins.tools.excel.ReadExcel;

public class Excel {

    @Test
    void read() {

        ReadExcel readExcel = new ReadExcel();

        String filename = "/Users/jiagx/Desktop/test.xlsx";

        readExcel.simpleRead(filename);

    }
}
