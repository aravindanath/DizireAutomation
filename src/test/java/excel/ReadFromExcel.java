package excel;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFromExcel {

	public static void main(String[] args) throws Exception {

		String path = System.getProperty("user.dir")+ File.separator+"data"+File.separator+"data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		DataFormatter df = new DataFormatter();
//		String val = df.formatCellValue(sh.getRow(4).getCell(0));
//		String value =sh.getRow(4).getCell(0).getStringCellValue();

		int rowNum = sh.getLastRowNum();

		for(int i=0; i<=rowNum;i++){
			String col1 = df.formatCellValue(sh.getRow(i).getCell(0));
			String col2 = df.formatCellValue(sh.getRow(i).getCell(1));
			System.out.println(col1 +" -------- "+ col2);
		}

		String col3 = df.formatCellValue(sh.getRow(8).getCell(0));
		double d = Double.parseDouble(col3);
		int num = (int)(d);
		System.out.println(num+2);





	}

}
