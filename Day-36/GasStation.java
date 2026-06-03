class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;
        int currentTank = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];

            totalTank += gain;
            currentTank += gain;

            if (currentTank < 0) {
                start = i + 1;
                currentTank = 0;
            }
        }

        if (totalTank < 0) {
            return -1;
        }

        return start;
    }
}
