package com.example.demo.bean;

import java.util.Date;
import java.util.List;

public class Classes {


    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.id
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.name
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.createtime
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    private Date createtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column classes.memo
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    private String memo;


    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.id
     *
     * @return the value of classes.id
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.id
     *
     * @param id the value for classes.id
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.name
     *
     * @return the value of classes.name
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.name
     *
     * @param name the value for classes.name
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.createtime
     *
     * @return the value of classes.createtime
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.createtime
     *
     * @param createtime the value for classes.createtime
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column classes.memo
     *
     * @return the value of classes.memo
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public String getMemo() {
        return memo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column classes.memo
     *
     * @param memo the value for classes.memo
     *
     * @mbg.generated Tue Nov 12 14:43:29 CST 2024
     */
    public void setMemo(String memo) {
        this.memo = memo;
    }
}