package com.modianli.credit.common;

import com.modianli.credit.common.excption.BasicError;

import lombok.Data;

@Data
public class AppException extends RuntimeException {

  private BasicError basicError;

  public AppException(){
    this.basicError = new BasicError();
  }

  public AppException(String message) {
	this.basicError = new BasicError(message);
  }

  public AppException(BasicError basicError) {
	this.basicError = basicError;
  }
}
