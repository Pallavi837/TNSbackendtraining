package com.kprit.tns.hello;

public class MaxMinArray {

	public static void main(String[] args) {
		int arr[]= {23,44,52,634,764};
		int max=arr[0],min=arr[0];
		for(int num:arr) {
			if(num>max) {
				max=num;
			}
			if(num<min) {
				min=num;
			}
		}
		System.out.println("Maximum="+max);
		System.out.println("minimum="+min);
		

	}

}
