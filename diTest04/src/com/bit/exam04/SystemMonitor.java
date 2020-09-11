package com.bit.exam04;

public class SystemMonitor {
	private int periodTime;
	private SmsSender smsSender;
	
	public void setPeriodTime(int periodTime) {
		this.periodTime = periodTime;
	}
	
	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}
	
	public void monitor() {
		System.out.print(periodTime + " 분 간격으로 ");
		smsSender.send();
	}
	//annotation 기반의 객체제공을 위한 환경설정파일을 만들고 main 메소드에서 결과를 확인해 보자. 
}
