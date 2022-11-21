package com.utm.gitfit.model.request;


import javax.validation.constraints.NotBlank;

public record LoginRequest(@NotBlank String email, @NotBlank String password) {

}