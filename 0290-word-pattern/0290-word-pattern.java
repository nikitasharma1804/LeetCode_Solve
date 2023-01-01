class Solution {
    public boolean wordPattern(String pattern, String s) {
    HashMap<Character,String> hp = new HashMap<>();
    HashSet<String> hs= new HashSet<>();
    String [] arr = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c= pattern.charAt(i);
            if(hp.containsKey(c)){
                if(!hp.get(c).equals(arr[i])){
                    
                return false;
                }
                
            }
            else{
                if(hs.contains(arr[i])){
                    return false;
                }
                hp.put(c,arr[i]);
                hs.add(arr[i]);
            }
        }
        return true;
    }
}