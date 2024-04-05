package sample;

public class switchsample {

    public static void main(String[] args) {
        var score = 72;
        
        switch (score / 10) {
            case 10 -> System.out.println("manten");
            case 9, 8 -> System.out.println("good");
            default -> System.out.println("loser");
        }
        // TODO 自s動生成されたメソッド・スタブ

    }

}
