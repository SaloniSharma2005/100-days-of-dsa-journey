class Solution {
    public String reformatDate(String date) {

        String[] arr = date.split(" ");

        String months = "JanFebMarAprMayJunJulAugSepOctNovDec";

        String day = arr[0].substring(0, arr[0].length() - 2);

        if (day.length() == 1) day = "0" + day;

        int month = months.indexOf(arr[1]) / 3 + 1;

        return arr[2] + "-" +
               (month < 10 ? "0" : "") + month +
               "-" + day;
    }
}
