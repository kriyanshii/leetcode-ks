https://leetcode.com/problems/island-perimeter/discuss/95001/clear-and-easy-java-solution
​
here,
if(i < grid.length - 1&& grid[i + 1][j] == 1) neighbour++;//right
if(j < grid[i].length - 1 && grid[i][j + 1] == 1) neighbour++;//down
here i = grid.length - 1 because it checks for i + 1;