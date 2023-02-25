package com.company.beans;

import com.company.impl.ReportService;

public class ExcelReport implements ReportService 
{
	@Override
	public void generateReport() {
		System.out.println("Excel Report generation on process");
	}
	
	public void generateXlS() {
		System.out.println("Excel report generated successfully.");
	}
}
