package jp.ac.uryukyu.e245729;
class Student{
    String name;
    int[] scores;
    int totalScore;

    public Student(String name, int[] scores){
        this.name = name;
        this.scores = scores;
        this.totalScore = calculateTotalscore();
    }

    private int calculateTotalscore(){
        int total = 0;
        for (int score : scores){
            total += score;
        }
        return total;
    }


}