package com.neurogine.assessment2.controller;

import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neurogine.assessment2.model.ReportData;
import com.neurogine.assessment2.service.ReportService;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;

	@GetMapping("/report")
	public ResponseEntity<byte[]> generateReport() throws JRException {
		List<ReportData> dataList = new ArrayList<>();
		dataList.add(new ReportData("2024-07-01", "REF001", "100.00", "Completed",
				"Apples contain key nutrients, including fiber and antioxidants. They may offer health benefits, including lowering blood sugar levels and benefitting heart health. Apples are among the world's most popular fruits. They grow on the apple tree (Malus domestica), originally from Central Asia."));
		dataList.add(new ReportData("2024-07-02", "REF002", "200.00", "Pending",
				"Apples contain key nutrients, including fiber and antioxidants. They may offer health benefits, including lowering blood sugar levels and benefitting heart health. Apples are among the world's most popular fruits. They grow on the apple tree (Malus domestica), originally from Central Asia."));

		byte[] report = reportService.generateReport(dataList);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=report.pdf");

		return ResponseEntity.ok().headers(headers).contentType(org.springframework.http.MediaType.APPLICATION_PDF)
				.body(report);
	}
}