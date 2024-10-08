package io.github.vimasig.bozar.obfuscator.transformer.impl.watermark;

import io.github.vimasig.bozar.obfuscator.Bozar;
import io.github.vimasig.bozar.obfuscator.transformer.ClassTransformer;
import io.github.vimasig.bozar.obfuscator.utils.model.BozarCategory;
import io.github.vimasig.bozar.obfuscator.utils.model.BozarConfig;
import org.objectweb.asm.ClassWriter;

public class TextInsideClassTransformer extends ClassTransformer {

    public TextInsideClassTransformer(Bozar bozar) {
        super(bozar, "类中的文本", BozarCategory.WATERMARK);
    }
    
    @Override
    public void transformClassWriter(ClassWriter classWriter) {
        classWriter.newUTF8(this.getBozar().getConfig().getOptions().getWatermarkOptions().getTextInsideClassText());
    }

    @Override
    public BozarConfig.EnableType getEnableType() {
        return new BozarConfig.EnableType(() -> this.getBozar().getConfig().getOptions().getWatermarkOptions().isTextInsideClass(), "Bozar");
    }
}
