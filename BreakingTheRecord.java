class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    int currentHigh =scores.get(0);
    int currentLow = scores.get(0);
    int highCount = 0;
    int lowCount = 0;
    
    for (int n : scores){
        if (currentHigh<n){
            currentHigh = n;
            highCount +=1;
        }else if (n<currentLow){
            currentLow = n; 
            lowCount +=1;
        }
    }
    
    ArrayList<Integer> record = new ArrayList<Integer>(); 
        record.add(highCount);
        record.add(lowCount);
        return record;

    }

}