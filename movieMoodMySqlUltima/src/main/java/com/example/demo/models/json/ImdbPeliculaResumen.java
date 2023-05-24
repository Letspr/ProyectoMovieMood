package com.example.demo.models.json;

public class ImdbPeliculaResumen {
	private String id;
	private String resultType;
	private String image;
	private String title;
	private String description;

	public ImdbPeliculaResumen() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getResultType() {
		return resultType;
	}

	public void setResultType(String resultType) {
		this.resultType = resultType;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "ImdbPeliculaResumen [id=" + id + ", resultType=" + resultType + ", image=" + image + ", title=" + title
				+ ", description=" + description + "]";
	}

}
