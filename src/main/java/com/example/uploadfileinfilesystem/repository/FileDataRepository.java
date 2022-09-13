package com.example.uploadfileinfilesystem.repository;

import com.example.uploadfileinfilesystem.entity.FileData;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author CuongLM18
 * @created 13/09/2022 - 3:06 PM
 * @project upload-file-in-file-system
 */
@Repository
public interface FileDataRepository extends BaseRepository<FileData, Long> {

    Optional<FileData> findByName(String fileName);
}
