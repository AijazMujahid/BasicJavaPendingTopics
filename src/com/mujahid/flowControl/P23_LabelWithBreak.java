package com.mujahid.flowControl;

public class P23_LabelWithBreak {

	public static void main(String[] args) {

		l1:
			for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
			{
			if(i==j)
			break;
			System.out.println(i+"........."+j);
			}

			}
	}

}
