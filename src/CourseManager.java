public class CourseManager {
    public void studentRegistration(User user){
        System.out.println(user.name + " " + user.lastName + " Kursa kayıt oldu");
    }

    public void courseUpdate(Course course){
        System.out.println(course.name + " Kursu Başarıyla Güncellendi.");
    }
}
