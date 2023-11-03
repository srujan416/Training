package automationTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	
    //Main function is calling readExcel function to read data from excel file

    public static void main(String...strings) throws IOException{

    //Create an object of ReadGuru99ExcelFile class

    Excel1 objExcelFile = new Excel1();

    //Prepare the path of excel file

    String filePath = System.getProperty("user.dir")+"\\src";
    String [] valueToWrite = {"Miss. Yashmeen", "Home", "CA"};
    //Call read file method of the class to read data
System.out.println(filePath);
    objExcelFile.readExcel(filePath,"Yash.xlsx","Sheet1");
    
    objExcelFile.writeExcel(filePath,"Yash.xlsx","Sheet2",valueToWrite);

    }


		
		 public void readExcel(String filePath,String fileName,String sheetName) throws IOException{

			    //Create an object of File class to open xlsx file

			    File file =    new File(filePath+"\\"+fileName);

			    //Create an object of FileInputStream class to read excel file

			    
			    FileInputStream inputStream = new FileInputStream(file);

			    Workbook guru99Workbook = null;

			    //Find the file extension by splitting file name in substring  and getting only extension name

			    String fileExtensionName = fileName.substring(fileName.indexOf("."));

			    //Check condition if the file is xlsx file

			    if(fileExtensionName.equals(".xlsx")){

			    //If it is xlsx file then create object of XSSFWorkbook class

			    guru99Workbook = new XSSFWorkbook(inputStream);

			    }

			    //Check condition if the file is xls file

			    else if(fileExtensionName.equals(".xls")){

			        //If it is xls file then create object of HSSFWorkbook class

			        guru99Workbook = new HSSFWorkbook(inputStream);

			    }

			    //Read sheet inside the workbook by its name

			    Sheet guru99Sheet = guru99Workbook.getSheet(sheetName);

			    //Find number of rows in excel file

			    int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();

			    //Create a loop over all the rows of excel file to read it

			    for (int i = 0; i < rowCount+1; i++) {

			        Row row = guru99Sheet.getRow(i);

			        //Create a loop to print cell values in a row

			        for (int j = 0; j < row.getLastCellNum(); j++) {

			            //Print Excel data in console

			            System.out.print(row.getCell(j).getStringCellValue()+"-");

			        }

			        System.out.println();
			    } 

			    }  

			
		 public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

		        //Create an object of File class to open xlsx file

		        File file =    new File(filePath+"\\"+fileName);

		        //Create an object of FileInputStream class to read excel file

		        FileInputStream inputStream = new FileInputStream(file);

		        Workbook guru99Workbook = null;

		        //Find the file extension by splitting  file name in substring and getting only extension name

		        String fileExtensionName = fileName.substring(fileName.indexOf("."));

		        //Check condition if the file is xlsx file

		        if(fileExtensionName.equals(".xlsx")){

		        //If it is xlsx file then create object of XSSFWorkbook class

		        guru99Workbook = new XSSFWorkbook(inputStream);

		        }

		        //Check condition if the file is xls file

		        else if(fileExtensionName.equals(".xls")){

		            //If it is xls file then create object of XSSFWorkbook class

		            guru99Workbook = new HSSFWorkbook(inputStream);

		        }    

		    //Read excel sheet by sheet name    

		    Sheet sheet = guru99Workbook.getSheet(sheetName);

		    //Get the current count of rows in excel file

		    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		    //Get the first row from the sheet

		    Row row = sheet.getRow(0);

		    //Create a new row and append it at last of sheet

		    Row newRow = sheet.createRow(rowCount+1);

		    //Create a loop over the cell of newly created Row

		    for(int j = 0; j < row.getLastCellNum(); j++){

		        //Fill data in row

		        Cell cell = newRow.createCell(j);

		        cell.setCellValue(dataToWrite[j]);

		    }

		    //Close input stream

		    inputStream.close();

		    //Create an object of FileOutputStream class to create write data in excel file

		    FileOutputStream outputStream = new FileOutputStream(file);

		    //write data in the excel file

		    guru99Workbook.write(outputStream);

		    //close output stream

		    outputStream.close();
			
		    }

	
		
		
		
		
	}


