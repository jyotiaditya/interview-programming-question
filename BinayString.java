package com.company;

public class BinayString {
    public static void main(String[] args) {
        // count number of substring containing k 1's  in it
        // 1010 and k = 2 , output = 2 , {1,0,1}, {1,0,1,0}
        // if k = 1 output  = 6  [{1}, {1,0}, {0,1}, {0,1,0}, , {1,0}, {1}]

        // output is count of all substring
//        Proposal
        // generate all substring of all length from k to n ->  this is issue
        // then filter out substring having k 1's

        // keep one startIndex sliding pointer
        // if number of 1s < k
//        00100100 k = 2
//        001001 , startIndex = 0 , endIndex = 5
//        00100100 startIndex = 0 , endIndex =
        // 100100, 0010010, 010010, 10010,  startIndex 0010
        // if next elem = 0 then startIndex would by 1
        // next elem =1 then   startIndex = first 1th position
//        startIndex = 0 , endIndex = 0
        int []  arr  = {0,0,1,0,0,1,0,0};
        int startIndex = 0;
        int target = 2;
        int total = 0;
        int res = 0;
        for (int i  = 0 ; i < arr.length; i++) {
            if(arr[i] ==1) {
                total+=1;
            }
            if (total< target) {

            } else if (total > target) {

            } else {
                res++;
                while (arr[startIndex]!=1) {
                    startIndex++;
                    res++;
                }

            }
        }



    }
}
