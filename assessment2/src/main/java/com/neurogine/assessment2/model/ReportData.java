package com.neurogine.assessment2.model;

import lombok.Data;

/**
 * @version : 1.0.0
 * @description :
 * @author : SanWaiLwin
 * @date : Jun 27, 2024 3:18:18 PM
 */ 
@Data
public class ReportData { 
	private String date;
    private String referenceNo;
    private String amount;
    private String status;
    private String remark;
    
	public ReportData(String date, String referenceNo, String amount, String status, String remark) {
		super();
		this.date = date;
		this.referenceNo = referenceNo;
		this.amount = amount;
		this.status = status;
		this.remark = remark;
	}
    
    
}
