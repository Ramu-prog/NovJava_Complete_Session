package oop_Encapsulation;

public class Compnay {

	private String name;
    private	int empcount;
    private	String hq;
	private double shareprice;
	
	//Constructor calling each other constructor 
	public Compnay(String name) {
		this(name, "LA"); //1st statement/Constructor calling and constructor chaining
		this.name = name;
	}

	public Compnay(String name, String hq) {
      //  this.(name,1000,hq,100.12);
		this.name = name;
		this.hq = hq;
	}

	public Compnay(String name, int empcount, String hq, double shareprice) {
		this.name = name;
		this.empcount = empcount;
		this.hq = hq;
		this.shareprice = shareprice;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpcount() {
		return empcount;
	}

	public void setEmpcount(int empcount) {
		this.empcount = empcount;
	}

	public String getHq() {
		return hq;
	}

	public void setHq(String hq) {
		this.hq = hq;
	}

	public double getShareprice() {
		return shareprice;
	}

	public void setShareprice(double shareprice) {
		this.shareprice = shareprice;
	}
	
	
	
	
	
}
