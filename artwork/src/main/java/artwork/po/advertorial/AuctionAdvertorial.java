package artwork.po.advertorial;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="auction_advertorial")
@DiscriminatorValue("auction")
public class AuctionAdvertorial extends Advertorial implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2433203827774649767L;
	
	@Column(name="auction_id")
	private int auctionId;
	@Column(name="in_process")
	private boolean inProcess;
	
	public int getAuctionId() {
		return auctionId;
	}
	public void setAuctionId(int auctionId) {
		this.auctionId = auctionId;
	}
	public boolean getInProcess() {
		return inProcess;
	}
	public void setInProcess(boolean inProcess) {
		this.inProcess = inProcess;
	}
}
