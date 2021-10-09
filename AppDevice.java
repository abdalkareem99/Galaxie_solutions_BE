package application.Devices.Devices.mydevice;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class AppDevice {
    @Id
    @SequenceGenerator(
            name = "appdevice_sequence",
            sequenceName = "appdevice_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "appdevice_sequence"
    )

    private Long id;
    private Boolean status;
    //private Long id;
    private Long deviceNo;
    private String solutionName;
    private String solutionType;
    private String city;
    private String description;
    private String imgUrl;
    private String version;
    private String createdOn;
    private String createdBy;
    @Transient
    private LocalDate dofc;

    public AppDevice(){}

    public AppDevice(Boolean status,Long id,Long deviceNo,
                    String solutionName,
                  String solutionType,
                  String city, String description,
                  String imgUrl, String version,String createdOn,String createdBy,LocalDate dofc) {

        this.status=status;
        this.id=id;
        this.deviceNo=deviceNo;
        this.solutionName = solutionName;
        this.solutionType = solutionType;
        this.city = city;
        this.description = description;
        this.imgUrl = imgUrl;
        this.version = version;
        this.createdOn=createdOn;
        this.createdBy=createdBy;
        this.dofc=dofc;

    }

    public AppDevice(Boolean status,Long deviceNo,String solutionName,
                     String solutionType,
                     String city, String description,
                     String imgUrl, String version ,String createdOn,String createdBy,LocalDate dofc) {
        this.status=status;
        this.deviceNo=deviceNo;
        this.solutionName = solutionName;
        this.solutionType = solutionType;
        this.city = city;
        this.description = description;
        this.imgUrl = imgUrl;
        this.version = version;
        this.createdOn=createdOn;
        this.createdBy=createdBy;
        this.dofc=dofc;

    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(Long deviceNo) {
        this.deviceNo = deviceNo;
    }

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}


   /* public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id =id;

    }*/
    public String getSolutionName(){
        return solutionName;
    }

    public void setSolutionName(String solutionName) {
        this.solutionName = solutionName;
    }

    public String getSolutionType() {
        return solutionType;
    }

    public void setSolutionType(String solutionType) {
        this.solutionType = solutionType;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDate getDofc(){return dofc;}
    public void setDofc(LocalDate dofc){this.dofc=dofc;}

    public String toString(){
        return "Device{"+
                "id=" + id +
                ", name='" + solutionName + '\'' +
                ", city='" + city + '\'' +
                ", type'" + solutionType + '\'' +
                ", imgUrl"+imgUrl + '\'' +
                ", creationON" + createdOn + '\'' +
                ",version" + version + '\''+
                ",status" + status + '\''+
                '}';



    }



}
