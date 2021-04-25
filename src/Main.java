public class Main {

    public static void main(String[] args) {
        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)","Engin Demiroğ");
        Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)","Engin Demiroğ");

        User user1 = new User(1,"Emre Kaan","Seylim","123456");

        Course[] courses = {
                course1,
                course2
        };

        User[] users = {
                user1
        };

        for (Course course:courses) {
            System.out.println("Kurs Adı: " + course.name);
            System.out.println("Kurs Eğitmeni: " + course.teacher);
            System.out.println("----------------------------");
        }

        for (User user :users) {
            System.out.println("Kullanıcı Adı: "+user.name);
            System.out.println("Kullanıcı Soyadı: "+user.lastName);
            System.out.println("----------------------------");
        }

        CourseManager courseManager = new CourseManager();
        courseManager.studentRegistration(user1);
        courseManager.courseUpdate(course2);
    }
}
