class Solution {

    class Pair{
        int first; // this will store yi - xi
        int second; // store xi

        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    class MyComparator implements Comparator<Pair>{
        public int compare(Pair p1, Pair p2){
            return Integer.compare(p2.first, p1.first);
        }
    }

    public int findMaxValueOfEquation(int[][] points, int k) {
        // Bruteforce
        // results in TLE due to large constrainsts

        // int maxVal = Integer.MIN_VALUE;

        // for(int i = 0; i < points.length; i ++){
        //     for(int j = i + 1; j < points.length; j ++){
        //         if(Math.abs(points[i][0] - points[j][0]) > k)break;
        //         else{
        //             maxVal = Math.max(maxVal, points[i][1] + points[j][1] + Math.abs(points[i][0] - points[j][0]));
        //         }
        //     }
        // }

        // return maxVal;

        // Modifying and playing around the equation
        // We observe that as xi < xj we can mould the given equation as
        // yi + yj + xj - xi to (yi - xi) + (xj + yj) so we have to only look to maximise the value
        // of (yi - xi)

        int ans = Integer.MIN_VALUE;

        PriorityQueue<Pair> pq = new PriorityQueue(new MyComparator());

        for(int i[]: points){

            while(!pq.isEmpty() && i[0] - pq.peek().second  > k){
                pq.poll();
            }            
            
            if(!pq.isEmpty()){
                ans = Math.max(ans, i[0] + i[1] + (pq.peek().first));
            }
            int f = i[1] - i[0];
            int s = i[0];
            pq.offer(new Pair(f, s));
        }

        return ans;

    }
}
