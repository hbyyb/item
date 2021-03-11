package mymap.item.mapper;

import java.util.List;
import mymap.item.entity.MapNonmotor;
import mymap.item.entity.MapNonmotorExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;
public interface MapNonmotorMapper extends Mapper<MapNonmotor> {
    long countByExample(MapNonmotorExample example);

    int deleteByExample(MapNonmotorExample example);

    List<MapNonmotor> selectByExample(MapNonmotorExample example);

    int updateByExampleSelective(@Param("record") MapNonmotor record, @Param("example") MapNonmotorExample example);

    int updateByExample(@Param("record") MapNonmotor record, @Param("example") MapNonmotorExample example);
}