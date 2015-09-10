package org.holiday.service;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class HumanResourceService {
	public void bookHoliday(Date startDate, Date endDate, String name) {
		Assert.notNull(name);
		System.out.println("Booking holiday for [" + startDate + "____"
				+ endDate + "] for [" + name + "] ");
	}

}
