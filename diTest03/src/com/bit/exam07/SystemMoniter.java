package com.bit.exam07;

public class SystemMoniter {
	private int periodTime;
	private SmsSender smsSender;
	
		public void setPeriodTime(int periodTime) {
		this.periodTime = periodTime;
	}

	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}

		public void monitor() {
			System.out.println("Period Time: " + periodTime);
			smsSender.send();
		}
	}

