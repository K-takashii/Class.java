class Student{
    String name = "sato";

    public void calculateAvg(int math, int english){
        System.out.println((math + english) / 2);
    }
}

public class Lesson1_1{
    public static void main(String[] args) {
        Student a001 = new Student();
        // クラス名 オブジェクト名 = new演算子 クラス名();　これでインスタンス化
        a001.name = "sato";

        System.out.println(a001.name);
    }
}