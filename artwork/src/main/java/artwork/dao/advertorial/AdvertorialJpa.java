package artwork.dao.advertorial;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import artwork.po.advertorial.Advertorial;

@Transactional
@Repository("advertorialDao")
public class AdvertorialJpa implements AdvertorialDao {
	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
	public void addAdvertorial(Advertorial advertorial)
	{
		entityManager.persist(advertorial);
	}
}
