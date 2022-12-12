package com.quanglongit.entity;

import java.util.Date;
import java.util.Objects;


/*
 * @author longbui98
 */
public class Profile {
	private String creator;
	private Date createDate;
	private Date targetDate;
	private String comment;
	
	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Profile [creator=" + creator + ", createDate=" + createDate + ", targetDate=" + targetDate
				+ ", comment=" + comment + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(comment, createDate, creator, targetDate);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profile other = (Profile) obj;
		return Objects.equals(comment, other.comment) && Objects.equals(createDate, other.createDate)
				&& Objects.equals(creator, other.creator) && Objects.equals(targetDate, other.targetDate);
	}
}
