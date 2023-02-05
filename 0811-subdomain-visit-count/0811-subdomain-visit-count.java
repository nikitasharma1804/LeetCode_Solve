class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
    HashMap<String , Integer> hp = new HashMap<>();
    
        for(String s : cpdomains){
            
            String [] name= s.split(" ");
            int no =Integer.valueOf(name[0]);
            String[] sd= name[1].split("\\.");
            String prev= "";
            if(sd.length==3){
              prev= "."+sd[2];   
            hp.put(sd[2],hp.getOrDefault(sd[2],0)+no);
            }    
            prev=sd[1]+prev;
            hp.put(prev,hp.getOrDefault(prev,0)+no);
            prev=sd[0]+"."+prev;
            hp.put(prev,hp.getOrDefault(prev,0)+no);
        
            
        }
        
     List<String> ans = new ArrayList<>();
        for(String key:hp.keySet()){
            String a= hp.get(key)+" "+key;
            ans.add(a);
        }
        return ans;
    }
}