package com.example.uploadfileinfilesystem.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author CuongLM18
 * @created 13/09/2022 - 2:51 PM
 * @project upload-file-in-file-system
 */
@Entity
@Table(name = "FILE_DATA")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FileData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type;

    private String filePath;
}
