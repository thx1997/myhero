package com.hero.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hero.entity.DeliverynoteDetail;
import com.hero.repository.DeliverynoteDetailMapper;
import com.hero.service.DeliverynoteDetailService;
@Service
public class DeliverynoteDetailServiceImpl implements DeliverynoteDetailService {
	@Autowired
	private DeliverynoteDetailMapper deliverynoteDetailMapper;
	@Override//(rfy)
	public List<DeliverynoteDetail> queryByQueryPage(DeliverynoteDetail query) {
		// TODO Auto-generated method stub
		return deliverynoteDetailMapper.queryByQueryPage(query);
	}

	@Override//(rfy)
	public int queryCountByQuery(DeliverynoteDetail query) {
		// TODO Auto-generated method stub
		return deliverynoteDetailMapper.queryCountByQuery(query);
	}

}
