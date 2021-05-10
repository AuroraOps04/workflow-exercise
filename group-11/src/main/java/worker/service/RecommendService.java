package worker.service;

import worker.bean.Recommend;

import java.util.List;

public interface RecommendService {
    List<Recommend> selectAll();
}
