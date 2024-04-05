package sample;

public class logical {

    public static void main(String[] args) {
        int score = 59;
        
        System.out.print("40 =< score =< 50");
        System.out.println(score >= 40 && score <= 50);
        
        System.out.print("40 =< score or score =< 50");
        System.out.println(score >= 40 || score <= 50);
        
        System.out.print("score !< 60");
        System.out.println(!(score <= 60));
        
        // TODO 自動生成されたメソッド・スタブ

    }

}
