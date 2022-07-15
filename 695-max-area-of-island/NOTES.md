https://leetcode.com/problems/max-area-of-island/discuss/108533/JavaC%2B%2B-Straightforward-dfs-solution
​
I still have doubt regarding how the area has been counted.
​
Okay okay okay - it is total no of tiles.
On some days i am just silly
​
if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
grid[i][j] = 0;
return 1 + areaOfIsland(grid, i - 1, j) + areaOfIsland(grid, i + 1, j) + areaOfIsland(grid, i, j + 1) + areaOfIsland(grid, i, j - 1);
}
return 0;