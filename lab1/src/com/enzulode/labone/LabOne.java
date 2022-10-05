package com.enzulode.labone;

import java.util.Random;

public class LabOne
{

	public static void main(String[] args)
	{

		short[] s = new short[8];
		double[] x = new double[18];
		double[][] p = new double[8][18];

//		First array
		int counterFirst = 0;
		for (short i = 19; i > 4; i--)
			if (i % 2 != 0)
				s[counterFirst++] = i;

//		Second array
		for (int i = 0; i < x.length; i++)
			x[i] = genRandDouble();

//		Third array
		for (int i = 0; i < p.length; i++)
			for (int j = 0; j < p[i].length; j++)
			{
				if (s[i] == 13)
					p[i][j] = Math.pow(Math.E, Math.cos(Math.pow(x[j], 1.0/3.0)));
				else if (s[i] == 5 | s[i] == 9 | s[i] == 15 | s[i] == 19)
					p[i][j] = (2.0/3.0) / (1 - Math.tan(Math.pow(( 0.75 / (1 - x[j]) ), x[j])));
				else
					p[i][j] = 0.25 * Math.atan(1.0 / Math.pow(Math.E, Math.pow(Math.tan(Math.pow(Math.pow(0.5 / (x[j] + 4), x[j]), 1.0/3.0)), 2)));
			}


		printMatrix(p);
	}

	public static void printMatrix(double[][] p)
	{

		for (int i = 0; i < p.length; i++)
		{
			for (int j = 0; j < p[i].length; j++)
				System.out.printf("%5.2f ", p[i][j]);

			System.out.println();
		}

	}

	public static double genRandDouble()
	{
		Random rnd = new Random();
		return (rnd.nextDouble() * 24.0) - 13.0;
	}

}
