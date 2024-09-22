package baseball;

public class baseballTeam {

    private String name;
    private int win;
    private int lose;
    private int draw;

    public baseballTeam(String name,int win,int lose,int draw) {

        this.name=name;
        this.win=win;
        this.lose=lose;
        this.draw=draw;
    }

    public double getRate() {
        if(win+lose==0) {
    }
        return(double) win/(win+lose);
    }

    public void report() {
        System.out.println(name+"の2022年の成績は"+win+"勝"+lose+"敗"+draw+"分、勝率は"+getRate()+"です。");
    }

}
