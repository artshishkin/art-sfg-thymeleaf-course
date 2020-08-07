package com.artarkatesoft.artsfgthymeleafcourse.commands;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class LoginCommand {
    @NotEmpty
    @Size(min = 3, max = 255)
    private String username;
    @NotEmpty
    @Size(min = 3)
    private String password;
}
