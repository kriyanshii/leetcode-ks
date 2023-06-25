public int countRoutes(int[] locations, int start, int finish, int fuel) {
int n = locations.length;
long[][] dp = new long[n][fuel + 1];
for (int i = 0; i < n; ++i) {
Arrays.fill(dp[i], -1);
}
return (int) solve(locations, start, finish, dp, fuel);
}
// dp[curCity][fuel] = number of ways to reach finish, when we are at city `curCity` with fuel `fuel`
private long solve(int[] locations, int curCity, int e, long[][] dp, int fuel) {
// 4. There is no further way left.
if (fuel < 0) return 0;
if (dp[curCity][fuel] != -1) return dp[curCity][fuel];
// 3. Now, if we have atleast 1 way of reaching `end`, add 1 to the answer. But don't stop right here, keep going, there might be more ways :)
long ans = (curCity == e) ? 1 : 0;
for (int nextCity = 0; nextCity < locations.length; ++nextCity) {
// 1. Visit all cities except `curCity`.
if (nextCity != curCity) {
// 2. Continue this process recursively.
ans = (ans + solve(locations, nextCity, e, dp, fuel - Math.abs(locations[curCity] - locations[nextCity]))) % 1000000007;
}
}
return dp[curCity][fuel] = ans;
}
}