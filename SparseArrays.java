 public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    
    ArrayList<Integer> output = new ArrayList<Integer>();
    
    for (String n : queries){
        int count = 0;
        for (String j : strings ){
            if(n.equals(j)){
                count++;
            }
        }
        output.add(count);
    }
    return output;
    }

}