package com.capgemini.spring.configuration;
import org.springframework.context.annotation.*;
import java.util.*;
import java.io.*;
import com.capgemini.spring.organization.address.*;
import com.capgemini.spring.organization.*;

@Configuration
public class OrganizationConfiguration{
	public Address getAddress(){
		Address address = new Address("Mumbai","Maharashtra","India");
		return address;
	}
	public List<String> getDirectors() {
		List<String> directors=new ArrayList<String>();
		directors.add("John");
		directors.add("mary");
		
		return directors;
	}
	public Set<String> getBranches() {
		Set<String> branches=new HashSet<String>();
		branches.add("It");
		branches.add("support");
		
		return branches;
	}
	public Map<String,String> getBranchWiseHead() {
		Map<String,String> branchWiseHead= new HashMap<>();
		branchWiseHead.put("it","ram");
		branchWiseHead.put("support","raj");
		
		return branchWiseHead;
	}

	public Properties getIpAddresses() {
		FileReader reader=null;
		Properties ipAddresses=null;
		try{
		reader=new FileReader("src/ipAddress.properties");  
    		ipAddresses=new Properties();  
    		ipAddresses.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		}
		return ipAddresses;
	}

	
	public Properties getDatabaseDetails() {
		FileReader reader=null;
		Properties databaseDetails=null;
		try{
		reader=new FileReader("src/config.properties"); 
      		databaseDetails=new Properties();  
    		databaseDetails.load(reader);
		}catch(Exception e){
			e.printStackTrace();
		} 
		return databaseDetails;
	}

	@Bean("configbean")
	public Organization getOrganization(){
		Organization org=new Organization();
		org.setOrgId(1011);
		org.setOrgName("Capgemini");
		org.setMarketPrice(34567);
		org.setAddress(getAddress());
		org.setDirectors(getDirectors());
		org.setBranches(getBranches());
		org.setBranchWiseHead(getBranchWiseHead());
		org.setIpAddresses(getIpAddresses());
		org.setDatabaseDetails(getDatabaseDetails());
		return org;
	}
}


