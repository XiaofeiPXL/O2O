package com.imooc.o2o.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.multipart.commons.CommonsMultipartFile;


import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @program: o2o
 * @description: 图片处理工具类
 * @author: Xiaofei Wang
 * @created: 2020/10/02 00:11
 */


public class ImageUtils {
    private static final String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();
    private static final Logger logger = LoggerFactory.getLogger(ImageUtils.class);

    /**
     * 文件流类型转换
     *
     * @param cFile CommonsMultipleFile
     * @return File
     */
    public static File transferCommonsMultipartFileToFile(CommonsMultipartFile cFile) {
        File newFile = new File(cFile.getOriginalFilename());
        try {
            cFile.transferTo(newFile);
        } catch (IllegalStateException | IOException e) {
            logger.error(e.toString());
            e.printStackTrace();
        }
        return newFile;
    }

    /**
     *
     * @param inputStream 输入流
     * @param fileName 文件名
     * @param targetAddr 目标文件夹路径
     * @return 缩略图
     */
    public static String generateThumbnail(InputStream inputStream, String fileName,String targetAddr) {
        String realFileName = getRandomFileName();
        String extension = getFileExtension(fileName);
        makeDirPath(targetAddr);
        String relativeAddr = targetAddr + realFileName + extension;
        logger.error("current relativeAddr is " + relativeAddr);
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("The complete address is " + PathUtil.getImgBasePath() + relativeAddr);
        logger.debug("basePath is :" + basePath);
        try {
            Thumbnails.of(inputStream).size(200, 200).watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "watermark.jpg")), 0.25f)
                    .outputQuality(0.8f).toFile(dest);
        } catch (IOException exception) {
            logger.error(exception.toString());
            exception.printStackTrace();
        }
        return relativeAddr;
    }

    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {
            dirPath.mkdirs();
        }
    }

    /**
     * 获取文件的扩展名
     *
     * @param fileName 文件名
     * @return 文件的扩展名
     */
    private static String getFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成五位随机数
     *
     * @return 生成五位随机数0-99999
     */
    public static String getRandomFileName() {
        // 获取随机的五位数
        int randomNumber = r.nextInt(89999) + 10000;
        String nowTimeStr = sDateFormat.format(new Date());
        return nowTimeStr + randomNumber;
    }


    public static void main(String[] args) {
        try {
            Thumbnails.of(new File("/Users/xiaofeiwang/Desktop/cat.jpg")).size(300, 300)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg")), 0.25f)
                    .outputQuality(0.8f).toFile("/Users/xiaofeiwang/Desktop/CatNew.jpg");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
