package com.company;

import javafx.scene.effect.Blend;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] arr={24,69,100,99,79,78,67,36,26,19};
        int[] result = new int[arr.length];
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println(i);
            }
        }

        int l=0;
        int r= arr.length-1;
        int m=(l+r)/2;
        while (! ((arr[m-1] < arr[m ]) && arr[m]>arr[m+1])) {
            if (arr[m - 1] < arr[m]) {
                l = m;
            } else {
                r=m;
            }
            m=(l+r)/2;
        }
        System.out.println(m);

    }
}
