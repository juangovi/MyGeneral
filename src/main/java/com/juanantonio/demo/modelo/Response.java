package com.juanantonio.demo.modelo;

import org.springframework.stereotype.Component;

@Component
public class Response<T> {

	private T response;

	private int status;

	private String serverMesage;

	public T getResponse() {
		return response;
	}

	public void setResponse(T response) {
		this.response = response;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getServerMesage() {
		return serverMesage;
	}

	public void setServerMesage(String serverMesage) {
		this.serverMesage = serverMesage;
	}

	public Response() {
		
	}

}
