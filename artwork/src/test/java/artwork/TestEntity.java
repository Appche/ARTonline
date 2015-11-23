package artwork;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import artwork.service.AdvertorialService;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/applicationContext.xml" }) 
public class TestEntity {
	@Resource
	private AdvertorialService advertorialService;
	
	@Test
	public void testAuctionAdvertorial()
	{
		advertorialService.addAdvertorial(6);
	}
}
