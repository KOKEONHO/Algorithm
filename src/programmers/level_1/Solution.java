package programmers.level_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};

        int result = solution(ingredient);

        bw.write(Integer.toString(result));
        bw.newLine();

        bw.flush();
        bw.close();
    }

    static int solution(int[] ingredient) {

        int ingredientNumber, lastIndex = -1, burgerCount = 0;
        Stack<Integer> burgerStack = new Stack<>();
        boolean checkBurgerMade = false;

        for (int i = 0; i < ingredient.length; i++) {
            ingredientNumber = ingredient[i];
            if (ingredientNumber == 1) {        // 빵
                if (burgerStack.isEmpty()) {        // burgerStack이 비어있을 경우
                    burgerStack.push(i);
                    lastIndex = i;
                    continue;
                } else {        // burgerStack이 비어있지 않을 경우
                    if (burgerStack.size() < 3) {
                        burgerStack.clear();
                        burgerStack.push(i);
                        lastIndex = i;
                        continue;
                    }
                    if (burgerStack.size() == 3) {
                        burgerStack.push(i);

                    }
                }
            }
            if (ingredientNumber == 2) {        // 야채

            }
            if (ingredientNumber == 3) {        // 고기

            }
        }

    }
}
