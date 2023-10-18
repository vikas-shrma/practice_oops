// this class to test abstarction examples

 class User{

    String name ;
    String age;

    public void printName () {
        System.out.println("Printing Name -> "+name);
    }
}

 class Student extends User{

    String name;
    public void printName() {
        System.out.println("Printing School Name "+name);
    }
}

class Teacher extends Student{
    String name;
    public void printName() {
        System.out.println("Printing Teacher Name "+name);
    }
}

public class abstarction {

public static void main(String[] args) {
    Student student1 = new Student();
    student1.name = "Vikas";
    User student2 = new Student();
    student2.name = "Rahul";
User student3 = new Teacher();

    student1.printName();
    student2.printName();
    student3.printName();
}

}