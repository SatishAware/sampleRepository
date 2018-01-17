package data.drivenPrograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hashmapValues {

	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		HashMap<String, List<String>> subjBody = new HashMap<String, List<String>>();
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		list.add("This is Goowgle Article1");
		list.add("This is Article1 Reply1");
		list.add("This is Article1 Reply2");
		list.add("This is Article1 Reply3");
		
		
		list1.add("This is Goowgle Article2");
		list1.add("This is Article2 Reply1");
		
		list1.add("This is Article2 Reply2");
		
		
		List<String> list3 = new ArrayList<String>();
		list3.add("This is Goowgle Article3");
		list3.add("This is Article3 Reply1");
		list3.add("This is Article3 Reply2");
		list3.add("This is Article3 Reply3");
		
		subjBody.put("Article1", list);
		subjBody.put("Article2", list1);
		subjBody.put("Article3", list3);
		
		storeEmails(subjBody);
	}
	
	public static void storeEmails(HashMap<String, List<String>> subjBody) throws FileNotFoundException, IOException
	{
		//File file = new File("F:\\Selenium\\DataSheets\\Email Data.xlsx");
		File file = new File("D:\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(file));
		XSSFSheet sh = wb.getSheetAt(0);
		int row = 0;
		int cell = 1;
				
		Set<String> keys = subjBody.keySet();
		for (String key : keys) 
		{
			System.out.println(key);
			System.out.println(subjBody.get(key));
			XSSFRow getRow = sh.getRow(row);
			XSSFCell createCell =getRow.createCell(cell);
			createCell.setCellValue(key);
			
			for(int i=1;i<=subjBody.get(key).size();i++)
			{
				XSSFRow getrow= sh.getRow(i);
				XSSFCell cellData = getrow.getCell(cell);
				if (cellData == null) 
				{
                	XSSFCell createcell= getrow.createCell(cell);
    				createcell.setCellValue(subjBody.get(key).get(i-1));
                }
                
			}
			cell=cell+1;
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		wb.write(fout);
		wb.close();	
	}



}
