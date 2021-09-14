package _case_study.model;

import java.io.Serializable;
import java.time.LocalDate;

 public abstract class Person  {
 private String name;
 private String dateOfBirth;
 private String gender;
 private String idCard;
 private String phoneNumber;
 private String email;
 private String address;

 public Person(String name, String dateOfBirth, String gender, String idCard, String phoneNumber, String email, String address) {
  this.name = name;
  this.dateOfBirth = dateOfBirth;
  this.gender = gender;
  this.idCard = idCard;
  this.phoneNumber = phoneNumber;
  this.email = email;
  this.address = address;
 }

 public Person() {
 }

 public String getDateOfBirth() {
  return dateOfBirth;
 }

 public void setDateOfBirth(String dateOfBirth) {
  this.dateOfBirth = dateOfBirth;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }



 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public String getIdCard() {
  return idCard;
 }

 public void setIdCard(String idCard) {
  this.idCard = idCard;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 @Override
 public String toString() {
  return "Person{" +
          "name='" + name + '\'' +
          ", dateOfBirth='" + dateOfBirth + '\'' +
          ", gender='" + gender + '\'' +
          ", idCard='" + idCard + '\'' +
          ", phoneNumber='" + phoneNumber + '\'' +
          ", email='" + email + '\'' +
          ", address='" + address + '\'' +
          '}';
 }

 public String getPersonString() {
  return this.getName()+","+this.getDateOfBirth()+","+this.getGender()+","+this.getIdCard()+","+this.getPhoneNumber()+","+this.getEmail()+","+this.getAddress();
 }
}
