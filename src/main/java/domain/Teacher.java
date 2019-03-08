package domain;

/**
 * Created by 张瑞 on 2019/3/4.
 */
public class Teacher extends Person{

    private String name;
    private String sex;
    private String course;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void teaching(){
        System.out.println("我教书");
    }
}
