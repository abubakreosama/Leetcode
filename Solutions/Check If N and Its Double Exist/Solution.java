class Solution {
    public boolean checkIfExist(int[] arr) {
        boolean isThere = false;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (i == j){
                    continue;
                }
                if (arr[i] == arr[j]*2){
                    isThere = true;
                    return isThere;
                }
            }
        }
        return isThere;
    }
}