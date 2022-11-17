package project.z_v.ListDB;

import net.bytebuddy.asm.Advice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class List {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long Hospital_number;

    private String Hospital_name;

    private String Hospital_address;

    private Time operation_Time;

    private Long tell;

    private Long site;

    private Boolean shop;

    private Boolean hours;

    private String Area_address;

    // private 이미지 부분

    private Long map;

    private String hospital_Area;

    public List() {}

    public List(String hospital_name, String hospital_address, Time operation_Time, Long tell, Long site, Boolean shop, Boolean hours, String area_address, Long map, String hospital_Area) {
        Hospital_name = hospital_name;
        Hospital_address = hospital_address;
        this.operation_Time = operation_Time;
        this.tell = tell;
        this.site = site;
        this.shop = shop;
        this.hours = hours;
        Area_address = area_address;
        this.map = map;
        this.hospital_Area = hospital_Area;
    }

    public Long getHospital_number() {
        return Hospital_number;
    }

    public void setHospital_number(Long hospital_number) {
        Hospital_number = hospital_number;
    }

    public String getHospital_name() {
        return Hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        Hospital_name = hospital_name;
    }

    public String getHospital_address() {
        return Hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        Hospital_address = hospital_address;
    }

    public Time getOperation_Time() {
        return operation_Time;
    }

    public void setOperation_Time(Time operation_Time) {
        this.operation_Time = operation_Time;
    }

    public Long getTell() {
        return tell;
    }

    public void setTell(Long tell) {
        this.tell = tell;
    }

    public Long getSite() {
        return site;
    }

    public void setSite(Long site) {
        this.site = site;
    }

    public Boolean getShop() {
        return shop;
    }

    public void setShop(Boolean shop) {
        this.shop = shop;
    }

    public Boolean getHours() {
        return hours;
    }

    public void setHours(Boolean hours) {
        this.hours = hours;
    }

    public String getArea_address() {
        return Area_address;
    }

    public void setArea_address(String area_address) {
        Area_address = area_address;
    }

    public Long getMap() {
        return map;
    }

    public void setMap(Long map) {
        this.map = map;
    }

    public String getHospital_Area() {
        return hospital_Area;
    }

    public void setHospital_Area(String hospital_Area) {
        this.hospital_Area = hospital_Area;
    }

}
