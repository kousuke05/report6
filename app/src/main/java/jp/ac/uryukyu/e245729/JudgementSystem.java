package jp.ac.uryukyu.e245729;
/**
 * 与えられた情報から志望校の判定を出します
 */
class JudgementSystem {
    /**
     * 志望校判定をテストの点数で判別する
     * @param student　生徒の点数
     * @param school　学校の情報
     * @return　志望校判定結果
     */
    public static String judgeScore(Student student, School school){
        if (student.totalScore >= school.requiredScore){
            return " 合計点での合格可能性: 高い";
        }else if (student.totalScore >= school.requiredScore * 0.9){
            return " 合計点での合格可能性: 普通";
        }else {
            return " 合計点での合格可能性: 低い";

        }
        
    }
    /**
     * 志望校判定を内申点で判別する
     * @param student　生徒の内申点
     * @param school　学校の情報
     * @return　志望校判定結果
     */
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
