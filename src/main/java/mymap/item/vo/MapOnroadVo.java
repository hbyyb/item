package mymap.item.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "map_onroad")
public class MapOnroadVo {
    @Id
    @Column(name = "onroad_id")
    private Long onroadId;

    /**
     * 路段名称
     */
    @Column(name = "onroad_name")
    private String onroadName;

    /**
     * 泊位数量
     */
    @Column(name = "onroad_number")
    private Integer onroadNumber;

    /**
     * 路段地址
     */
    @Column(name = "onroad_address")
    private String onroadAddress;

    /**
     * 收费规则
     */
    @Column(name = "onroad_rules")
    private String onroadRules;

    /**
     * 泊位类型
     */
    @Column(name = "onroad_type")
    private String onroadType;

    @Column(name = "onroad_longitude")
    private BigDecimal onroadLongitude;

    @Column(name = "onroad_llatitude")
    private BigDecimal onroadLlatitude;

    /**
     * @return onroad_id
     */
    public Long getOnroadId() {
        return onroadId;
    }

    /**
     * @param onroadId
     */
    public void setOnroadId(Long onroadId) {
        this.onroadId = onroadId;
    }

    /**
     * 获取路段名称
     *
     * @return onroad_name - 路段名称
     */
    public String getOnroadName() {
        return onroadName;
    }

    /**
     * 设置路段名称
     *
     * @param onroadName 路段名称
     */
    public void setOnroadName(String onroadName) {
        this.onroadName = onroadName;
    }

    /**
     * 获取泊位数量
     *
     * @return onroad_number - 泊位数量
     */
    public Integer getOnroadNumber() {
        return onroadNumber;
    }

    /**
     * 设置泊位数量
     *
     * @param onroadNumber 泊位数量
     */
    public void setOnroadNumber(Integer onroadNumber) {
        this.onroadNumber = onroadNumber;
    }

    /**
     * 获取路段地址
     *
     * @return onroad_address - 路段地址
     */
    public String getOnroadAddress() {
        return onroadAddress;
    }

    /**
     * 设置路段地址
     *
     * @param onroadAddress 路段地址
     */
    public void setOnroadAddress(String onroadAddress) {
        this.onroadAddress = onroadAddress;
    }

    /**
     * 获取收费规则
     *
     * @return onroad_rules - 收费规则
     */
    public String getOnroadRules() {
        return onroadRules;
    }

    /**
     * 设置收费规则
     *
     * @param onroadRules 收费规则
     */
    public void setOnroadRules(String onroadRules) {
        this.onroadRules = onroadRules;
    }

    /**
     * 获取泊位类型
     *
     * @return onroad_type - 泊位类型
     */
    public String getOnroadType() {
        return onroadType;
    }

    /**
     * 设置泊位类型
     *
     * @param onroadType 泊位类型
     */
    public void setOnroadType(String onroadType) {
        this.onroadType = onroadType;
    }

    /**
     * @return onroad_longitude
     */
    public BigDecimal getOnroadLongitude() {
        return onroadLongitude;
    }

    /**
     * @param onroadLongitude
     */
    public void setOnroadLongitude(BigDecimal onroadLongitude) {
        this.onroadLongitude = onroadLongitude;
    }

    /**
     * @return onroad_llatitude
     */
    public BigDecimal getOnroadLlatitude() {
        return onroadLlatitude;
    }

    /**
     * @param onroadLlatitude
     */
    public void setOnroadLlatitude(BigDecimal onroadLlatitude) {
        this.onroadLlatitude = onroadLlatitude;
    }
}