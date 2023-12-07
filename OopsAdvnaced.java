
// Encapsulation: Using private access modifiers to encapsulate data
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Inheritance: Creating a subclass that inherits from a superclass
class Student extends Person {
    private String studentId;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}

// Polymorphism: Using method overriding to provide different implementations
class Teacher extends Person {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getName() {
        return "Teacher: " + super.getName();
    }
}

public class OopsAdvnaced {
    public static void main(String[] args) {
        // Encapsulation example
        Person person = new Person();
        person.setName("John");
        person.setAge(25);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Inheritance example
        Student student = new Student();
        student.setName("Alice");
        student.setAge(20);
        student.setStudentId("12345");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentId());

        // Polymorphism example
        Teacher teacher = new Teacher();
        teacher.setName("Mr. Smith");
        teacher.setAge(35);
        teacher.setSubject("Math");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Age: " + teacher.getAge());
        System.out.println("Subject: " + teacher.getSubject());
    }
}
