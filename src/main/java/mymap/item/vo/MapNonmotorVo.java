package mymap.item.vo;

import lombok.Data;
import java.math.BigDecimal;

public class MapNonmotorVo {
    private Long nonmotorId;

    private String nonmotorName;


    private String nonmotorAddress;


    private Integer nonmotorArea;

    private String nonmotorLaborCompany;


    private BigDecimal nonmotorLng;

    public Long getNonmotorId() {
        return nonmotorId;
    }

    public void setNonmotorId(Long nonmotorId) {
        this.nonmotorId = nonmotorId;
    }

    private BigDecimal nonmotorLat;

    public String getNonmotorName() {
        return nonmotorName;
    }

    public void setNonmotorName(String nonmotorName) {
        this.nonmotorName = nonmotorName;
    }

    public String getNonmotorAddress() {
        return nonmotorAddress;
    }

    public void setNonmotorAddress(String nonmotorAddress) {
        this.nonmotorAddress = nonmotorAddress;
    }

    public Integer getNonmotorArea() {
        return nonmotorArea;
    }

    public void setNonmotorArea(Integer nonmotorArea) {
        this.nonmotorArea = nonmotorArea;
    }

    public String getNonmotorLaborCompany() {
        return nonmotorLaborCompany;
    }

    public void setNonmotorLaborCompany(String nonmotorLaborCompany) {
        this.nonmotorLaborCompany = nonmotorLaborCompany;
    }

    public BigDecimal getNonmotorLng() {
        return nonmotorLng;
    }

    public void setNonmotorLng(BigDecimal nonmotorLng) {
        this.nonmotorLng = nonmotorLng;
    }

    public BigDecimal getNonmotorLat() {
        return nonmotorLat;
    }

    public void setNonmotorLat(BigDecimal nonmotorLat) {
        this.nonmotorLat = nonmotorLat;
    }
}