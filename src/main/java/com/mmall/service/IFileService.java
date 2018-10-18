package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 汪永晖
 */
public interface IFileService {

    String upload(MultipartFile file, String path);
}
