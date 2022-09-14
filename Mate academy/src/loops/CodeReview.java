package loops;
/*
створи змінну int solutionAttempts - кількість спроб вирішити завдання;
створи цикл do while, всередині якого solutionAttempts збільшуватиметься на 1;
повторюй цикл, допоки solutionAttempts залишається меншою, ніж maxAttempts;
поверни результат solutionAttempts із методу.
 */
public class CodeReview {
    public static void main(String[] args) {

    }
    public static int reviewCode(int maxAttempts) {
        int solutionAttempts = 0;
        do {
            solutionAttempts++;
        } while (solutionAttempts < maxAttempts);
        return solutionAttempts;
    }
}
