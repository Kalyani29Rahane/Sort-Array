package com.tka;
import java.util.Arrays;
public class Sort {
 public static void main(String[] args) {
	 int temp;
	int arr[]= {10,40,30};
	
	for(int i=0;i<arr.length-1;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
			System.out.println("sorted array:");
			System.out.println(Arrays.toString(arr));
			for(int num:arr) {
				System.out.println(num);
			}
		}
	}


