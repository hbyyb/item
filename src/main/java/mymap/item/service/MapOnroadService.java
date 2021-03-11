package mymap.item.service;

import mymap.item.entity.MapOnroad;

import java.util.List;

public interface MapOnroadService {
    int maponroadinsert();
    int maponroaddelete();
    int maponroadundate();
    List<MapOnroad> maponroadselecet();
}
