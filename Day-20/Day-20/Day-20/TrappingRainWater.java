    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int[] pref = new int[n];
        int[] suf = new int[n];
        pref[0] = arr[0];
        suf[n-1] = arr[n-1];
        int sum = 0;
        
        for(int i = 1; i <n; i++){
            pref[i] = Math.max(pref[i-1],arr[i]);
        }
        
        for(int i = n-2; i >= 0; i--){
            suf[i] = Math.max(suf[i+1],arr[i]);
        }
        
        for(int i = 0; i <n; i++){
            sum = sum + (Math.min(pref[i], suf[i]) - arr[i]);
        }
        
        return sum;
    }
}
