package com.example.uploadfileinfilesystem.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author CuongLM18
 * @created 13/09/2022 - 3:04 PM
 * @project upload-file-in-file-system
 */
@Entity
@Table(name = "ImageData")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    @Lob
    @Column(name = "imagedata",length = 1000)
    private byte[] imageData;
}
