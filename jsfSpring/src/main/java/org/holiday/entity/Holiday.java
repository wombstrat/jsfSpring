package org.holiday.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Holiday implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String startDate;
	private String endDate;
	private String nameEmployee;

	public String getNameEmployee() {
		return nameEmployee;
	}

	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}

	@Override
	public String toString() {
		return "Holiday [startDate=" + startDate + ", endDate=" + endDate
				+ ", nameEmployee=" + nameEmployee + "]";
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
