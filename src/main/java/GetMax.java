public class GetMax {
    /**
     * This method should return the max value of arr (the largest int.)
     * This problem will require you to use a for loop. No other guidance will be provided.
     *
     * @param arr an array of ints to be manipulated.
     * @return the largest value in arr.
     */
    public int max(int[] arr){
        int max = arr[0];

        //skipping checking first element of the array since we have already assigned it to a variable 
        for(int i = 1; i < arr.length; i++){

            if(arr[i] > max){

                max = arr[i];

            }
        }

        return max;
    }
}
