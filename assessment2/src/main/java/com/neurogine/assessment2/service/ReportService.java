/**
 * 
 */
package com.neurogine.assessment2.service;

import java.util.List;

import com.neurogine.assessment2.model.ReportData;

import net.sf.jasperreports.engine.JRException;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 6:47:33 PM
 */
public interface ReportService {

	byte[] generateReport(List<ReportData> dataList) throws JRException;

}
