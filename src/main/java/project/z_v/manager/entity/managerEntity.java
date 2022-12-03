package project.z_v.manager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;

 @Table(name = "manager")
 @Entity
 @Getter
 @Setter
 public class managerEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY) //Hospital_number 자동으로 생성
        private Long Hospital_number;

        private String Hosptial_name;

        @Column
        private String Hospital_address;

        @Column
        private String Tell;

        @Column
        private String site;

        @Column
        private boolean Shop_number;

        @Column
        private boolean aDay;

        @Column
        private String TimeMon;

        @Column
        private String TimeTues;

        @Column
        private String TimeWednes;

        @Column
        private String TimeThurs;

        @Column
        private String TimeFri;

        @Column
        private String TimeSatur;

        @Column
        private String TimeSun;

        @Column
        private String areaAddress;

        @Column
        private String image_information;

        @Column
        private double locationLatitude;
        @Column
        private double locationlongitude;
        public managerEntity(Long hospital_number, String hosptial_name, String hospital_address, String tell, String site, boolean shop_number, boolean aDay, String timeMon, String timeTues, String timeWednes, String timeThurs, String timeFri, String timeSatur, String timeSun, String areaAddress, String image_information) {

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
            this.locationLatitude = locationLatitude;
            this.locationlongitude = locationlongitude;
        }


        public managerEntity() {
        }


    }

