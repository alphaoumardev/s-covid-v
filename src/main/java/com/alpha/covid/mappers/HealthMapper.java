package com.alpha.covid.mappers;

import com.alpha.covid.models.Health;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HealthMapper extends BaseMapper<Health>
{
    List<Health> isReport(Long id);
}
