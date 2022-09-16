package woo.edu.c.vo;

import java.util.Date;

public class calVo {

	private int calNo;
	private String calYear;
	private String calMonth;
	private String calDay;
	private String calTime;
	private String calReq;
	private Date calDate;
	private String calContents;
	private String calImp;
	
	public int getCalNo() {
		return calNo;
	}
	public void setCalNo(int calNo) {
		this.calNo = calNo;
	}
	public String getCalYear() {
		return calYear;
	}
	public void setCalYear(String calYear) {
		this.calYear = calYear;
	}
	public String getCalMonth() {
		return calMonth;
	}
	public void setCalMonth(String calMonth) {
		this.calMonth = calMonth;
	}
	public String getCalDay() {
		return calDay;
	}
	public void setCalDay(String calDay) {
		this.calDay = calDay;
	}
	public String getCalTime() {
		return calTime;
	}
	public void setCalTime(String calTime) {
		this.calTime = calTime;
	}
	public String getCalReq() {
		return calReq;
	}
	public void setCalReq(String calReq) {
		this.calReq = calReq;
	}
	public Date getCalDate() {
		return calDate;
	}
	public void setCalDate(Date calDate) {
		this.calDate = calDate;
	}
	public String getCalContents() {
		return calContents;
	}
	public void setCalContents(String calContents) {
		this.calContents = calContents;
	}
	public String getCalImp() {
		return calImp;
	}
	public void setCalImp(String calImp) {
		this.calImp = calImp;
	}
	
	@Override
	public String toString() {
		return "calVo [calNo=" + calNo + ", calYear=" + calYear + ", calMonth=" + calMonth + ", calDay=" + calDay
				+ ", calTime=" + calTime + ", calReq=" + calReq + ", calDate=" + calDate + ", calContents="
				+ calContents + ", calImp=" + calImp + "]";
	}
	
}
