package baseball;

public class Review03 {

    public static void main(String[]args) {
        baseballTeam team1=new baseballTeam("東京ヤクルトスワローズ",80,59,4);
        team1.report();
        baseballTeam team2=new baseballTeam("横浜DeNAベイスターズ",73,68,2);
        team2.report();
        baseballTeam team3=new baseballTeam("阪神タイガース",68,71,4);
        team3.report();
        baseballTeam team4=new baseballTeam("読売ジャイアンツ",68,72,3);
        team4.report();
        baseballTeam team5=new baseballTeam("広島東洋カープ",66,74,3);
        team5.report();
        baseballTeam team6=new baseballTeam("中日ドラゴンズ",66,75,2);
        team6.report();
    }

}
