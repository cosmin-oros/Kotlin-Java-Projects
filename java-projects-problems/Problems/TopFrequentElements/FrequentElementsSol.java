package Problems.TopFrequentElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class FrequentElementsSol {
    public int[] topKFrequent(int[] arr, int k) {
        int n = arr.length;

        if(k == n){
            return arr;
        }

        int[] ans = new int[k];

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int e:arr){
            hm.put(e, hm.getOrDefault(e,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((e1, e2)->hm.get(e1)-hm.get(e2));

        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            int key=e.getKey();

            if(pq.size()<k){
                pq.add(key);
            }else{
                if(hm.get(pq.peek())<hm.get(key)){
                    pq.poll();
                    pq.add(key);
                }
            }
        }

        int i=0;

        while(!pq.isEmpty()){
            ans[i++]=pq.poll();
        }

        return ans;
    }
}
