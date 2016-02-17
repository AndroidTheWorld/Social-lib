package com.gaodun.common.lib.social.share;

public interface ShareCallback {

	void onSuccess(int platform);
	
	void onFailure(int platform, String msg);
	
	void onCancelled(int platform);
}
