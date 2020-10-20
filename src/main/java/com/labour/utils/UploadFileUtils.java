package com.labour.utils;

import com.labour.entity.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UploadFileUtils {

    public static List<String> uploadFiles(List<MultipartFile> files, String path) {
        List<String> fileNames = new ArrayList<>();
        if(files != null && !files.equals("null")){
            for (MultipartFile file : files) {
                if (StringUtils.isNotBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
                    String fileName = "";
                    fileName = file.getOriginalFilename();
                    String suffix = fileName.substring(fileName.lastIndexOf("."));
                    fileName = System.currentTimeMillis()+ Md5Utils.string2Md5(file.getOriginalFilename()).substring(0, 8)+suffix;
                    fileNames.add(fileName);
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
        }
        return fileNames;
    }

    public static String uploadOneFile(MultipartFile file, String path) {
        String fileName = "";
        if(file!=null){
            if (StringUtils.isNotBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
                fileName = file.getOriginalFilename();
                String suffix = fileName.substring(fileName.lastIndexOf("."));
                fileName = System.currentTimeMillis()+ Md5Utils.string2Md5(file.getOriginalFilename()).substring(0, 8)+suffix;
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
        return fileName;
    }

    public static String deleteOneFile(String path){
        String resultInfo = null;
        File file = new File(path);
        if (file.exists()) {//文件是否存在
            if (file.delete()) {//存在就删了，返回1
                resultInfo =  "1";
            } else {
                resultInfo =  "0";
            }
        } else {
            resultInfo = "文件不存在！";
        }
        return resultInfo;
    }

    public static List<String> updateFile(List<MultipartFile> files, String path){
        List<String> filenames = new ArrayList<>();
        int i = 0;
        if(files != null && !files.equals("null")){
            for (MultipartFile file : files) {
                if (StringUtils.isBlank(file.getOriginalFilename())) { // 通过获取文件名称来判断文件是否为空
                    i++;
                }else {
                    deleteOneFile(path + File.separator + file.getOriginalFilename());
                }
            }
            if(i < files.size()){
                filenames = uploadFiles(files, path);
            }
        }
        return filenames;
    }

}