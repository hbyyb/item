package mymap.item.service.impl;

import mymap.item.entity.MapPublicpak;
import mymap.item.entity.MapPublicpakExample;
import mymap.item.mapper.MapPublicpakMapper;
import mymap.item.service.MapPublicService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
@Component
public class MapPublicServiceImpl implements MapPublicService {
    @Resource
    MapPublicpakMapper mapPublicpakMapper;
    MapPublicpakExample mapPublicpakExample;
    @Override
    public int mappublicinsert() {
        return 0;
    }

    @Override
    public int mappublicdelete() {
        return 0;
    }

    @Override
    public int mappublicundate() {
        return 0;
    }

    @Override
    public List<MapPublicpak> mappublicselecet() {
        return null;
    }
}
