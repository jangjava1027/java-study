package org.project.dto;

public class Board1207Dto {

	
	private String writeId;
	private int bContent;
	
	public Board1207Dto(String writeId, int bContent) {
		super();
		this.writeId = writeId;
		this.bContent = bContent;
	}
	
	public String getWriteId() {
		return writeId;
	}
	public void setWriteId(String writeId) {
		this.writeId = writeId;
	}
	public int getbContent() {
		return bContent;
	}
	public void setbContent(int bContent) {
		this.bContent = bContent;
	}
	
	
}
