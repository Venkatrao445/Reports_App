package com.reports.ReportsApp.service;

import java.util.List;
import com.reports.ReportsApp.repository.CitizenPlanRepo;
import com.reports.ReportsApp.request.SearchRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reports.ReportsApp.entity.CitizenPlan;

@Service
public class ReportServiceImpl implements ReportService {
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public List<String> getPlanNames() {
		List<CitizenPlan> plans = repo.findAll();
		return null;
	}

	@Override
	public List<String> getPlanStatuses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exportExcel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean exportPdf() {
		// TODO Auto-generated method stub
		return false;
	}


}
