class Solution {
    public static void flipArr(int[] arr){
        int n = arr.length;
        int left = 0; 
        int right = n - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public int[][] flipAndInvertImage(int[][] image){
        int n = image.length;   
        for(int i = 0; i < n; i++){
            flipArr(image[i]);
        }   

        for(int i = 0; i < n; i++){
            for (int j = 0; j < image[i].length; j++){
               if(image[i][j] == 1){
                image[i][j] = 0;
               } else{
                image[i][j] = 1;
               }
            }
        }

        return image;
    }  
}