package mymap.item.service;

import mymap.item.entity.MapNonmotor;
import mymap.item.vo.MapNonmotorVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface MapNonmotorService {
    int mapnonmotorinsert(MapNonmotor mapNonmotor);
    int mapnonmotordelete();
    int mapnonmotorundate();
    List<MapNonmotor> mapnonmotorselecet();

}
