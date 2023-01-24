package programmers.level_2;

class StockPrice {
    public int[] solution(int[] prices) {
        int count;
        int[] answer = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            count = 0;
            int price = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (price > prices[j]) {
                    count++;
                    break;
                }
                count++;
            }
            answer[i] = count;
        }
        return answer;
    }
}

