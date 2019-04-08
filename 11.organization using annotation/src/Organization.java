package com.capgemini.spring.model;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.Resource;
import com.capgemini.spring.model.*;

@Component("organization")
public class Organization {
	@Value("1011")
	private int organizationId;

	@Value("Capgemini")
	private String organizationName;

	@Value("687403")
	private double marketPrice;

	@Autowired
	@Qualifier("address")
	private Address address;
	
	@Resource(name="list")
	private List<String> directors;

	@Resource(name="set")
	private Set<String> branches;

	@Resource(name="map")
	private Map<String,String> branchWiseHead;

	@Resource(name="ipAddress")
	private Properties ipAddresses;

	@Resource(name="database")
	private Properties databaseDetails;
	
	

	public int getOrganizationId() {
		return organizationId;
	}

	public void setOrganizationId(int organizationId) {
		this.organizationId = organizationId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public double getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getDirectors() {
		return directors;
	}

	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}

	public Set<String> getBranches() {
		return branches;
	}

	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}

	public Map<String, String> getBranchWiseHead() {
		return branchWiseHead;
	}

	public void setBranchWiseHead(Map<String,String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}

	public Properties getIpAddresses() {
		return ipAddresses;
	}

	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}

	public Properties getDatabaseDetails() {
		return databaseDetails;
	}

	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}

	public String toString() {
		return "Organization [organizationId=" + organizationId + ", organizationName=" + organizationName
				+ ", marketPrice=" + marketPrice + ", address=" + address + ", directors=" + directors + ", branches="+ branches + ", branchWiseHead=" + branchWiseHead + ", ipAddresses=" + ipAddresses+ ", databaseDetails=" + databaseDetails + "]";
	}
	
}