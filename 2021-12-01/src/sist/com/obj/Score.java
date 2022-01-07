package sist.com.obj;

public class Score {
    
    private int kor;
    private int eng;
    private int mat;
    private double avg;
    private int rank;

    public Score() {
        super();
    }

    public Score(int kor, int eng, int mat, double avg, int rank) {
        super();
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.avg = avg;
        this.rank = rank;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void averageProcess() {
        this.avg = (this.kor + this.mat + this.eng) / 3.;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Score [kor=" + kor + ", eng=" + eng + ", mat=" + mat + ", avg=" + avg + ", rank=" + rank + "]";
    }
}