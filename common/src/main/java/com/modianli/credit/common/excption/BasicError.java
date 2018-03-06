package com.modianli.credit.common.excption;

import org.springframework.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BasicError {

  private String message;

  private HttpStatus code = HttpStatus.UNPROCESSABLE_ENTITY;

  public BasicError(){
    this.message = "请稍后重试";
  }

  public BasicError(String message){
    this.message = message;
  }

  public BasicError(String message, HttpStatus code){
    this(message);
    this.code = code;
  }
}
