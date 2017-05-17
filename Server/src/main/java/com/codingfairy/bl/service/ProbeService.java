package com.codingfairy.bl.service;

import com.codingfairy.bl.vo.ProbeVo;
import org.springframework.data.domain.Page;

/**
 * Probe related service
 * @author cuihao
 */
public interface ProbeService {

    Page<ProbeVo> findAll(int page, int size);

    ProbeVo findById(int id);
}
