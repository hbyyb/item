package mymap.item.dto;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;


public class MapTagDto {

    private Long tagId;


    private String tagName;


    private String tagAddress;


    private String tagRules;


    private BigDecimal tagLongitude;

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