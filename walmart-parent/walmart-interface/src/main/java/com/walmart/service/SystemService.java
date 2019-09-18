package com.walmart.service;

import com.walmart.pojo.Area;

import java.util.List;

public interface SystemService {
    List<Area> getArea(Long id);

    List<Area> getAreaUp(Long id);

    boolean deleteArea(Long id);

    boolean saveArea(Area area);

    String searchParentNameById(Long id);

    Area searchAreaById(Long id);

    boolean editAreaById(Area area);
}
