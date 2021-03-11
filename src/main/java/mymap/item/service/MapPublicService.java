package mymap.item.service;

import mymap.item.entity.MapPublicpak;

import java.util.List;

public interface MapPublicService {
    int mappublicinsert();
    int mappublicdelete();
    int mappublicundate();
    List<MapPublicpak> mappublicselecet();
}
