package mymap.item.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "map_publicpak")
public class MapPublicpak {
    @Id
    @Column(name = "publicpark_id")
    private Long publicparkId;

    @Column(name = "publicpark_name")
    private String publicparkName;

    @Column(name = "publicpark_address")
    private String publicparkAddress;

    @Column(name = "publicpark_area")
    private Date publicparkArea;

    @Column(name = "publicpark_labor_company")
    private Integer publicparkLaborCompany;

    @Column(name = "publicpark_lng")
    private BigDecimal publicparkLng;

    @Column(name = "publicpark_lat")
    private BigDecimal publicparkLat;

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
     * @return publicpark_lng
     */
    public BigDecimal getPublicparkLng() {
        return publicparkLng;
    }

    /**
     * @param publicparkLng
     */
    public void setPublicparkLng(BigDecimal publicparkLng) {
        this.publicparkLng = publicparkLng;
    }

    /**
     * @return publicpark_lat
     */
    public BigDecimal getPublicparkLat() {
        return publicparkLat;
    }

    /**
     * @param publicparkLat
     */
    public void setPublicparkLat(BigDecimal publicparkLat) {
        this.publicparkLat = publicparkLat;
    }
}