package com.mujahid.development;

import java.util.*;

public class P1_SystemProperties1 {

	public static void main(String[] args) {

		Properties p1 = System.getProperties();
		p1.list(System.out);
	}

}
