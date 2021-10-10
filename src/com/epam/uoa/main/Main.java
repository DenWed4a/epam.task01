package com.epam.uoa.main;

import com.epam.uoa.logic.UnionLogic;
import com.epam.uoa.view.UnionView;

public class Main {

	public static void main(String[] args) {

		int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] secondArray = { 90, 80, 70, 60, 50, 40 };
		int k = 4;
		int[] result = UnionLogic.Union(firstArray, secondArray, k);
		UnionView view = new UnionView();
		view.Print(result);

	}

}
