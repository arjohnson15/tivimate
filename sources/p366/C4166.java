package p366;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import p065.C1514;
import p376.AbstractC4320;

/* renamed from: ᵔﾞ.ᵎـ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C4166 extends C4157 {
    /* renamed from: ʿʼ, reason: contains not printable characters */
    public static Long m9578(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // p366.C4157
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // p366.C4157
    /* renamed from: ﹳﹳ */
    public final C1514 mo9575(C4167 c4167) throws IOException {
        Path path = Paths.get(c4167.f16084.m9564(), new String[0]);
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = C4167.f16083;
                String string = symbolicLink.toString();
                C4155 c4155 = AbstractC4320.f16780;
                C4143 c4143 = new C4143();
                c4143.m9496(string);
                AbstractC4320.m9820(c4143, false);
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lM9578 = fileTimeCreationTime != null ? m9578(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lM95782 = fileTimeLastModifiedTime != null ? m9578(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new C1514(zIsRegularFile, zIsDirectory, lValueOf, lM9578, lM95782, fileTimeLastAccessTime != null ? m9578(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
