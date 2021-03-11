package mymap.item.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;


public class MapPublicpakDto {

    private Long publicparkId;

    private String publicparkName;


    private String publicparkAddress;


    private Date publicparkArea;


    private Integer publicparkLaborCompany;


    private BigDecimal publicparkLongitude;


    private BigDecimal publicparkLlatitude;

    /**
     * @return publicpark_id
     */
    public Long getPublicparkId() {
        return publicparkId;
    }

    /**
     * @param publicparkId
     */
    public void setPublicparkId(Long publicparkId) {
        this.publicparkId = publicparkId;
    }

    /**
     * @return publicpark_name
     */
    public String getPublicparkName() {
        return publicparkName;
    }

    /**
     * @param publicparkName
     */
    public void setPublicparkName(String publicparkName) {
        this.publicparkName = publicparkName;
    }

    /**
     * @return publicpark_address
     */
    public String getPublicparkAddress() {
        return publicparkAddress;
    }

    /**
     * @param publicparkAddress
     */
    public void setPublicparkAddress(String publicparkAddress) {
        this.publicparkAddress = publicparkAddress;
    }

    /**
     * @return publicpark_area
     */
    public Date getPublicparkArea() {
        return publicparkArea;
    }

    /**
     * @param publicparkArea
     */
    public void setPublicparkArea(Date publicparkArea) {
        this.publicparkArea = publicparkArea;
    }

    /**
     * @return publicpark_labor_company
     */
    public Integer getPublicparkLaborCompany() {
        return publicparkLaborCompany;
    }

    /**
     * @param publicparkLaborCompany
     */
    public void setPublicparkLaborCompany(Integer publicparkLaborCompany) {
        this.publicparkLaborCompany = publicparkLaborCompany;
    }

    /**
     * @return publicpark_longitude
     */
    public BigDecimal getPublicparkLongitude() {
        return publicparkLongitude;
    }

    /**
     * @param publicparkLongitude
     */
    public void setPublicparkLongitude(BigDecimal publicparkLongitude) {
        this.publicparkLongitude = publicparkLongitude;
    }

    /**
     * @return publicpark_llatitude
     */
    public BigDecimal getPublicparkLlatitude() {
        return publicparkLlatitude;
    }

    /**
     * @param publicparkLlatitude
     */
    public void setPublicparkLlatitude(BigDecimal publicparkLlatitude) {
        this.publicparkLlatitude = publicparkLlatitude;
    }
}