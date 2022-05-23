package test;

public class MutableInteger {
	
	private int value;

	public MutableInteger(){
		this.value=0;
	}
	
	public MutableInteger(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void increment(){
		this.value++;
	}
	
    public void add(int add){
        value = value + add;
    }
		
	public String toString() {
		
		return String.valueOf(value);
	}

}
