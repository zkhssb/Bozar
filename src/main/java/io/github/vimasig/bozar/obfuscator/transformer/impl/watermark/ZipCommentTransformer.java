package io.github.vimasig.bozar.obfuscator.transformer.impl.watermark;

import io.github.vimasig.bozar.obfuscator.Bozar;
import io.github.vimasig.bozar.obfuscator.transformer.ClassTransformer;
import io.github.vimasig.bozar.obfuscator.utils.model.BozarCategory;
import io.github.vimasig.bozar.obfuscator.utils.model.BozarConfig;

import java.util.jar.JarOutputStream;

public class ZipCommentTransformer extends ClassTransformer {

    public ZipCommentTransformer(Bozar bozar) {
        super(bozar, "压缩包简介", BozarCategory.WATERMARK);
    }

    @Override
    public void transformOutput(JarOutputStream jarOutputStream) {
        jarOutputStream.setComment(this.getBozar().getConfig().getOptions().getWatermarkOptions().getZipCommentText());
    }

    @Override
    public BozarConfig.EnableType getEnableType() {
        return new BozarConfig.EnableType(() -> this.getBozar().getConfig().getOptions().getWatermarkOptions().isZipComment(), "Obfuscation provided by\nhttps://github.com/vimasig/Bozar");
    }
}
