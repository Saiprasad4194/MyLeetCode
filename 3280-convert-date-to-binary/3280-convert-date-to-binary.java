class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder result = new StringBuilder();
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        result.append(Integer.toBinaryString(year));
        result.append("-");
        result.append(Integer.toBinaryString(month));
        result.append("-");
        result.append(Integer.toBinaryString(day));
        return result.toString();
    }
}