package com.deeparora.fp;

/**
 * Created by Waheguru on 10/14/2017.
 */

public class User {

    int id;
    String name;
    String email;
    String  password;
    String reenter;
    String address;
    String gender;
    int phone_no;
    String city;
    int zip_code;


    public User(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getReenter() {
        return reenter;
    }

    public void setReenter(String reenter) {
        this.reenter = reenter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip_code() {
        return zip_code;
    }

    public void setZip_code(int zip_code) {
        this.zip_code = zip_code;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", reenter='" + reenter + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                ", phone_no=" + phone_no +
                ", city='" + city + '\'' +
                ", zip_code=" + zip_code +
                '}';
    }
}
