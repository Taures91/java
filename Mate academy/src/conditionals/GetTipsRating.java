package conditionals;

public class GetTipsRating {
    public static void main(String[] args) {
        System.out.println(getTipsRating(55));
    }
    public static String getTipsRating(int amount) {
        if (amount == 0) {
            return "terrible";
        } else if (amount <= 10){
            return "poor";
        } else if (amount <= 20){
            return "good";
        }else if (amount <= 50){
            return "great";
        } else
            return "excellent";
    }
}
