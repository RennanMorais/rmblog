package br.com.rmblog.rmblog.dto;

import br.com.rmblog.rmblog.model.User;
import java.time.LocalDate;

public class PostDto {
    
    private Long id;
    
    private String title;
    private LocalDate Date;
    private String urlImage;
    private String corpo;
    private User user;

}
