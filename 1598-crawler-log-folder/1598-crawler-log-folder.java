class Solution {
    public int minOperations(String[] logs) {
        int a=0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../") && a>0){
                a-=1;
            }else if(!logs[i].equals("./") && !logs[i].equals("../")){
                a+=1;
            }
        }
       
        return a;
    }
}