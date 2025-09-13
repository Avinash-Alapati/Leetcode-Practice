class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n = items.size();
        int itemsMatched = 0;

        if(ruleKey.equals("type")){
            for(int i = 0; i < n; i++){
                if(ruleValue.equals(items.get(i).get(0))){
                    itemsMatched++;
                }
            }
        }

        if(ruleKey.equals("color")){
            for(int i = 0; i < n; i++){
                if(ruleValue.equals(items.get(i).get(1))){
                    itemsMatched++;
                }
            }
        }

        if(ruleKey.equals("name")){
            for(int i = 0; i < n; i++){
                if(ruleValue.equals(items.get(i).get(2))){
                    itemsMatched++;
                }
            }
        }

        return itemsMatched;
    }
}