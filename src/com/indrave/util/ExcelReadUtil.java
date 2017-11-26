package com.indrave.util;

import com.indrave.service.IExcelRowReader;

public class ExcelReadUtil {
    //Excel2003扩展名
    public final static String EXCEL03_EXTENSION = ".xls";
    //Excel2007扩展名
    public final static String EXCEL07_EXTENSION = ".XLSX";

    /**
     *读取Excel文件，可能为03版本也可能为07版本
     * @param excelRowReader
     * @param fileName
     * @throws Exception
     */
    public static void readExcel(IExcelRowReader excelRowReader, String fileName) throws Exception {
        if (fileName.endsWith(EXCEL03_EXTENSION)) {
            ExcelXlsReader excelXlsReader = new ExcelXlsReader();

        } else if (fileName.endsWith(EXCEL07_EXTENSION)) {
            ExcelXlxsReader excelXlxsReader = new ExcelXlxsReader();
        } else {
            throw new Exception("仅支持Excel文件！");
        }
    }
}
