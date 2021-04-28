import java.util.LinkedList;
import java.util.Scanner;

public class CourseManager {
    Scanner scanner = new Scanner(System.in);

    // Kursun detayini gosteriyor
    public void showCourse(Course course){
        System.out.println("Kursun Adi: " + course.getCourseName());
        System.out.println("Kursun Icerigi: " + course.getCourseContent());
        System.out.println("Kursun Egitmeni: " + course.getInstructor());
        System.out.println("Kursun Ucreti: " + course.getCourseFee() + " TL");
    }

    // Kursu ekliyor
    public void addCourse(Course course){
        System.out.println("Kursun adını giriniz: ");
        course.setCourseName(scanner.nextLine());
        System.out.println("Kursun içeriğini giriniz: ");
        course.setCourseContent(scanner.nextLine());
        System.out.println("Kursun eğitmenini giriniz: ");
        course.setInstructor(scanner.nextLine());
        System.out.println("Kursun ücretini giriniz: ");
        course.setCourseFee(scanner.nextInt());
        scanner.nextLine();
    }

    // Kursu siliyor
    public void deleteCourse(Course course){
        System.out.println(course.getCourseName() + " isimli kurs silindi.");
    }

    // Kursu duzenliyor
    public void organizeACourse(Course course){
        int transaction;
        String transactions = """
                \t1. Kurs adını değiştir
                \t2. Kurs içeriğini değiştir
                \t3. Eğitmeni değiştir
                \t4. Kurs ücretini değiştir
                \t5. Kursun özelliklerini göster
                \t6. Kurs düzenlemeden çıkmak için bu işlemi seçiniz""";
        while(true){
            System.out.println("Düzenlenecek olan kurs: " + course.getCourseName());
            System.out.println("Kurs düzenleme işlemleri şu şekildedir:");
            System.out.println(transactions);
            System.out.print("Seçiminiz: ");
            transaction = scanner.nextInt();
            scanner.nextLine();
            if(transaction == 1){
                System.out.print("Kursun adı: ");
                course.setCourseName(scanner.nextLine());
            } else if(transaction == 2){
                System.out.print("Kursun içeriği: ");
                course.setCourseContent(scanner.nextLine());
            } else if(transaction == 3){
                System.out.print("Kursun eğitmeni: ");
                course.setInstructor(scanner.nextLine());
            } else if(transaction == 4){
                System.out.print("Kursun ücreti: ");
                course.setCourseFee(scanner.nextInt());
                scanner.nextLine();
            } else if(transaction == 5) {
                showCourse(course);
                System.out.println();
            } else if(transaction == 6) {
                System.out.println("Kurs düzenlemeden çıkış gerçekleştiriliyor...");
                break;
            } else{
                System.out.println("Geçerli bir işlem giriniz...");
            }
        }
    }
}
