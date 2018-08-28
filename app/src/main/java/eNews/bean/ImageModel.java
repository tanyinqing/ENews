package eNews.bean;

import java.util.List;

/**
 * 
 * @author 
 * @date 2016-9-12 Õº∆¨ µÃÂ¿‡
 */
public class ImageModel {

	public String getDocid() {
		return docid;
	}

	public void setDocid(String docid) {
		this.docid = docid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<String> getImgList() {
		return imgList;
	}

	public void setImgList(List<String> imgList) {
		this.imgList = imgList;
	}

	private String docid;

	private String title;

	private List<String> imgList;

}
