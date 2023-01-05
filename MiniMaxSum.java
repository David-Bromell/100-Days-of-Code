class Result {

    public static void miniMaxSum(List<Integer> arr) {
    Collections.sort(arr);
    int max = arr.get(0);
    int min = arr.get(0);
    long totalSum =0;
    
    for (int i : arr){
        totalSum = totalSum + i;
        if(i<min)
            min = i;    
        if (i > max)
            max = i; 
        }//System.out.println(min + " " + max);
    System.out.println((totalSum-max) + " " + (totalSum-min));
    }

}