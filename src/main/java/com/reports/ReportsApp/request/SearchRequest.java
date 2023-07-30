package com.reports.ReportsApp.request;

import java.time.LocalDate;

import lombok.Data;
@Data
public class SearchRequest {
	//what data is coming from the UI to represent that data in the object 
	private String planName;
	private String planStatus;
	private String gender;
	private LocalDate startDate;
	private LocalDate endDate;

}
