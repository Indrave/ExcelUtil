package com.indrave.util;

import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelXlsReader implements HSSFListener {

    private int minColumns = -1;

    private POIFSFileSystem fs;

    private int lastRowNumber;

    private int lastColumnNumber;


    @Override
    public void processRecord(Record record) {

    }
}
