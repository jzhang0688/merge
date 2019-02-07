package com.company;

public class Main {

    public static void main(String[] args) {
	int[] Arr = {1,5,4,3,7,2,10};
	int[] temp= {};
	merge.mergeSortHelper(Arr, 0, 6, temp);
	System.out.println(Arr);
    }
}
