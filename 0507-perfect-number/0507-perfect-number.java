class Solution {
    public boolean checkPerfectNumber(int num) {
        int count=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                if(i==num){
                    break;
                }
                count+=i;
            }

        }
        if(count==num){
            return true;
        }
        return false;
    }
    
}