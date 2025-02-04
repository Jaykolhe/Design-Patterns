//package Builder;
//
//public class Student {
//
//    private final int id;
//    private final String name;
//    private final String age;
//    private final String gender;
//    private final String gradYear;
//    private final String major;
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public String getGradYear() {
//        return gradYear;
//    }
//
//    public String getMajor() {
//        return major;
//    }
//
//
//
//    public Student(StudentBuilder builder) {
//        this.id = builder.getId();
//        this.name = builder.getName();
//        this.age = builder.getAge();
//        this.gender = builder.getGender();
//        this.gradYear = builder.getGradYear();
//        this.major = builder.getMajor();
//    }
//
//    public static StudentBuilder builder() {
//        return new StudentBuilder();
//    }
//}
