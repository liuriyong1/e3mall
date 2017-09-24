package cn.e3mall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3mall.mapper.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.pojo.TbItemExample;
import cn.e3mall.pojo.TbItemExample.Criteria;
import cn.e3mall.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	TbItemMapper tbItemMapper;
	
	@Override
	public TbItem getItemById(long id) {
		// TODO Auto-generated method stub
		//根据Id查询
//		TbItem tbItem = tbItemMapper.selectByPrimaryKey(id);
		 TbItemExample example = new TbItemExample();
		 Criteria criteria = example.createCriteria();
		 criteria.andIdEqualTo(id);
		 List<TbItem> list = tbItemMapper.selectByExample(example);
		return list.get(0);
	}

}
