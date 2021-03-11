package mymap.item.service;

import mymap.item.entity.MapTag;

import java.util.List;

public interface MapTagService {
    int maptaginsert();
    int maptagdelete();
    int maptagundate();
    List<MapTag> maptagselecet();
}
