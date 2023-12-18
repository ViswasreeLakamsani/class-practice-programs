package com.kodnest.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {
	List<String> technologies;
	Set<String> project;
	Map<String,String> organization;
	public Employee() {
		super();
	}
	public Employee(List<String> technologies, Set<String> project, Map<String, String> organization) {
		super();
		this.technologies = technologies;
		this.project = project;
		this.organization = organization;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public Set<String> getProject() {
		return project;
	}
	public void setProject(Set<String> project) {
		this.project = project;
	}
	public Map<String, String> getOrganization() {
		return organization;
	}
	public void setOrganization(Map<String, String> organization) {
		this.organization = organization;
	}
	@Override
	public String toString() {
		return "Employee [technologies=" + technologies + ", project=" + project + ", organization=" + organization
				+ "]";
	}
	

}
