package com.javaex.vo;

public class GalleryVo {
	private int no;
	private int user_no;
	private String content;
	private String filepath;
	private String orgnmae;
	private String savename;
	private int filesize;
	private String username;
	
	public GalleryVo() {
		super();
	}

	public GalleryVo(int no, int user_no, String content, String filepath, String orgnmae, String savename,
			int filesize, String username) {
		super();
		this.no = no;
		this.user_no = user_no;
		this.content = content;
		this.filepath = filepath;
		this.orgnmae = orgnmae;
		this.savename = savename;
		this.filesize = filesize;
		this.username = username;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public String getOrgnmae() {
		return orgnmae;
	}

	public void setOrgnmae(String orgnmae) {
		this.orgnmae = orgnmae;
	}

	public String getSavename() {
		return savename;
	}

	public void setSavename(String savename) {
		this.savename = savename;
	}

	public int getFilesize() {
		return filesize;
	}

	public void setFilesize(int filesize) {
		this.filesize = filesize;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "GalleryVo [no=" + no + ", user_no=" + user_no + ", content=" + content + ", filepath=" + filepath
				+ ", orgnmae=" + orgnmae + ", savename=" + savename + ", filesize=" + filesize + ", username="
				+ username + "]";
	}
		
	
}
