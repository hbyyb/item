package mymap.item.service.impl;

import mymap.item.entity.MapNonmotor;
import mymap.item.entity.MapNonmotorExample;
import mymap.item.mapper.MapNonmotorMapper;
import mymap.item.service.MapNonmotorService;
import mymap.item.vo.MapNonmotorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class MapNonmotorServiceImpl implements MapNonmotorService {

    @Autowired
    MapNonmotorMapper mapNonmotorMapper;
    MapNonmotorExample mapNonmotorExample;

    @Override
    public int mapnonmotorinsert(MapNonmotor mapNonmotorVo) {
        return mapNonmotorMapper.insertSelective(mapNonmotorVo);
    }

    @Override
    public int mapnonmotordelete() {
        return 0;
    }

    @Override
    public int mapnonmotorundate() {
        return 0;
    }

    @Override
    public List<MapNonmotor> mapnonmotorselecet() {
//        return mapNonmotorMapper.selectByExample(mapNonmotorExample);
        return null;
    }

}
