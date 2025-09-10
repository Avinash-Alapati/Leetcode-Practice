class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxCandy = 0;
        ArrayList<Boolean> result = new ArrayList<>();

        for(int candy : candies) {
            maxCandy = Math.max(candy , maxCandy);
        }
        for (int i =0; i < n; i++){
            int candiesTotal = candies[i];
            candiesTotal += extraCandies;

            if(candiesTotal >= maxCandy){
                result.add(true);
            }
             else{
                result.add(false);
            }
        }
        return result;
    }
}