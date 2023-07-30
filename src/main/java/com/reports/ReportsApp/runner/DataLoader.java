package com.reports.ReportsApp.runner;

import java.time.LocalDate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.reports.ReportsApp.entity.CitizenPlan;

import com.reports.ReportsApp.repository.CitizenPlanRepo;


@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private CitizenPlanRepo repo;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		//Cash Plan data
		CitizenPlan c =	new CitizenPlan();
		c.setCitizenName("John");
		c.setGender("Male");
		c.setPlanName("Cash");
		c.setPlanStatus("Approved");
		c.setPlanStartDate(LocalDate.now());
		c.setPlanEndDate(LocalDate.now().plusMonths(6));
		c.setBenfitAmt(5000.00);
       
		CitizenPlan c1 =	new CitizenPlan();
		c1.setCitizenName("Smith");
		c1.setGender("Male");
		c1.setPlanName("Cash");
		c1.setPlanStatus("Denied");
        c1.setDenialReason("RentalIncome");
        
		CitizenPlan c2 =	new CitizenPlan();
		c2.setCitizenName("Cathy");
		c2.setGender("Fe-Male");
		c2.setPlanName("Cash");
		c2.setPlanStatus("Terminated");
		c2.setPlanStartDate(LocalDate.now().minusMonths(4));
		c2.setPlanEndDate(LocalDate.now().plusMonths(6));
		c2.setBenfitAmt(5000.00);
		c2.setTerminatedDate(LocalDate.now().plusMonths(6));
		c2.setTerminationReason("Employed");
 
		 //Food plan data
		CitizenPlan c3 =	new CitizenPlan();
		c3.setCitizenName("David");
		c3.setGender("Male");
		c3.setPlanName("Food");
		c3.setPlanStatus("Approved");
		c3.setPlanStartDate(LocalDate.now());
		c3.setPlanEndDate(LocalDate.now().plusMonths(6));
		c3.setBenfitAmt(4000.00);
       
		CitizenPlan c4 =	new CitizenPlan();
		c4.setCitizenName("Robert");
		c4.setGender("Male");
		c4.setPlanName("Food");
		c4.setPlanStatus("Denied");
        c4.setDenialReason("Property Income is Getting");
        
		CitizenPlan c5 =	new CitizenPlan();
		c5.setCitizenName("Orlen");
		c5.setGender("Fe-Male");
		c5.setPlanName("Food");
		c5.setPlanStatus("Terminated");
		c5.setPlanStartDate(LocalDate.now().minusMonths(4));
		c5.setPlanEndDate(LocalDate.now().plusMonths(6));
		c5.setBenfitAmt(5000.00);
		c5.setTerminatedDate(LocalDate.now().plusMonths(6));
		c5.setTerminationReason("Employed");
		//Medical plan data
		CitizenPlan c6 =	new CitizenPlan();
		c6.setCitizenName("Charles");
		c6.setGender("Male");
		c6.setPlanName("Medical");
		c6.setPlanStatus("Approved");
		c6.setPlanStartDate(LocalDate.now());
		c6.setPlanEndDate(LocalDate.now().plusMonths(6));
		c6.setBenfitAmt(4000.00);
      
		CitizenPlan c7 =	new CitizenPlan();
		c7.setCitizenName("Bhai");
		c7.setGender("Male");
		c7.setPlanName("Medical");
		c7.setPlanStatus("Denied");
        c7.setDenialReason("Property Income is Getting");
       
		CitizenPlan c8 =	new CitizenPlan();
		c8.setCitizenName("Neel");
		c8.setGender("Fe-Male");
		c8.setPlanName("Medical");
		c8.setPlanStatus("Terminated");
		c8.setPlanStartDate(LocalDate.now().minusMonths(4));
		c8.setPlanEndDate(LocalDate.now().plusMonths(6));
		c8.setBenfitAmt(5000.00);
		c8.setTerminatedDate(LocalDate.now().plusMonths(6));
		c8.setTerminationReason("Govt job");
		
		 //Employment plan data
		CitizenPlan c9 =	new CitizenPlan();
		c9.setCitizenName("Ismart");
		c9.setGender("Male");
		c9.setPlanName("Employment");
		c9.setPlanStatus("Approved");
		c9.setPlanStartDate(LocalDate.now());
		c9.setPlanEndDate(LocalDate.now().plusMonths(6));
		c9.setBenfitAmt(4000.00);
      
		CitizenPlan c10 =	new CitizenPlan();
		c10.setCitizenName("Dada");
		c10.setGender("Male");
		c10.setPlanName("Employment");
		c10.setPlanStatus("Denied");
        c10.setDenialReason("Property Income is Getting");
       
		CitizenPlan c11 =	new CitizenPlan();
		c11.setCitizenName("Sindu");
		c11.setGender("Fe-Male");
		c11.setPlanName("Employment");
		c11.setPlanStatus("Terminated");
		c11.setPlanStartDate(LocalDate.now().minusMonths(4));
		c11.setPlanEndDate(LocalDate.now().plusMonths(6));
		c11.setBenfitAmt(5000.00);
		c11.setTerminatedDate(LocalDate.now().plusMonths(6));
		c11.setTerminationReason("Employed");
		List<CitizenPlan> list = Arrays.asList(c,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11);
		repo.saveAll(list);


	}
	

}
