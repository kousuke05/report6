package jp.ac.uryukyu.e245729;
class JudgementSystem {
    public static String judge(Student student, School school){
        if (student.totalScore >= school.requiredScore){
            return "合格可能性: 高い";
        }else if (student.totalScore >= school.requiredScore * 0.9){
            return "合格可能性: 普通";
        }else {
            return "合格可能性: 低い";

        }
    }

    
}
