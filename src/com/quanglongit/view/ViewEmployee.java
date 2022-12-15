package com.quanglongit.view;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;


import com.quanglongit.action.Gender;
import com.quanglongit.action.Priority;
import com.quanglongit.entity.Employee;
import com.quanglongit.service.EmployeeService;


/*
 * @author longbui98
 */
@Named
@ViewScoped
public class ViewEmployee {

	private List<Employee> employees;
	private Employee selectedEmployee;
	private List<Employee> selectedEmployees;
	private Boolean isDelete;
	private String team;
	private List<String> teams;
	private String gender;
	private List<Gender> genders;
	private List<Priority> priorities;
	private Priority priority;
	private Date minDate;
	private String feedback;

	private EmployeeService employeeService;

	@PostConstruct
	public void init() {
		employeeService = new EmployeeService();

		employees = employeeService.getAllEmployee();

		priorities = employeeService.getPriority();

		teams = employeeService.getTeam();

		minDate = new Date();
		
		genders = employeeService.getGenders();
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public void setSelectedEmployee(Employee selectedEmployee) {
		this.selectedEmployee = selectedEmployee;
	}

	public Employee getSelectedEmployee() {
		return selectedEmployee;
	}

	public void setSelectedEmployees(List<Employee> selectedEmployees) {
		this.selectedEmployees = selectedEmployees;
	}

	public List<Employee> getSelectedEmployees() {
		return selectedEmployees;
	}

	public void openNew() {
		selectedEmployee = new Employee();
		selectedEmployee.setIsAcive(true);
	}

	public Boolean getIsDelete() {
		return isDelete;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public List<String> getTeams() {
		return teams;
	}

	public void setTeams(List<String> teams) {
		this.teams = teams;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Gender> getGenders() {
		return genders;
	}

	public void setGenders(List<Gender> genders) {
		this.genders = genders;
	}

	public List<Priority> getPriorities() {
		return priorities;
	}

	public void setPriorities(List<Priority> priorities) {
		this.priorities = priorities;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Date getMinDate() {
		return minDate;
	}

	public void setMinDate(Date minDate) {
		this.minDate = minDate;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}
	
	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
}
