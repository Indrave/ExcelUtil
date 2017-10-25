package com.indrave.impl;

import com.indrave.service.IExcelRowReader;

import java.util.List;

public class ExcelRowReader implements IExcelRowReader {
    @Override
    public void getRows(int sheetIndex, int curRow, List<String> rowList) {
        System.out.println(curRow + "  ");
        for (String string : rowList) {
            System.out.println(string.equals("") ? "*" : string + "  ");
        }
    }
}
