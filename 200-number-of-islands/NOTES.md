https://leetcode.com/problems/number-of-islands/discuss/56359/Very-concise-Java-AC-solution
​
DFS
if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] != '1'){
return;
}
grid[i][j] = '0';
DFSMarking(grid, i + 1, j);
DFSMarking(grid, i - 1, j);
DFSMarking(grid, i, j + 1);
DFSMarking(grid, i, j - 1);