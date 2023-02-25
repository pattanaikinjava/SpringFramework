package com.company.client;

import com.company.beans.ExcelReport;
import com.company.beans.PDFReport;
import com.company.impl.ReportService;

public class ReportGenerator 
{
	private  ReportService report;
	private String reportName;
	
	public String getReportName() {
		return reportName;
	}

	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public  void callReport() {
		//System.out.println(this.reportName);
		if(reportName.toUpperCase().equals("EXCEL")){
			report = new ExcelReport();
				report.generateReport();
				((ExcelReport) report).generateXlS();
	    }else {
	    	report = new PDFReport();
			report.generateReport();
			((PDFReport) report).generatePDF();
	    }
	}
	
	

}
