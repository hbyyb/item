package mymap.item.service.impl;

import mymap.item.entity.MapTag;
import mymap.item.entity.MapTagExample;
import mymap.item.mapper.MapTagMapper;
import mymap.item.service.MapTagService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MapTagServiceImpl implements MapTagService {
    @Resource
    MapTagMapper mapTagMapper;
    MapTagExample mapTagExample;

    @Override
    public int maptaginsert() {
        return 0;
    }

    @Override
    public int maptagdelete() {
        return 0;
    }

    @Override
    public int maptagundate() {
        return 0;
    }

    @Override
    public List<MapTag> maptagselecet() {
        return null;
    }
}
