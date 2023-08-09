package com.kinancity.core.captcha.captchaAiCom;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class CaptchaAiChallenge {

	/**
	 * Id of the captchaai.com request
	 */
	private String captchaId;

	/**
	 * When was it first sent
	 */
	private LocalDateTime sentTime;

	/**
	 * How many times we tried to get it from captchaai.com
	 */
	private int nbPolls;

	public CaptchaAiChallenge(String captchaId) {
		this.captchaId = captchaId;
		this.sentTime = LocalDateTime.now();
	}
}
