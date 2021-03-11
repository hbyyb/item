package mymap.item.mapper;

import java.util.List;
import mymap.item.entity.MapOnroad;
import mymap.item.entity.MapOnroadExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MapOnroadMapper extends Mapper<MapOnroad> {
    long countByExample(MapOnroadExample example);

    int deleteByExample(MapOnroadExample example);

    List<MapOnroad> selectByExample(MapOnroadExample example);

    int updateByExampleSelective(@Param("record") MapOnroad record, @Param("example") MapOnroadExample example);

    int updateByExample(@Param("record") MapOnroad record, @Param("example") MapOnroadExample example);
}