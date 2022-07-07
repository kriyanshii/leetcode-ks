class Solution {
    public int distributeCandies(int[] candyType) {
		boolean[] map;
		int nCandiesMax = 0;
		int max = 0;
		int min = 0;
		int pos;
		int nCandies = candyType.length;
		
		//Cerco il numero più piccolo e il più grande all'interno di CandyType
		for(int candy : candyType) {
			if(max < candy)
				max = candy;
			else if(min > candy)
				min = candy;
		}
		
		
		map = new boolean[(max - min) + 1];
		max = nCandies/2;
		for(int candy : candyType) {
			pos = candy - min;
			if(!map[pos]) {
				map[pos] = true;
				if(++nCandiesMax >= max) {
					return max;
				}
			}
		}
		
		return nCandiesMax;    }
}