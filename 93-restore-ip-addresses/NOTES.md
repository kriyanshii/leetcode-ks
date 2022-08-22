For those who are wondering why the author is doing result.add(path.substring(1)); is to eleminate the "." at the start of the string . It was added for the first time when the string path is empty .
Example: when the path is empty,path="" and let part be some random string let's say part = "abc"
So path +"."+part = ".abc"
To eliminate this "." we are doing substring(1)
If you want you can also do a check while calling and get rid of the substring method while adding in result.
Like this
​
doRestore(result, path.length()==0 ?  part:path + "." + part, s.substring(i), k + 1);