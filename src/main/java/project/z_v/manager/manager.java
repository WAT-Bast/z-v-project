package project.z_v.manager;

import javax.persistence.*;
@Entity
public class manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Hospital_number 자동으로 생성
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

    private String areaAddress;

    private String image_information;

    public manager() {}

    public manager(Long hospital_number, String hosptial_name, String hospital_address, String tell, String site, boolean shop_number, boolean aDay, String timeMon, String timeTues, String timeWednes, String timeThurs, String timeFri, String timeSatur, String timeSun, String areaAddress, String image_information) {
        Hospital_number = hospital_number;
        Hosptial_name = hosptial_name;
        Hospital_address = hospital_address;
        Tell = tell;
        this.site = site;
        Shop_number = shop_number;
        this.aDay = aDay;
        TimeMon = timeMon;
        TimeTues = timeTues;
        TimeWednes = timeWednes;
        TimeThurs = timeThurs;
        TimeFri = timeFri;
        TimeSatur = timeSatur;
        TimeSun = timeSun;
        this.areaAddress = areaAddress;
        this.image_information = image_information;
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
