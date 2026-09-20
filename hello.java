public class hello {

    public static void main(String[] args) {

     Student s1 = new Student("suraj", "B.tech", 101);
      
      System.out.println(s1.rollNo);
    

    }
}

// create class
 class Student {
    String name;
    String course;
    int rollNo;

    Student(String name, String course, int rollNo){
        this.name = name;
        this.course = course;
        this.rollNo = rollNo;

    }
    public void study(){
        System.out.println("name");
    }
}