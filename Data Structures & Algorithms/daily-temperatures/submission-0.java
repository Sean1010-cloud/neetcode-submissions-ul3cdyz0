class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] result = new int[n];

        for(int i = 0; i < n; i++){
            int count = 1;
            int j = i + 1;
            
            while(j < n){
                if(temperatures[j] > temperatures[i]){
                    break;
                }
                j++;
                count++;
            }
                if(j == n){
                    count = 0;
                }
                result[i] = count;
            }
            return result;
        }
    }

