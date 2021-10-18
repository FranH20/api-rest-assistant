package com.proyecto.entity;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "attendances")
public class Attendance{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_attendance;
	
	private Timestamp check_in;
	
	private Timestamp check_out;
	
	private Timestamp server_time;
	
	private Timestamp server_day;
	
	@Temporal(TemporalType.DATE)
	private Date utilDate;
	
	@Temporal(TemporalType.TIME)
	private Date utilTime;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;
	
	public Integer getId_attendance() {
		return id_attendance;
	}

	public void setId_attendance(Integer id_attendance) {
		this.id_attendance = id_attendance;
	}

	public Timestamp getCheck_in() {
		return check_in;
	}

	public void setCheck_in(Timestamp check_in) {
		this.check_in = check_in;
	}

	public Timestamp getCheck_out() {
		return check_out;
	}

	public void setCheck_out(Timestamp check_out) {
		this.check_out = check_out;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Timestamp getServer_time() {
		return server_time;
	}

	public void setServer_time(Timestamp server_time) {
		this.server_time = server_time;
	}

	public Timestamp getServer_day() {
		return server_day;
	}

	public void setServer_day(Timestamp server_day) {
		this.server_day = server_day;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	public Date getUtilTime() {
		return utilTime;
	}

	public void setUtilTime(Date utilTime) {
		this.utilTime = utilTime;
	}

}
