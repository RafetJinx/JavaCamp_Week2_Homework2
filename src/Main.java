/*
@@@@
@@
@       Author:
@@
@@@
 */

public class Main {
    public static void main(String[] args) {

        Course javaReactCourse = new Course("Java + React",
                                    "Yazilim Gelistirici Yetistirme Kampi (JAVA + REACT)",
                                    "Engin Demirog",
                                    0);
        Course CsharpAngularCourse = new Course("C# + Angular",
                                    "Yazilim Gelistirici Yetistirme Kampi (C# + ANGULAR)",
                                    "Engin Demirog",
                                    0);

        Category javaReactCategory = new Category(1,"Front End");
        Category CsharpAngularCategory = new Category(2, "Back End");

        CourseManager courseManager = new CourseManager();
        CategoryManager categoryManager = new CategoryManager();

        // Kursun detayini gosteriyor
        courseManager.showCourse(javaReactCourse);
        courseManager.showCourse(CsharpAngularCourse);

        // Kursu ekliyor
        courseManager.addCourse(javaReactCourse);
        courseManager.addCourse(CsharpAngularCourse);

        // Kursu siliyor
        courseManager.deleteCourse(javaReactCourse);
        courseManager.deleteCourse(CsharpAngularCourse);

        // Kursu duzenliyor
        courseManager.organizeACourse(javaReactCourse);
        courseManager.organizeACourse(CsharpAngularCourse);

        // Kategori ekliyor
        categoryManager.addCategory(javaReactCategory);
        categoryManager.addCategory(CsharpAngularCategory);

        // Kategori siliyor
        categoryManager.deleteCategory(javaReactCategory);
        categoryManager.deleteCategory(CsharpAngularCategory);

        // Kategoriyi duzenliyor
        categoryManager.organizeCategory(javaReactCategory);
        categoryManager.organizeCategory(CsharpAngularCategory);
    }
}
