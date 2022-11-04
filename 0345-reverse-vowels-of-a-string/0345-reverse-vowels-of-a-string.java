class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
       int i =0;
        int n =s.length();
        int j= n-1;
        HashSet<Character> h=new HashSet<>();
        h.add('a');
        h.add('e');
        h.add('i');
        h.add('o');
        h.add('u');
        h.add('A');
        h.add('E');
        h.add('I');
        h.add('O');
        h.add('U');
        if(arr.length==0){
            return s;
        }
        while(i<n&&!h.contains(arr[i])){
            i++;
        }
        while(j>=0&&!h.contains(arr[j])){
            j--;
        }
        
        while(i<j){
            char c=arr[i];
            arr[i]=arr[j];
            arr[j]=c;
            i++;
            j--;
            while(i<n&&!h.contains(arr[i])){
            i++;
        }
            while(j>=0&&!h.contains(arr[j])){
            j--;
        }
            
        }
        
        return String.copyValueOf(arr);
    }
}