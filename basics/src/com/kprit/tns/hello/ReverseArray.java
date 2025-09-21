package com.kprit.tns.hello;

public class ReverseArray {

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		System.out.println("Reversed Array");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}

	}

}
