class Solution {
    int thirdLargest(int arr[]) {
        // code here
        int first = -1;
        int sec = -1;
        int third = -1;
        
        for(int a : arr){
            if(a >= first){
                third = sec;
                sec = first;
                first = a;
            }
            else if(a >= sec){
                third = sec;
                sec = a;
            }
            else if(a > third){
                third =a;
            }
        }
        
        return third;
    }
}
