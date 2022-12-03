package project.z_v.manager.dto;

import lombok.Getter;
import lombok.Setter;
import project.z_v.manager.entity.managerEntity;

@Getter
@Setter
public class managerDto {
    private Long Hospital_number;

    private String Hosptial_name;

    private String Hospital_address;

    private String Tell;

    private String site;

    private boolean Shop_number;

    private boolean aDay;

    private String TimeMon;

    private String TimeTues;

    private String TimeWednes;

    private String TimeThurs;

    private String TimeFri;

    private String TimeSatur;

    private String TimeSun;

    private String representativeAddress;

    private String areaAddress;

    private String image_information;

    private double locationLatitude;

    private double locationlongitude;

    public managerEntity toManagerEntity() {
        return new managerEntity(Hospital_number, Hosptial_name, Hospital_address, Tell, site, Shop_number,
                aDay, TimeMon, TimeTues, TimeWednes, TimeThurs, TimeFri, TimeSatur, TimeSun, representativeAddress+areaAddress, image_information,locationLatitude,locationlongitude);
    }

    public void updateManager(managerEntity managerEntity) {
        managerEntity.setADay(aDay);
        managerEntity.setAreaAddress(areaAddress);
        managerEntity.setHospital_address(getHospital_address());
        managerEntity.setHosptial_name(getHosptial_name());
        managerEntity.setImage_information(image_information);
        managerEntity.setTell(getTell());
        managerEntity.setLocationlongitude(locationlongitude);
        managerEntity.setLocationLatitude(locationLatitude);
        managerEntity.setShop_number(Shop_number);
        managerEntity.setTimeFri(TimeFri);
        managerEntity.setTimeMon(TimeMon);
        managerEntity.setTimeTues(TimeTues);
        managerEntity.setTimeWednes(TimeWednes);
        managerEntity.setTimeThurs(TimeThurs);
        managerEntity.setTimeSatur(TimeSatur);
        managerEntity.setTimeSun(TimeSun);
        managerEntity.setSite(site);

    }



    public double getLocationLatitude() {
        return locationLatitude;
    }

    public void setLocationLatitude(double locationLatitude) {
        this.locationLatitude = locationLatitude;
    }

    public double getLocationlongitude() {
        return locationlongitude;
    }

    public void setLocationlongitude(double locationlongitude) {
        this.locationlongitude = locationlongitude;

    }

    public Long getHospital_number() {
        return Hospital_number;
    }

    public void setHospital_number(Long hospital_number) {
        Hospital_number = hospital_number;
    }

    public String getHosptial_name() {
        return Hosptial_name;
    }

    public void setHosptial_name(String hosptial_name) {
        Hosptial_name = hosptial_name;
    }

    public String getHospital_address() {
        return Hospital_address;
    }

    public void setHospital_address(String hospital_address) {
        Hospital_address = hospital_address;
    }

    public String getTell() {
        return Tell;
    }

    public void setTell(String tell) {
        Tell = tell;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public boolean isShop_number() {
        return Shop_number;
    }

    public void setShop_number(boolean shop_number) {
        Shop_number = shop_number;
    }

    public boolean isaDay() {
        return aDay;
    }

    public void setaDay(boolean aDay) {
        this.aDay = aDay;
    }

    public String getTimeMon() {
        return TimeMon;
    }

    public void setTimeMon(String timeMon) {
        TimeMon = timeMon;
    }

    public String getTimeTues() {
        return TimeTues;
    }

    public void setTimeTues(String timeTues) {
        TimeTues = timeTues;
    }

    public String getTimeWednes() {
        return TimeWednes;
    }

    public void setTimeWednes(String timeWednes) {
        TimeWednes = timeWednes;
    }

    public String getTimeThurs() {
        return TimeThurs;
    }

    public void setTimeThurs(String timeThurs) {
        TimeThurs = timeThurs;
    }

    public String getTimeFri() {
        return TimeFri;
    }

    public void setTimeFri(String timeFri) {
        TimeFri = timeFri;
    }

    public String getTimeSatur() {
        return TimeSatur;
    }

    public void setTimeSatur(String timeSatur) {
        TimeSatur = timeSatur;
    }

    public String getTimeSun() {
        return TimeSun;
    }

    public void setTimeSun(String timeSun) {
        TimeSun = timeSun;
    }

    public String getAreaAddress() {
        return areaAddress;
    }

    public void setAreaAddress(String areaAddress) {
        this.areaAddress = areaAddress;
    }

    public String getImage_information() {
        return image_information;
    }

    public void setImage_information(String image_information) {
        this.image_information = image_information;
    }






}
