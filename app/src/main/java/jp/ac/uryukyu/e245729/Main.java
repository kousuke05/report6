package jp.ac.uryukyu.e245729;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //学生情報入力
        System.out.print("学生の名前を入力してください: ");
        String studentName = scanner.nextLine();

        System.out.print("内申点を入力してください: ");
        int grades = scanner.nextInt();
        
        System.out.print("科目数を入力してくだいさい: ");
        int numSubjects = scanner.nextInt();
        int[] scores = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++){
            System.out.print("科目" + (i + 1) + " の得点を入力してくださ: ");
            scores[i] = scanner.nextInt();
        }
       

        Student student = new Student(studentName, scores, grades);

        //学校情報の設定
        List<School> schools = new ArrayList<>();
        schools.add(new School("名護高校 普通科"     , 210, 100));
        schools.add(new School("名護高校 フロンティア", 230,100));
        schools.add(new School("具志川高校 普通科"   , 220, 100));
        schools.add(new School("普天間高校 普通科"   , 210, 100));
        schools.add(new School("浦添高校 普通科"     , 190, 100));
        schools.add(new School("那覇国際高校 普通科"  , 230, 100));
        schools.add(new School("那覇 普通科"         , 200, 100));
        schools.add(new School("首里高校 普通科"      , 210, 100));
        schools.add(new School("小禄高校 普通科"      , 190,100));
        schools.add(new School("那覇国際高校 国際科"   , 210, 100));
        schools.add(new School("陽明高校 総合科"      , 150, 100));
       
        //判定
        for (School school : schools){
            System.out.println(school.name + " の判定結果" + JudgementSystem.judgeScore(student, school));

        }
        for (School school : schools){
            System.out.println(school.name + " の判定結果" + JudgementSystem.judgeGrade(student, school));
        }
       
    
        scanner.close();
}
}

