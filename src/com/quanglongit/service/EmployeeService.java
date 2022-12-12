package com.quanglongit.service;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

import com.quanglongit.action.Gender;
import com.quanglongit.action.Priority;
import com.quanglongit.entity.Employee;

import ch.ivyteam.ivy.environment.Ivy;

/*
 * @author longbui98
 */
@Named
@ApplicationScoped
public class EmployeeService {
	private List<Employee>	employees;
	private List<Priority> priorities;
	private List<String> teams;
	private List<Gender> genders;
	private String userSession;

	// @PostConstruct
	public EmployeeService() {
		employees = new ArrayList<>();

		priorities = new ArrayList<>();
		for (var priority : Priority.values()) {
			priorities.add(priority);
		}

		genders = new ArrayList<>();
		for (var gender : Gender.values()) {
			genders.add(gender);
		}

		teams = new ArrayList<>();
		teams.add("BOLT");
		teams.add("IVY");
		teams.add("ATOMIC");
		teams.add("JAVA");
		teams.add("C++");
		teams.add("C#");

		userSession = Ivy.security().sessions().current().getSessionUserName();
	}

	public List<Employee> getAllEmployee() {
		return employees;
	}

	public List<Priority> getPriority() {
		return priorities;
	}

	public List<String> getTeam() {
		return teams;
	}

	public List<Gender> getGenders() {
		return genders;
	}

	public String getUserSession() {
		return userSession;
	}
}
