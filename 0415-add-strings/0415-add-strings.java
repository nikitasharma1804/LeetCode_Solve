class Solution {
    public String addStrings(String num1, String num2) {
    int l1=num1.length();
    int l2 =num2.length();
    int i=l1-1;
    int j =l2-1;
        int c =0;
        StringBuilder s = new StringBuilder();
    while(i>=0&&j>=0){
        int sum=c+num1.charAt(i)-'1'+num2.charAt(j)-'1'+2;
        c=sum/10;
        int digit=sum%10;
        s.append(digit);
        i--;
        j--;
    }
        while(i>=0){
            int sum=c+num1.charAt(i)-'1'+1;
         c=sum/10;
        int digit=sum%10;
        s.append(digit);
        i--;
        }
        while(j>=0){
        int sum=c+num2.charAt(j)-'1'+1;
        c=sum/10;
        int digit=sum%10;
        s.append(digit);
        j--;
        }
        if(c!=0){
            s.append(c);
        }
        s.reverse();
        return s.toString();
    }
}