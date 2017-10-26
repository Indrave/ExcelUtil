package com.indrave.util;

import com.indrave.service.IExcelRowReader;
import org.apache.poi.hssf.eventusermodel.EventWorkbookBuilder.SheetRecordCollectingListener;
import org.apache.poi.hssf.eventusermodel.FormatTrackingHSSFListener;
import org.apache.poi.hssf.eventusermodel.HSSFListener;
import org.apache.poi.hssf.record.BoundSheetRecord;
import org.apache.poi.hssf.record.Record;
import org.apache.poi.hssf.record.SSTRecord;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

import java.util.ArrayList;
import java.util.List;

public class ExcelXlsReader implements HSSFListener {

    private int minColumns = -1;

    private POIFSFileSystem fs;

    private int lastRowNumber;

    private int lastColumnNumber;

    private boolean outputFormulaValue = true;

    private SheetRecordCollectingListener workbookBuildingListen;

    private HSSFWorkbook stubWorkbook;

    private SSTRecord sstRecord;

    private FormatTrackingHSSFListener formatTrackingHSSFListener;

    //表索引
    private int sheetIndex = -1;

    private BoundSheetRecord[] boundSheetRecord;

    private List boundSheetRecords = new ArrayList();

    private int nextRow;

    private int nextColumn;

    private boolean outputNextStringRecord;

    // 当前行
    private int curRow = 0;

    // 存储行记录的容器
    private List<String> rowlist = new ArrayList<String>();

    @SuppressWarnings("unused")
    private String sheetName;

    private IExcelRowReader rowReader;


    @Override
    public void processRecord(Record record) {

    }
}
