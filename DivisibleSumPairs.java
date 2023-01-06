
class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
   
    //to add the count up of pairs! 
    int count = 0; 
    
    for(int i = 0; i<n; i++){
        for(int j =i+1; j<n; j++){
            int currentNum = (ar.get(i) + ar.get(j)) %k;
                if(currentNum==0){
                    System.out.println(i + " " + j);
                    count++;
                }
            }
        }
        return count;
    }
}