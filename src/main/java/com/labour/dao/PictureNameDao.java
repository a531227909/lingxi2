package com.labour.dao;

import com.labour.entity.PictureName;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PictureNameDao {

    List<PictureName> selectPicNameById(@Param("pictureID") String pictrueID);

    int insertOnepictureName(@Param("pictureID") String pictrueID, @Param("pictureName") String pictrueName);

    int deleteCompanyPic(@Param("pictureID") String pictrueID, @Param("pictureName") String pictrueName);
}
