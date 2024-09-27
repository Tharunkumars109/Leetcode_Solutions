class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count=0;
        for(int i=0;i<seats.length;i++)
        {
            if(seats[i]>students[i])
            {
                count+=seats[i]-students[i];
                
            }
            else
            {
                count+=students[i]-seats[i];
            }
        }
        return count;
    }
}