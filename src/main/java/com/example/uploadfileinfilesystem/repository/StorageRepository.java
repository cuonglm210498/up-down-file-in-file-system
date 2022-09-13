package com.example.uploadfileinfilesystem.repository;

import com.example.uploadfileinfilesystem.entity.ImageData;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author CuongLM18
 * @created 13/09/2022 - 3:07 PM
 * @project upload-file-in-file-system
 */
@Repository
public interface StorageRepository extends BaseRepository<ImageData, Long> {

    Optional<ImageData> findByName(String fileName);
}
