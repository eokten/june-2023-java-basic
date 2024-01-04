package com.okten.homeworks.lesson1;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Comment {
    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;


}
