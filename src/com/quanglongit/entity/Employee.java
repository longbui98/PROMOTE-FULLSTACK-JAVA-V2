package com.quanglongit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import com.quanglongit.action.Gender;

/*
 * @author longbui98
 */
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Integer age;
	private Gender gender;
	private Boolean isAcive;
	private Date startingDate;
	private String team;
	private Integer profileId;

	public Employee() {
	};

	public Employee(Integer id, String name, Integer age, Gender gender, Boolean isAcive, Date startingDate,
			String team, Integer profileId) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.isAcive = isAcive;
		this.startingDate = startingDate;
		this.team = team;
		this.profileId = profileId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Boolean getIsAcive() {
		return isAcive;
	}

	public void setIsAcive(Boolean isAcive) {
		this.isAcive = isAcive;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public Integer getProfileId() {
		return profileId;
	}

	public void setProfileId(Integer profileId) {
		this.profileId = profileId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", isAcive=" + isAcive
				+ ", startingDate=" + startingDate + ", team=" + team + ", profileId=" + profileId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, gender, id, isAcive, name, profileId, startingDate, team);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(age, other.age) && gender == other.gender && Objects.equals(id, other.id)
				&& Objects.equals(isAcive, other.isAcive) && Objects.equals(name, other.name)
				&& Objects.equals(profileId, other.profileId) && Objects.equals(startingDate, other.startingDate)
				&& Objects.equals(team, other.team);
	}
}
