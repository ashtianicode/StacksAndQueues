
/*
The complexity of the function is O(n), beucase everytime we're calling the findSumEqual function (n-1) times

*/



public class findSumEqualClass {

    public static boolean findSumEqual(int[] a, int sum) {
        return findSumEqual(a, sum, 0, a.length - 1);
    }
    
    private static boolean findSumEqual(int[] a, int sum, int i, int j) {
        if (i == j){
            System.out.println("Can't find two numbers which add up to sum.");
            return false;
        }
       
        if (a[i] + a[j] == sum){
            System.out.println("numbers: "+a[i]+" and "+a[j] + " add up to "+ sum);
            return true;
        }
            
        if (a[i] + a[j] < sum){
            return findSumEqual(a, sum, i + 1, j);
        }
        else{
            return findSumEqual(a, sum, i, j - 1);
        }
        
    }


    public static void main(String[] args){

        int[] a =  {1,5,7,12,24,35, 18};
        int k = 30;
        findSumEqual(a , k);

    }


}
