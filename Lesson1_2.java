class Student{
    String name = "sato";

    public void calculateAvg(int math, int english){
        System.out.println((math + english) / 2);
    }
}

public class Lesson1_2{
    public static void main(String[] args) {
        Student a001 = new Student();
        a001.name = "sato";

        System.out.println(a001.name);
        a001.calculateAvg(90, 80);
    }
}
