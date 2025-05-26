package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int[] intArray = createAndInitializeArray(Utils.integer("Inserta el tamaño del array "));
		showInlineArray(intArray);
	}

	public static int [] createAndInitializeArray(int tamaño){
		int [] intArray = new int[tamaño];
		for (int i = 0; i < intArray.length; i++ ){
			intArray[i] = i+1;
		}
		return intArray;
	}

	public static void showInlineArray(int [] array){
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + " ");
			} else {
			System.out.print(array[i]);
		}
		}
	}

}
