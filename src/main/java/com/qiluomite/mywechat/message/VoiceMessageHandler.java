package com.qiluomite.mywechat.message;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.blade.kit.FileKit;
import com.blade.kit.json.JSONObject;
import com.qiluomite.mywechat.bean.WechatMeta;
import com.qiluomite.mywechat.util.PropertyReader;

public class VoiceMessageHandler extends AbstractMessageHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(VoiceMessageHandler.class);

	public VoiceMessageHandler(WechatMeta meta) {
		super(meta);
		this.meta = meta;
	}

	@Override
	public void process(JSONObject msg) {
		LOGGER.warn("开始处理语音消息");
		PropertyReader pr = PropertyReader.load("classpath:config.properties");
		String voiceDir = pr.get("app.media_path");
		String msgId = msg.getString("MsgId");
		FileKit.createDir(voiceDir, false);
		String filePath = voiceDir + "/" + msgId + ".mp3";
		download(msg, MsgType.VOICE, filePath);

	}



}