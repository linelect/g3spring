import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Group group1 = new Group(1, "Group1");
        Group group2 = new Group(2, "Group2");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(group1, "Student1", 80));
        students.add(new Student(group1, "Student2", 40));
        students.add(new Student(group1, "Student3", 98));
        students.add(new Student(group1, "Student4", 50));
        students.add(new Student(group2, "Student5", 100));
        students.add(new Student(group2, "Student6", 35));
        students.add(new Student(group2, "Student7", 98));
        students.add(new Student(group2, "Student8", 56));
        students.add(new Student(group2, "Student9", 60));
        students.add(new Student(group2, "Student10", 75));

//      1) Выбрать всех студентов групы по номеру N
        students.stream()
                .filter(student -> student.getGroup().getId() == 2)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

//        2) Выбрать всех студентов по номеру группы и среднему балу выше 50 из 100
        students.stream()
                .filter(student -> student.getGroup().getId() == 1 & student.getAvgRating() > 50)
                .forEach(System.out::println);

        System.out.println("-----------------------------------");

//        3) Создать объект професий и если средний бал студента выше 80 то переобразовать его в провесионала (Професия)
        students.stream()
                .filter(student -> student.getAvgRating() > 80)
                .map(Profession::new)
                .forEach(System.out::println);

    }

}
