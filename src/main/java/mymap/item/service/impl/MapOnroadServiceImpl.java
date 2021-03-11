package mymap.item.service.impl;

import mymap.item.entity.MapOnroad;
import mymap.item.entity.MapOnroadExample;
import mymap.item.mapper.MapOnroadMapper;
import mymap.item.service.MapOnroadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MapOnroadServiceImpl implements MapOnroadService {

    @Resource
MapOnroadMapper mapOnroadMapper;
    MapOnroadExample mapOnroadExample;
    @Override
    public int maponroadinsert() {
        return 0;
    }

    @Override
    public int maponroaddelete() {
        return 0;
    }

    @Override
    public int maponroadundate() {
        return 0;
    }

    @Override
    public List<MapOnroad> maponroadselecet() {
        return null;
    }
}
