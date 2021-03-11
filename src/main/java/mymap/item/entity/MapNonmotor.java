package mymap.item.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "map_nonmotor")
public class MapNonmotor {
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "nonmotor_id")
    private Long nonmotorId;

    @Column(name = "nonmotor_name")
    private String nonmotorName;

    @Column(name = "nonmotor_address")
    private String nonmotorAddress;

    @Column(name = "nonmotor_area")
    private Integer nonmotorArea;

    @Column(name = "nonmotor_labor_company")
    private String nonmotorLaborCompany;

    @Column(name = "nonmotor_lng")
    private BigDecimal nonmotorLng;

    @Column(name = "nonmotor_lat")
    private BigDecimal nonmotorLat;

    /**
     * @return nonmotor_id
     */
    public Long getNonmotorId() {
        return nonmotorId;
    }

    /**
     * @param nonmotorId
     */
    public void setNonmotorId(Long nonmotorId) {
        this.nonmotorId = nonmotorId;
    }

    /**
     * @return nonmotor_name
     */
    public String getNonmotorName() {
        return nonmotorName;
    }

    /**
     * @param nonmotorName
     */
    public void setNonmotorName(String nonmotorName) {
        this.nonmotorName = nonmotorName;
    }

    /**
     * @return nonmotor_address
     */
    public String getNonmotorAddress() {
        return nonmotorAddress;
    }

    /**
     * @param nonmotorAddress
     */
    public void setNonmotorAddress(String nonmotorAddress) {
        this.nonmotorAddress = nonmotorAddress;
    }

    /**
     * @return nonmotor_area
     */
    public Integer getNonmotorArea() {
        return nonmotorArea;
    }

    /**
     * @param nonmotorArea
     */
    public void setNonmotorArea(Integer nonmotorArea) {
        this.nonmotorArea = nonmotorArea;
    }

    /**
     * @return nonmotor_labor_company
     */
    public String getNonmotorLaborCompany() {
        return nonmotorLaborCompany;
    }

    /**
     * @param nonmotorLaborCompany
     */
    public void setNonmotorLaborCompany(String nonmotorLaborCompany) {
        this.nonmotorLaborCompany = nonmotorLaborCompany;
    }

    /**
     * @return nonmotor_lng
     */
    public BigDecimal getNonmotorLng() {
        return nonmotorLng;
    }

    /**
     * @param nonmotorLng
     */
    public void setNonmotorLng(BigDecimal nonmotorLng) {
        this.nonmotorLng = nonmotorLng;
    }

    /**
     * @return nonmotor_lat
     */
    public BigDecimal getNonmotorLat() {
        return nonmotorLat;
    }

    /**
     * @param nonmotorLat
     */
    public void setNonmotorLat(BigDecimal nonmotorLat) {
        this.nonmotorLat = nonmotorLat;
    }
}