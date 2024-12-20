package com.phms.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Appointment extends BaseBean{
    private Long id;
    private Long petId;
    private Long userId;
    private Long doctorId;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date appTime;
    private String info;
    private String phone;
    private String address;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appointment.create_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column appointment.status
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    private Integer status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.id
     *
     * @return the value of appointment.id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.id
     *
     * @param id the value for appointment.id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.pet_id
     *
     * @return the value of appointment.pet_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Long getPetId() {
        return petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.pet_id
     *
     * @param petId the value for appointment.pet_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setPetId(Long petId) {
        this.petId = petId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.user_id
     *
     * @return the value of appointment.user_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.user_id
     *
     * @param userId the value for appointment.user_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.doctor_id
     *
     * @return the value of appointment.doctor_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Long getDoctorId() {
        return doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.doctor_id
     *
     * @param doctorId the value for appointment.doctor_id
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.app_time
     *
     * @return the value of appointment.app_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Date getAppTime() {
        return appTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.app_time
     *
     * @param appTime the value for appointment.app_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setAppTime(Date appTime) {
        this.appTime = appTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.info
     *
     * @return the value of appointment.info
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public String getInfo() {
        return info;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.info
     *
     * @param info the value for appointment.info
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setInfo(String info) {
        this.info = info == null ? null : info.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.create_time
     *
     * @return the value of appointment.create_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.create_time
     *
     * @param createTime the value for appointment.create_time
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column appointment.status
     *
     * @return the value of appointment.status
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column appointment.status
     *
     * @param status the value for appointment.status
     *
     * @mbg.generated Mon Apr 06 17:03:33 CST 2020
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}