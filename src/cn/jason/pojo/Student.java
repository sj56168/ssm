package cn.jason.pojo;

/**
 * Created by 我不管我最帅 on 2018/10/31.
 */
public class Student {
    private Integer id;
    private String stuName;
    private String email;
    public Student() {
    }

    public Student(Integer id, String stuName) {
        this.id = id;
        this.stuName = stuName;
    }

    public Student(Integer id, String stuName, String email) {
        this.id = id;
        this.stuName = stuName;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                  "id=" + id +
                  ", stuName='" + stuName + '\'' +
                  ", email='" + email + '\'' +
                  '}';
    }
}
