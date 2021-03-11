package mymap.item.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


public class MapNonmotorDto {

    private Long nonmotorId;


    private String nonmotorName;


    private String nonmotorAddress;


    private Integer nonmotorArea;


    private String nonmotorLaborCompany;


    private BigDecimal nonmotorLongitude;

    private BigDecimal nonmotorLlatitude;

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
     * @return nonmotor_longitude
     */
    public BigDecimal getNonmotorLongitude() {
        return nonmotorLongitude;
    }

    /**
     * @param nonmotorLongitude
     */
    public void setNonmotorLongitude(BigDecimal nonmotorLongitude) {
        this.nonmotorLongitude = nonmotorLongitude;
    }

    /**
     * @return nonmotor_llatitude
     */
    public BigDecimal getNonmotorLlatitude() {
        return nonmotorLlatitude;
    }

    /**
     * @param nonmotorLlatitude
     */
    public void setNonmotorLlatitude(BigDecimal nonmotorLlatitude) {
        this.nonmotorLlatitude = nonmotorLlatitude;
    }
}