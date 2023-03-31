class student {
    int roll_no;
    String name;

}

public class Array {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();
        student s4 = new student();
        student s[] = { s1, s2, s3, s4 };
        for (int i = 0; i < 4; i++) {
            System.out.println(s[i]);
        } // student s[]=new student[4];
    }
}