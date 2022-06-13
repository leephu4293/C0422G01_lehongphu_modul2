package acess_modifier.bai_tap;

public class TestStu {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setClasses("Phong");
        stu.setName("C04");
        System.out.println("ten student" + stu.getName()+ "\n"+"lop " + stu.getClasses());
    }
}
