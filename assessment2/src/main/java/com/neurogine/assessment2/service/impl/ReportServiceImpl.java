package com.neurogine.assessment2.service.impl;
  
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.stereotype.Service;

import com.neurogine.assessment2.model.ReportData;
import com.neurogine.assessment2.service.ReportService;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 6:47:44 PM
 */
@Service
public class ReportServiceImpl implements ReportService{

	@Override
	public byte[] generateReport(List<ReportData> dataList) throws JRException {
        InputStream reportStream = getClass().getResourceAsStream("/jasper/report.jrxml");
        JasperReport jasperReport = JasperCompileManager.compileReport(reportStream);

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(dataList);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("generatedTime", "2024-07-03");

        JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        return JasperExportManager.exportReportToPdf(jasperPrint);
    }
 

}
