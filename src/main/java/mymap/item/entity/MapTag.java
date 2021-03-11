package mymap.item.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "map_tag")
public class MapTag {
    @Id
    @Column(name = "tag_id")
    private Long tagId;

    @Column(name = "tag_name")
    private String tagName;

    @Column(name = "tag_address")
    private String tagAddress;

    @Column(name = "tag_rules")
    private String tagRules;

    @Column(name = "tag_lng")
    private BigDecimal tagLng;

    @Column(name = "tag_lat")
    private BigDecimal tagLat;

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
     * @return tag_lng
     */
    public BigDecimal getTagLng() {
        return tagLng;
    }

    /**
     * @param tagLng
     */
    public void setTagLng(BigDecimal tagLng) {
        this.tagLng = tagLng;
    }

    /**
     * @return tag_lat
     */
    public BigDecimal getTagLat() {
        return tagLat;
    }

    /**
     * @param tagLat
     */
    public void setTagLat(BigDecimal tagLat) {
        this.tagLat = tagLat;
    }
}