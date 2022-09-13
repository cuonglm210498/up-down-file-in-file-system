package com.example.uploadfileinfilesystem.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author CuongLM18
 * @created 13/09/2022 - 3:09 PM
 * @project upload-file-in-file-system
 */
public interface StorageService {

    String uploadImage(MultipartFile file) throws IOException;

    byte[] downloadImage(String fileName);

    String uploadImageToFileSystem(MultipartFile file) throws IOException;

    byte[] downloadImageFromFileSystem(String fileName) throws IOException;
}
