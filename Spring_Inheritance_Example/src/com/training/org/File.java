package com.training.org;

public class File {
  int count;
  int sizeInBytes;
  
  public File() {
	  this.count=0;
	  this.sizeInBytes=0;
  }

public File(int count, int sizeInBytes) {
	super();
	this.count = count;
	this.sizeInBytes = sizeInBytes;
}

public int getCount() {
	return count;
}

public void setCount(int count) {
	this.count = count;
}

public int getSizeInBytes() {
	return sizeInBytes;
}

public void setSizeInBytes(int sizeInBytes) {
	this.sizeInBytes = sizeInBytes;
}

@Override
public String toString() {
	return "File [count=" + count + ", sizeInBytes=" + sizeInBytes + "]";
}
  
  
}
