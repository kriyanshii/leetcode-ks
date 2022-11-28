List<List<Integer>> r = Arrays.asList(new ArrayList<>(), new ArrayList<>());
for(Integer player : losses.keySet())
if(losses.get(player) <= 1)
r.get(losses.get(player)).add(player);
​