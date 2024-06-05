package basicjava;

public class SecondHighest{
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 15, 25};
        int secondHighest = findSecondHighest(array);
        System.out.println("The second highest value in the array is: " + secondHighest);
    }
    
    public static int findSecondHighest(int[] array) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        
        return secondMax;
    }
}
