class MapSum {
    public static class Node{
        Node [] children = new Node[26];
        int score=0;
    }
    Node root;
    HashMap<String, Integer> hp;
    public MapSum() {
     root= new Node();
     hp= new HashMap<>();
    }
    
    public void insert(String key, int val) {
     int delta = val- hp.getOrDefault(key,0);
     hp.put(key,val);
     
    Node curr= root;
        for(int i =0;i<key.length();i++){
            char c= key.charAt(i);
            if(curr.children[c-'a']==null){
                curr.children[c-'a']=new Node();
            }
            curr=curr.children[c-'a'];
            curr.score+=delta;
        }
        
    }
    
    public int sum(String prefix) {
    Node curr= root;
        for(int i =0;i<prefix.length();i++){
            char c= prefix.charAt(i);
            if(curr.children[c-'a']==null){
                return 0;
            }
            curr=curr.children[c-'a'];
           
        }  
       return curr.score; 
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */