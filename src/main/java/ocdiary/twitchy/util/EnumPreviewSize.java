package ocdiary.twitchy.util;

import java.util.Locale;

/**
 * @author UpcraftLP
 */
public enum EnumPreviewSize {

    SMALL,
    MEDIUM,
    LARGE,
    HD(1280, 720),
    FULL_HD(1920, 1080);

    public final int width, height;

    EnumPreviewSize() {
        this(-1, -1);
    }

    EnumPreviewSize(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public String getKey() {
        switch (this) {
            case SMALL:
            case MEDIUM:
            case LARGE:
                return this.name().toLowerCase(Locale.ROOT);
            default:
                return "template";
        }
    }

}
