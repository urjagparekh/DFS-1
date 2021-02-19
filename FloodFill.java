class Solution

    { 

      public int[][] floodFill(int[][] image, int sr, int sc, int newColor)

    { if (image[sr][sc] == newColor)

    return image; 

    int color = image[sr][sc]; 

    dfs(image,sr,sc,newColor, color); 

    return image; 

    } 

    private void dfs(int[][] image, int sr, int sc, int newColor, int color)

    { // base case 

    if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color) 

    return; 

    //logic 

    image[sr][sc] = newColor; 

    int [][] dirs = new int[][] 

    {{0,1}, {1,0}, {-1,0}, {0,-1}}; 

    for(int[] dir : dirs)

    { 

    int r = sr + dir[0]; 

    int c = sc + dir[1]; 

    dfs(image, r , c, newColor, color); 

    } 

    }}




