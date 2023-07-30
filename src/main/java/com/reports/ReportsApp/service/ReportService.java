package com.reports.ReportsApp.service;

import java.util.List;


import com.reports.ReportsApp.entity.CitizenPlan;
import com.reports.ReportsApp.request.SearchRequest;

public interface ReportService {
	public List<String> getPlanNames();
	public List<String> getPlanStatuses();
	//to handle search button(based on selected to retrieve the data)
	public List<CitizenPlan> search(SearchRequest request);
	public boolean exportExcel();
	public boolean exportPdf();
	

}
