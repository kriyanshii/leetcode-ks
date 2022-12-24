```
private static final int MOD = 1_000_000_007;
public int numTilings(int N) {
int p3 = -1, p2 = 0, p1 = 1;
for (int n = 1; n <= N; n++) {
int cur = (int)((p1 * 2L + p3) % MOD);
p3 = p2;
p2 = p1;
p1 = cur;
}
return p1;
}
```