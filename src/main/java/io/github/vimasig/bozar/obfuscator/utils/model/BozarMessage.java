package io.github.vimasig.bozar.obfuscator.utils.model;

import io.github.vimasig.bozar.obfuscator.utils.BozarUtils;

import javax.swing.*;

public enum BozarMessage {

    TITLE("Bozar 混淆器"),
    VERSION_TEXT(TITLE.toString() + " v" + BozarUtils.getVersion()),

    // Update checker messages
    NEW_UPDATE_AVAILABLE("新版本已发布: v"),
    CANNOT_CHECK_UPDATE("无法检测新版本" + System.lineSeparator() + "连接失败."),
    CANNOT_OPEN_URL("无法访问地址. %s, 不支持您的操作系统.");

    private final String message;
    BozarMessage(String message) {
        this.message = message;
    }

    public void showError(Object... args) {
        JOptionPane.showMessageDialog(null, String.format(this.message, args), BozarMessage.VERSION_TEXT.toString(), JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public String toString() {
        return this.message;
    }
}
