package jp.ac.uryukyu.e245729;
class JudgementSystem {
    public static String judgeScore(Student student, School school){
        if (student.totalScore >= school.requiredScore){
            return " 合計点での合格可能性: 高い";
        }else if (student.totalScore >= school.requiredScore * 0.9){
            return " 合計点での合格可能性: 普通";
        }else {
            return " 合計点での合格可能性: 低い";

        }
        
    }
    public static String judgeGrade(Student student, School school){
        if (student.grades >= school.requiredGrade){
            return " 内申点での合格可能性: 高い";
        }else if (student.grades >= school.requiredGrade * 0.9){
            return " 内申点での合格可能性: 普通";
        }else{
            return " 内申点での合格可能性: 低い";
        }
    }

    
}
