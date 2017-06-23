package com.wusiq.Controller;

import com.wusiq.Entity.req.reqReceiveFileInfoEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 文件管理的控制器
 */
@Controller
@RequestMapping(value = "/FileManage")
public class FileManageController {
    private static Logger LOGGER =  LoggerFactory.getLogger(FileManageController.class);
    private static final String FILEPATH="D:"+File.separator+"fileTest"+File.separator;//文件保存路径

    @RequestMapping(value = "/uploadFiles.do",method = RequestMethod.POST)
    public String receiveFileInfo(@RequestPart("targetFile") MultipartFile[] multipartFiles,reqReceiveFileInfoEntity req){
        LOGGER.info("输入的信息：{}",req);
        if(multipartFiles != null){
            for(MultipartFile multipartFile:multipartFiles){
                saveFile(multipartFile);
            }
        }
        return "successPage";
    }
    private void saveFile(MultipartFile multipartFile){
        if(!multipartFile.isEmpty()){
            try {
                String path = FILEPATH + multipartFile.getOriginalFilename();
                multipartFile.transferTo(new File(path));
                LOGGER.info("成功保存：{}",path);
            } catch (IOException e) {
                LOGGER.error("文件保存失败",e);
            }
        }else {
            LOGGER.error("文件保存失败，文件为空");
        }

    }
}
