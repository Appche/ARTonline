package artwork.po.advertorial;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="sale_advertorial")
@DiscriminatorValue("sale")
public class SaleAdvertorial extends Advertorial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1449034911333187399L;
	
	@Column(name="sale_item_id")
	private int saleItemId;

	public int getSaleItemId() {
		return saleItemId;
	}
	public void setSaleItemId(int saleItemId) {
		this.saleItemId = saleItemId;
	}
}
