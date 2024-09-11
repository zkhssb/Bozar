package io.github.vimasig.bozar.obfuscator.utils.model;

import com.google.gson.annotations.SerializedName;

public enum BozarCategory {
    @SerializedName("基本") STABLE("基本的混淆选项。大多数选项不可逆。\n保护和加速您的应用程序的好方法。"),
    @SerializedName("高级") ADVANCED("高级混淆选项。可逆。\n对新手提供强大的保护。"),
    @SerializedName("水印") WATERMARK("将水印实现到您的应用程序的不同方式。");

    private final String description;

    BozarCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
