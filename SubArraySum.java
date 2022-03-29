package com.company;

public class SubArraySum {

    public static void main(String[] args) {


	// write your code here
        // arr = {1,3,7, 0 , 2, 1}
        // sum = 10
        // time comp = O(n)
        // space comp = O() //  TBD

        //count all the continous subarray having sum equal target

        // iterate element
        // keep startIndex
        // sum += cur and if sum > target , then increment startIndex
        // else keep adding and if sum = target then inc res counter


        int [] arr = {1,2,1,3,7, 0 , 1,1, 1};
        //1,1,1,,1, 1, , 9, 1};
        int curSum = 0;
        int target = 10;
        int startIndex = 0;
        int res = 0;
        for (int i = 0 ; i < arr.length; i++) {
            curSum = curSum+arr[i];
            if (curSum < target) {
//                curSum+=arr[i];
            } else if (curSum > target) {
                while (curSum > target) {
                    curSum-=arr[startIndex];
//                    sum = curSum;
                    startIndex++;
                    if (curSum == target) {
                        res++;
                        break;
                    }

                }

            } else {
                res++;
            }
        }
        System.out.println("Result is "+ res);
    }
}
