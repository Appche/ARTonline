package artwork.po.advertorial;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="design_advertorial")
@DiscriminatorValue("design")
public class DesignAdvertorial extends Advertorial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7231923721680817816L;
	
	@Column(name="design_item_id")
	private int designItemId;
	
	public int getDesignItemId() {
		return designItemId;
	}
	public void setDesignItemId(int designItemId) {
		this.designItemId = designItemId;
	}
}
