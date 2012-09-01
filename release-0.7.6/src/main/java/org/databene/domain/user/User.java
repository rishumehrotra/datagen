/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.databene.domain.user;

import java.util.Date;
import java.util.List;
import org.databene.domain.address.PostalCode;
import org.databene.domain.person.Gender;

/**
 *
 * @author rishu.mehrotra
 */
public class User {
    
    protected String uidType;
    protected String uid;
    protected List<String> uids;
    protected Integer age;
    protected Gender gender;
    protected String uLocation;
    protected List<String> interests;
    protected PostalCode postalCode;
    protected Integer area;
    protected Date birthDate;
    protected Integer income;
    protected String education;
    protected String ethnicity;
    protected UserHygiene userHygiene;

    
    public User(String uidType, String uid, String uids, Integer age, Gender gender, String uLocation, String interests, PostalCode postalCode, Integer area, Date birthDate, Integer income, String education, String ethnicity, UserHygiene userHygiene) {
        this.uidType = uidType;
        this.uid = uid;
        this.uids = uids;
        this.age = age;
        this.gender = gender;
        this.uLocation = uLocation;
        this.interests = interests;
        this.postalCode = postalCode;
        this.area = area;
        this.birthDate = birthDate;
        this.income = income;
        this.education = education;
        this.ethnicity = ethnicity;
        this.userHygiene = userHygiene;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public PostalCode getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(PostalCode postalCode) {
        this.postalCode = postalCode;
    }

    public String getuLocation() {
        return uLocation;
    }

    public void setuLocation(String uLocation) {
        this.uLocation = uLocation;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUidType() {
        return uidType;
    }

    public void setUidType(String uidType) {
        this.uidType = uidType;
    }

    public String getUids() {
        return uids;
    }

    public void setUids(String uids) {
        this.uids = uids;
    }

    public UserHygiene getUserHygiene() {
        return userHygiene;
    }

    public void setUserHygiene(UserHygiene userHygiene) {
        this.userHygiene = userHygiene;
    }

    @Override
    public String toString() {
        return "User{" + "uidType=" + uidType + ", uid=" + uid + ", uids=" + uids + ", age=" + age + ", gender=" + gender + ", uLocation=" + uLocation + ", interests=" + interests + ", postalCode=" + postalCode + ", area=" + area + ", birthDate=" + birthDate + ", income=" + income + ", education=" + education + ", ethnicity=" + ethnicity + ", userHygiene=" + userHygiene + '}';
    }
 
}
