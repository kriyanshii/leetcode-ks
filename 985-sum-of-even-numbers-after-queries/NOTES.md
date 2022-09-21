int idx = queries[i][1];
if (A[idx] % 2 == 0) {
sum -= A[idx];
}
A[idx] += queries[i][0];
if (A[idx] % 2 == 0) {
sum += A[idx];
}
ans[i] = sum;