class Solution {
    public boolean isMatch(String s, String p) {
        int memo[][]=new int[s.length()+1][s.length()];
        for(int row[]:memo)
        {
            Arrays.fill(row,-1);
        }
       return solve(0,0,s,p,memo); 
    }
    public boolean solve(int sidx,int pidx,String s,String p,int memo[][])
    {
        if(sidx>=s.length()&&pidx>=p.length())
        {
            return true;
        }
        if(pidx>=p.length())
        {
            return false;
        }
       
        // if(memo[pidx][sidx]!=-1)
        // {
        //     if(memo[pidx][sidx]==1)return true;
        //     return false;
        // }
        boolean op1=false;
       boolean isSame=sidx < s.length() && (s.charAt(sidx) == p.charAt(pidx) || p.charAt(pidx) == '.');
       if(pidx+1<p.length()&&p.charAt(pidx+1)=='*')
        {
         op1=solve(sidx,pidx+2,s,p,memo)||(isSame&&solve(sidx+1,pidx,s,p,memo));
        }
        else if(isSame)
             op1=solve(sidx+1,pidx+1,s,p,memo);
        // if(op1)memo[pidx][sidx]=1;
        // else memo[pidx][sidx]=0;
        return op1;
    }
}