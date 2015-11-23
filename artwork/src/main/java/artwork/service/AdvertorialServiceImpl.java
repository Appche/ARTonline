package artwork.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import artwork.dao.advertorial.AdvertorialDao;
import artwork.po.advertorial.Advertorial;

@Service("advertorialService")
public class AdvertorialServiceImpl implements AdvertorialService {
	@Resource
	AdvertorialDao advertorialDao;
	
	public void addAdvertorial(int id)
	{
		Advertorial advertorial = new Advertorial();
		advertorial.setAdvertorial_id(id);
		advertorialDao.addAdvertorial(advertorial);
	}
}
