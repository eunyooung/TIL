package com.sist.service;

import java.util.*;
import com.sist.vo.*;

public interface LocationService {

    public List<LocationVO> locationListData(Map map);
    public int locationTotalPage();
    public LocationVO locationDetailData(int no);
    public List<NatureVO> natureListData(Map map);
    public int natureTotalPage();
    public NatureVO natureDetailData(int no);
}