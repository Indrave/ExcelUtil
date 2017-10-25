package com.indrave.service;

import java.util.List;

public interface IExcelRowReader {
    /**
     * 解析Excel当前行<br>
     * @param sheetIndex 表索引
     * @param curRow 当前行
     * @param rowList 行数据
     */
    void getRows(int sheetIndex, int curRow, List<String> rowList);
}
