package top.yumbo.test.excel.importDemo;

import top.yumbo.excel.util.ExcelImportExportUtils;

import java.io.FileInputStream;
import java.util.List;

public class ImportForInveProjDemo {

    public static void main(String[] args) throws Exception {
        String file = "src/test/java/top/yumbo/test/excel/demo.xls";
        System.out.println("=====投资项目数据======");
        final long start = System.currentTimeMillis();
        List<ImportForInveProj> quarterList;
        try {
            quarterList = ExcelImportExportUtils.importExcel(new FileInputStream(file), ImportForInveProj.class, 2000);
            for (int i = 0; i < quarterList.size(); i++) {
                System.out.println("第"+(i+1)+"行数据：");
                System.out.println(quarterList.get(i));
                System.out.println();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        final long end = System.currentTimeMillis();
        System.out.println("总共耗时" + (end - start) + "毫秒");
    }
}
