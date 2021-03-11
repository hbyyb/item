package mymap.item.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "map_publicpak")
public class MapPublicpakVo {
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

    @Column(name = "publicpark_longitude")
    private BigDecimal publicparkLongitude;

    @Column(name = "publicpark_llatitude")
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