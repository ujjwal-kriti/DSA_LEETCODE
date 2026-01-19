class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original_color=image[sr][sc];
        if(original_color!=color){
            dfs(image,sr,sc,original_color,color);
        }
        return image;
    
}
    void dfs(int[][] image,int sr,int sc,int original_color,int color){
        if(sr<0||sr>=image.length||sc<0||sc>=image[0].length||image[sr][sc]!=original_color){
            return ;
        }
        image[sr][sc]=color;
        dfs(image,sr+1,sc,original_color,color);//down
        dfs(image,sr-1,sc,original_color,color);//up
        dfs(image,sr,sc+1,original_color,color);//right
        dfs(image,sr,sc-1,original_color,color);//left

    }
}