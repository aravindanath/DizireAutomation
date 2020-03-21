package excel;

import java.io.File;

public class WriteToExcel {

    public static void main(String[] args) throws Exception {

        String path = System.getProperty("user.dir") + File.separator + "data" + File.separator + "data.xlsx";


        Xls_Reader xls = new Xls_Reader(path);

       String val = xls.getCellData("user","city",2);
       System.out.println(val);

       xls.setCellData("user","city",3,"Mumbai");



    }


}
