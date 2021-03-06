package com.imufe.ws.pojo;



import java.util.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;
    private Integer role;
    private Date create_time;
    private Date update_time;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public Integer getRole() {
        return role;
    }
    public void setRole(Integer role) {
        this.role = role;
    }
    public Date getCreate_time() {
        return create_time;
    }
    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
    public Date getUpdate_time() {
        return update_time;
    }
    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
    
    
//    `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户表id',
//    `username` varchar(50) NOT NULL COMMENT '用户名',
//    `password` varchar(50) NOT NULL COMMENT '用户密码，MD5加密',
//    `email` varchar(50) DEFAULT NULL,
//    `phone` varchar(20) DEFAULT NULL,
//    `question` varchar(100) DEFAULT NULL COMMENT '找回密码问题',
//    `answer` varchar(100) DEFAULT NULL COMMENT '找回密码答案',
//    `role` int(4) NOT NULL COMMENT '角色0-管理员,1-普通用户',
//    `create_time` datetime NOT NULL COMMENT '创建时间',
//    `update_time` datetime NOT NULL COMMENT '最后一次更新时间',
    

}