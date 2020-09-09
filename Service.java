package com.inter2;

public class Service implements Car{
	private int sum,year;
	String brand;
	public Service()
	{
		
	}
	
	
	public Service(int sum, int year, String brand) {
		super();
		this.sum = sum;
		this.year = year;
		this.brand = brand;
	}
	


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void sum()
	{
		int n,s=0;
		while(sum >0)
		{
			n=sum%10;
			s=s+n;
			sum=sum/10;
		}
		if(s%2!=0)
		{
			System.out.println("You can come on Monday,Wednesday or Friday");
		}
		else
		{
			System.out.println("You can come on Tuesday,Thursday or Saturday");
		}
	}
	public void years()
	{
		if(year>5)
			System.out.println("You are eligible for free washing ");
		else
			System.out.println("You are not eligible for free washing ");
	}
	public void brand()
	{
		if(brand.equals("Maruti"))
			System.out.println("Your service charges are :"  +(5000-((5000*5)/100)));
		
	}

}
