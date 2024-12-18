package com.phms.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Pet extends BaseBean{

    private Long id;
    private Long userId;
    private String name;
    private Double weight;
    private Double height;
    private String type;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date birthday;
    private String img;
    private Date createTime;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public Double getWeight() {
        return weight;
    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.height
     *
     * @return the value of pet.height
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Double getHeight() {
        return height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.height
     *
     * @param height the value for pet.height
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.type
     *
     * @return the value of pet.type
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.type
     *
     * @param type the value for pet.type
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.birthday
     *
     * @return the value of pet.birthday
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.birthday
     *
     * @param birthday the value for pet.birthday
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.img
     *
     * @return the value of pet.img
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public String getImg() {
        return img;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.img
     *
     * @param img the value for pet.img
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pet.create_time
     *
     * @return the value of pet.create_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pet.create_time
     *
     * @param createTime the value for pet.create_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}