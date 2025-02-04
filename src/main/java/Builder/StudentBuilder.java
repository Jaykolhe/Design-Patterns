//package Builder;
//
//public class StudentBuilder {
//
//    private int id;
//    private String name;
//    private String age;
//    private String gender;
//    private String gradYear;
//    private String major;
//
//    public StudentBuilder setId(int id) {
//        this.id = id;
//        return this;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public StudentBuilder setAge(String age) {
//        this.age = age;
//        return this;
//    }
//
//    public StudentBuilder setGender(String gender) {
//        this.gender = gender;
//        return this;
//    }
//
//    public StudentBuilder setGradYear(String gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public StudentBuilder setMajor(String major) {
//        this.major = major;
//        return this;
//    }
//
//    public Student build() {
//
//        if (name == null || name.isEmpty()) {
//            throw new IllegalArgumentException("Name is required");
//        }
//
//        return new Student(this);
//    }
//
//
//
//
//}
