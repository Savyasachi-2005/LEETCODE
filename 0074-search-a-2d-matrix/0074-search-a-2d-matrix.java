class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=matrix.length;
        if(r==0)return false;
        int col=matrix[0].length;
        for(int i=0;i<r;i++){
            if(target>=matrix[i][0] && target<=matrix[i][col-1]){
                int left=0,right=col-1;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(matrix[i][mid]==target)return true;
                    if(matrix[i][mid]>target)right=mid-1;
                    else left=mid+1;
                }
            }
        }
        return false;
    }
}