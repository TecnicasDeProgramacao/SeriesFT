package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lambert {
	private ArrayList<Double> lst = new ArrayList<>();
	
	public Iterator<Double> getTermos(){
		
		Iterator<Double> iter =  lst.listIterator();
		return iter;
		
	}
	
	public double W0(double x) {
		this.lst = new ArrayList<>();
		if (Math.abs(x) < 1/Math.E) throw new IllegalArgumentException();		
		double lim = 10e-6;
		int i = 0;
		do {
			i++;
			double lambert = 0;
			lambert =Math.pow(i, i-1)/Util.fatorial(i) * Math.pow(x, i);
			lst.add(lambert);			
			
		} while(lst.get(i) < lim);
		return Util.somatorio(1, i, lst);
		
	}
}