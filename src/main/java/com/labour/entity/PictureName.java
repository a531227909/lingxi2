package com.labour.entity;

import java.io.Serializable;

public class PictureName implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 图片ID
     */
    private String pictureId;
    /**
     * 图片名
     */
    private String pictureName;

    public String getPictureId() {
        return pictureId;
    }

    public void setPictureId(String pictureId) {
        this.pictureId = pictureId;
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    @Override
    public String toString() {
        return "PictrueName{" +
                "pictureId='" + pictureId + '\'' +
                ", pictureName='" + pictureName + '\'' +
                '}';
    }
}
