package com.labour.utils;

import com.labour.entity.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

public class UploadFileUtils {

    public String uploadFiles(List<MultipartFile> files, String path) {
        String fileNames = "";
        for (MultipartFile file : files) {
            if (StringUtils.isNotBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
                String fileName = "";
                fileName = file.getOriginalFilename();
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                fileName = System.currentTimeMillis()+ Md5Utils.string2Md5(file.getOriginalFilename()).substring(0, 8)+suffix;
                fileNames = fileNames+","+fileName;
                OutputStream os = null;
                InputStream is = null;
                try {
                    // 获取MultipartFile的输入流
                    is = file.getInputStream();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    // 保存路径
                    File filePath = new File(path);
                    if (!filePath.exists()) { // 判断文件是否存在
                        filePath.mkdirs(); // 检测文件夹是否存在，如果不存在就创建
                    }
                    // 把图片保存到指定路径
                    os = new FileOutputStream(filePath.getPath() + File.separator + fileName);
                    //限制上传10M大小文件
                    byte[] bs = new byte[100*1024*1024];
                    int len;
                    // 开始读取
                    while ((len = is.read(bs)) != -1) {
                        os.write(bs, 0, len);
                        os.flush();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    try {
                        if (os != null) {
                            os.close();
                        }
                        if (is != null) {
                            is.close();
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return fileNames;
    }

    public Result uploadOneFile(MultipartFile file, String fileName, String path) {
        Result result = new Result();
        OutputStream os = null;
        InputStream is = null;
        try {
            // 获取MultipartFile的输入流
            is = file.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            // 保存路径
            File filePath = new File(path);
            if (!filePath.exists()) { // 判断文件是否存在
                filePath.mkdirs(); // 检测文件夹是否存在，如果不存在就创建
            }
            // 把图片保存到指定路径
            os = new FileOutputStream(filePath.getPath() + File.separator + fileName);
            //限制上传10M大小文件
            byte[] bs = new byte[100*1024*1024];
            int len;
            // 开始读取
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
                os.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

}