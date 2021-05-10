package worker.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import worker.bean.Recommend;
import worker.mapper.RecommendMapper;
import worker.service.RecommendService;

import java.util.List;

@Service
public class RecommendServiceImpl implements RecommendService{
@Autowired
RecommendMapper recommendMapper;

    @Override
    public List<Recommend> selectAll() {
        return recommendMapper.selectAll();
    }
}
