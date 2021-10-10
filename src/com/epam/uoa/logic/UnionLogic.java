package com.epam.uoa.logic;

public class UnionLogic {
	

	public static int[] Union(int[] firstArray, int[] secondArray, int positionNumber) {

		int[] newArray = new int[firstArray.length + secondArray.length];

		for (int i = 0; i < newArray.length; i++) {
			if (i <= positionNumber) {
				newArray[i] = firstArray[i];
			} else if (i > positionNumber && i <= positionNumber + secondArray.length) {
				newArray[i] = secondArray[i - positionNumber - 1];
			} else if (i > positionNumber + secondArray.length) {
				newArray[i] = firstArray[i - secondArray.length];
			}

		}
		return newArray;

	}

}
