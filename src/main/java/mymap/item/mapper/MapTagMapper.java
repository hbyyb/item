package mymap.item.mapper;

import java.util.List;
import mymap.item.entity.MapTag;
import mymap.item.entity.MapTagExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MapTagMapper extends Mapper<MapTag> {
    long countByExample(MapTagExample example);

    int deleteByExample(MapTagExample example);

    List<MapTag> selectByExample(MapTagExample example);

    int updateByExampleSelective(@Param("record") MapTag record, @Param("example") MapTagExample example);

    int updateByExample(@Param("record") MapTag record, @Param("example") MapTagExample example);
}