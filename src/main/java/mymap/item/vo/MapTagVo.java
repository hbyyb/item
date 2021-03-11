package mymap.item.vo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "map_tag")
public class MapTagVo {
    @Id
    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_address")
    private String tagAddress;

    @Column(name = "tag_rules")
    private String tagRules;

    @Column(name = "tag_longitude")
    private BigDecimal tagLongitude;

    @Column(name = "tag_llatitude")
    private BigDecimal tagLlatitude;

    /**
     * @return tag_id
     */
    public Long getTagId() {
        return tagId;
    }

    /**
     * @param tagId
     */
    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    /**
     * @return tag_name
     */
    public String getTagName() {
        return tagName;
    }

    /**
     * @param tagName
     */
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    /**
     * @return tag_address
     */
    public String getTagAddress() {
        return tagAddress;
    }

    /**
     * @param tagAddress
     */
    public void setTagAddress(String tagAddress) {
        this.tagAddress = tagAddress;
    }

    /**
     * @return tag_rules
     */
    public String getTagRules() {
        return tagRules;
    }

    /**
     * @param tagRules
     */
    public void setTagRules(String tagRules) {
        this.tagRules = tagRules;
    }

    /**
     * @return tag_longitude
     */
    public BigDecimal getTagLongitude() {
        return tagLongitude;
    }

    /**
     * @param tagLongitude
     */
    public void setTagLongitude(BigDecimal tagLongitude) {
        this.tagLongitude = tagLongitude;
    }

    /**
     * @return tag_llatitude
     */
    public BigDecimal getTagLlatitude() {
        return tagLlatitude;
    }

    /**
     * @param tagLlatitude
     */
    public void setTagLlatitude(BigDecimal tagLlatitude) {
        this.tagLlatitude = tagLlatitude;
    }
}