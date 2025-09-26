package assignmentday6;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class AssignmentDay6_5 {

    
    public static void createExcel(String filePath) {
        String[] headers = {"EmployeeID", "Name", "Department", "Salary"};
        Object[][] employeeData = {
            {101, "Sagar S", "HR", 50000},
            {102, "Sunay N", "IT", 60000},
            {103, "Skandha Jain", "Finance", 55000}
        };

        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Employees");

            
            Row headerRow = sheet.createRow(0);
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

           
            for (int i = 0; i < employeeData.length; i++) {
                Row row = sheet.createRow(i + 1);
                for (int j = 0; j < employeeData[i].length; j++) {
                    Cell cell = row.createCell(j);
                    if (employeeData[i][j] instanceof Integer) {
                        cell.setCellValue((Integer) employeeData[i][j]);
                    } else if (employeeData[i][j] instanceof Double) {
                        cell.setCellValue((Double) employeeData[i][j]);
                    } else {
                        cell.setCellValue(employeeData[i][j].toString());
                    }
                }
            }

           
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                workbook.write(fos);
            }

            System.out.println("Excel file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void readExcelAndCalculate(String filePath) {
        double totalSalary = 0;

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            System.out.println("Employee Details:");

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);

                int empId = (int) row.getCell(0).getNumericCellValue();
                String name = row.getCell(1).getStringCellValue();
                String dept = row.getCell(2).getStringCellValue();
                double salary = row.getCell(3).getNumericCellValue();

                System.out.printf("ID: %d, Name: %s, Dept: %s, Salary: %.2f%n", empId, name, dept, salary);
                totalSalary += salary;
            }

            System.out.println("Total Salary: " + totalSalary);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        String filePath = "EmployeeSalaryReport.xlsx";

        createExcel(filePath);
        readExcelAndCalculate(filePath);
    }
}
