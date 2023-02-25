package com.company.beans;

import com.company.impl.ReportService;

public class PDFReport implements ReportService
{
	@Override
	public void generateReport() {
		System.out.println("PDF Report generation on process");
	}

	public void generatePDF() {
		System.out.println("PDF report generated successfully.");
	}
}
