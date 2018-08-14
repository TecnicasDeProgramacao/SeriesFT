package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExpLog {

	private List<Double> listValores;
	
	public ExpLog() 
	{
		listValores = new ArrayList<>();
	}
	public Iterator<Double> getTermos(){
		// TODO:
		return this.listValores.iterator();
	}
	
	public double exp(double x) {
		listValores = new ArrayList<>();
		double max = 10*Math.exp(-6);	
		for(int n= 0; n> max; n++) 
		{
			double value = Math.pow(x, n)/Util.fatorial(n);
			listValores.set(n, value);  
		}
		
		return Util.somatorio(0, listValores.size()-1, listValores);
	}

	public double log(double x) {
		listValores = new ArrayList<>();
		double max = 10*Math.exp(-6);
		for(int n= 0; n> max; n++) 
		{
			if(Math.abs(x)<1) 
			{
				double value = (Math.pow(-1, n)/n + 1) * Math.pow(x, n+1);
				listValores.set(n, value);
			}
		}
		return Util.somatorio(0, listValores.size()-1, listValores);
	}
}
