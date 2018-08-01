package com.jdp.creational.builderpattern;

import java.time.LocalDateTime;

public class BookingContext {
	
	private String name;
	private BookingType type;
    private LocalDateTime startTime;
    private int duration;
    
	public BookingContext(String name, BookingType type) {
		this.name = name;
		this.type = type;
	}

	
	public BookingContext(String name, BookingType type, LocalDateTime startTime, int duration) {
		this.name = name;
		this.type = type;
		this.startTime = startTime;
		this.duration = duration;
	}
	
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the type
	 */
	public BookingType getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(BookingType type) {
		this.type = type;
	}

	/**
	 * @return the startTime
	 */
	public LocalDateTime getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	

	
    

}
