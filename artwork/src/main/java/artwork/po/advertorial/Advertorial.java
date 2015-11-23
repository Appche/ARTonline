package artwork.po.advertorial;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="advertorial")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="discriminator",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("plain")
public class Advertorial  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3553629149686553016L;
	
	@Id
	private int advertorial_id;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Temporal(TemporalType.TIME)
	private Date time;
	@Column(name="main_title")
	private String mainTitle;
	@Column(name="sub_title")
	private String subTitle;
	private String picture;
	private int keyword1;
	private int keyword2;
	private int keyword3;
	private String point;
	private String summary;
	private String text;	
	private int priority;
	private int click;
	private boolean availability;
	
	public int getAdvertorial_id() {
		return advertorial_id;
	}
	public void setAdvertorial_id(int advertorial_id) {
		this.advertorial_id = advertorial_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean getAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getMainTitle() {
		return mainTitle;
	}
	public void setMainTitle(String mainTitle) {
		this.mainTitle = mainTitle;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}
	public int getKeyword1() {
		return keyword1;
	}
	public void setKeyword1(int keyword1) {
		this.keyword1 = keyword1;
	}
	public int getKeyword2() {
		return keyword2;
	}
	public void setKeyword2(int keyword2) {
		this.keyword2 = keyword2;
	}
	public int getKeyword3() {
		return keyword3;
	}
	public void setKeyword3(int keyword3) {
		this.keyword3 = keyword3;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getClick() {
		return click;
	}
	public void setClick(int click) {
		this.click = click;
	}
}
