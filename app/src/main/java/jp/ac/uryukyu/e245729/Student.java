package jp.ac.uryukyu.e245729;
class Student{
    String name;//生徒の名前
    int[] scores;//テストの点数
    int totalScore;//テストの合計点
    int grades; //内申点
    

    public Student(String name, int[] scores, int grade){
        this.name = name;
        this.scores = scores;
        this.grades = grade;
        this.totalScore = calculateTotalScore();
    }
    
    public String getName() {
        return name;
    }
    public int getScore() {
        return totalScore;
    }
    public int getGrade(){
        return grades;
    }
    

    

    private int calculateTotalScore(){
        int total = 0;
        for (int score : scores){
            total += score;
        }
        return total;
    }


}