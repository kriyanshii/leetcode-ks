long sum = 0, res = 0;
for (int i = 0; i < A.length; ++i) {
sum += A[i];
res = Math.max(res, (sum + i) / (i + 1));
}
return (int)res;