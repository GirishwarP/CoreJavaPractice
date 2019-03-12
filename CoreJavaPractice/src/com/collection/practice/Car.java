package com.collection.practice;

public class Car implements Comparable<Car>{
	
	private String modelName;
	private int modelNo;
	private long chasisNo;
	
	public Car(String modelName, int modelNo, long chasisNo) {
		this.modelName = modelName;
		this.modelNo = modelNo;
		this.chasisNo = chasisNo;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public long getChasisNo() {
		return chasisNo;
	}

	public void setChasisNo(long chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Override
	public int compareTo(Car car) {
		if(this.modelNo > car.getModelNo())
			return 1;
		else if(this.modelNo < car.getModelNo())
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "Car [modelName=" + modelName + ", modelNo=" + modelNo + ", chasisNo=" + chasisNo + "]";
	}
}
