package mymap.item.mapper;

import java.util.List;
import mymap.item.entity.MapPublicpak;
import mymap.item.entity.MapPublicpakExample;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MapPublicpakMapper extends Mapper<MapPublicpak> {
    long countByExample(MapPublicpakExample example);

    int deleteByExample(MapPublicpakExample example);

    List<MapPublicpak> selectByExample(MapPublicpakExample example);

    int updateByExampleSelective(@Param("record") MapPublicpak record, @Param("example") MapPublicpakExample example);

    int updateByExample(@Param("record") MapPublicpak record, @Param("example") MapPublicpakExample example);
}