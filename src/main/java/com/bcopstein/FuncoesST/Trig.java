package com.bcopstein.FuncoesST;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Trig 
{
	
	private List<Double> lstValores;
	
	public Trig()
	{
		this.lstValores = new ArrayList<Double>();
	}
	
	public Iterator<Double> getTermos()
	{
		return this.lstValores.iterator();
	}

	public double cos(double x) 
	{
		this.lstValores = new ArrayList<Double>();
		double termo = 1.0;
		int n = 0;
		while(termo >= 10E-6)
		{
			termo = Math.pow(-1, n);
			termo = termo/Util.fatorial(2*n);
			termo = termo * Math.pow(x, 2*n);
			this.lstValores.add(termo);
			n++;
		}
		return Util.somatorio(0, n, lstValores);
	}

	public double sin(double x) 
	{
		this.lstValores = new ArrayList<Double>();
		double termo = 1.0;
		int n = 0;
		while(termo >= 10E-6)
		{
			termo = Math.pow(-1, n);
			termo = termo/Util.fatorial((2*n) + 1);
			termo = termo * Math.pow(x, ((2*n) + 1));
			this.lstValores.add(termo);
			n++;
		}
		return Util.somatorio(0, n, lstValores);
	}
}
