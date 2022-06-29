class Solution {
    public int islandPerimeter(int[][] grid) {
        int isIsland = 0, neighbour = 0;
         for(int i = 0; i < grid.length; i++){
             for(int j = 0; j < grid[0]. length; j++){
                 if(grid[i][j] == 1){
                     isIsland++;
                     if(i < grid.length - 1 && grid[i + 1][j] == 1) neighbour++;//right
                     if(j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbour++;//down
                 }
             }
         }
        return isIsland * 4 - neighbour * 2;
    }
}