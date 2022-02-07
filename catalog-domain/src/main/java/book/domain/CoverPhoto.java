package book.domain;

import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;

public final class CoverPhoto {
    private final byte[] coverPhoto;

    private CoverPhoto(byte[] coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    public static CoverPhoto valueOf(byte[] coverPhoto) {
        Objects.requireNonNull(coverPhoto);
        return new CoverPhoto(Base64.getDecoder().decode(coverPhoto));
    }

    public byte[] getCoverPhoto() {
        return coverPhoto;
    }

    @Override
    public String toString() {
        return "CoverPhoto{" +
                "coverPhoto=" + Arrays.toString(coverPhoto) +
                '}';
    }
}
