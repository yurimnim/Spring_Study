package com.bit.exam11;

public class SystemMoniter {
	private int periodTime;

	public SystemMoniter(int periodTime) {
		this.periodTime = periodTime;
	}
	
	public void monitor() {
		System.out.println(periodTime + " 분 간격으로 모니터링 합니다.");
	}
}
