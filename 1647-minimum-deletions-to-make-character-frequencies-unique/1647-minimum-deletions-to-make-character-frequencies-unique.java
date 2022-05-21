class Solution {
    public int minDeletions(String s) {
         int fmap[] = new int[26];
        for(char ch : s.toCharArray()){
            fmap[ch-'a']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int val : fmap){
            if(val>0)
            pq.add(val);
        }
        int ans=0;
        while(pq.size()>1)
        {
            int top=pq.poll();
            int stop=pq.poll();
            if(top==stop)
            {
                stop--;
                ans++;
                pq.add(top);
                
            }
            if (stop>0)pq.add(stop);
            
            
            
        }
        return ans;
    }
}