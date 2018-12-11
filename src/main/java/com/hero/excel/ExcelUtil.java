package com.hero.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.VerticalAlignment;


public class ExcelUtil {

    /**
     * 导出Excel
     * @param sheetName sheet名称
     * @param title 标题
     * @param values 内容
     * @param wb HSSFWorkbook对象
     * @return
     */
  public static HSSFWorkbook getHSSFWorkbook(String sheetName,String []title, HSSFWorkbook wb){

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if(wb == null){
            wb = new HSSFWorkbook();
        }

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);
        // 设置表格默认列宽度为20个字节  
        sheet.setDefaultColumnWidth(20);
        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);
        row.setHeightInPoints((short)20);//设置表头行高度
        
        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        //style.setFillPattern(FillPatternType.SOLID_FOREGROUND);//可以填充单元格样式
        style.setAlignment(HorizontalAlignment.CENTER); // 创建一个居中格式
		style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直剧中显示
		style.setBorderBottom(BorderStyle.SLANTED_DASH_DOT);//双实线下边框
		//设置单元格字体样式
		Font font = wb.createFont();
		font.setFontHeightInPoints((short)10);//字体大小
		font.setFontName("华文中宋");//字体
		font.setBold(true);//粗体
		//font.setColor(HSSFColor.BLACK.index);//字体颜色
		style.setFont(font);//设置单元格字体样式
        //声明列对象
        HSSFCell cell = null;

        //创建标题
        for(int i=0;i<title.length;i++){
            cell = row.createCell(i);
            cell.setCellType(CellType.STRING);//设置单元格类型为文本
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        }

        
        return wb;
    }
	
	
	
	 
}