package com.proyecto.dto;

import java.security.Timestamp;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;
public class AttendanceDto {
	
    @NotBlank
	private Timestamp check_in;
	
    @NotBlank
	private Timestamp check_out;
    
    @NotNull
    @Min(1)
	private Integer user_id;
    
	public AttendanceDto() {}

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

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
    
    
}
