class Solution {
    public boolean isPowerOfThree(int n) {
        int cnt=0;
        Stack<Integer>stack=new Stack<>();
while(n>0){
int digit=n%3;
stack.push(digit);
n=n/3;
}

    while(!stack.isEmpty()){
        if(stack.peek()==1)cnt++;
        else if(stack.peek()==2){
            return false;
        }
        stack.pop();
    }
    if(cnt==1)return true;
    else 
        return false;
    
    

    }
}