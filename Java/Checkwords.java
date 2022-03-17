boolean solution(String[] words, String variableName) {
    String [] auxSplited=  variableName.split("(?=\\p{Upper})");
    List<String> lisString = new ArrayList<>(Arrays.asList(words));
    for(String e:auxSplited){
        if(!Arrays.asList(words).contains(e.toLowerCase())){
            return false;
        }
    }   
    return true;
}
