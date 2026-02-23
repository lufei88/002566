package com.github.catvod.spider.merge.l0;

import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class h extends FilterOutputStream {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f834short = {442, 391, 384, 391, 384, 1014, 939, 990, 985, 2494, 2489};

    public h(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: ۟۠ۧ۠۠, reason: not valid java name and contains not printable characters */
    public static OutputStream m8847(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((FilterOutputStream) obj).out;
        }
        return null;
    }

    /* renamed from: ۨۢۡۡ, reason: not valid java name and contains not printable characters */
    public static short[] m8848() {
        if (C0029.m5282() > 0) {
            return f834short;
        }
        return null;
    }

    public final void a() {
        C0006.m1771(m8847(this), C0050.m8115(C0016.m3525(m8848(), 0, 5, 394)));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        C0003.m1435(this, new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        C0003.m1435(this, bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return;
        }
        C0006.m1771(m8847(this), C0050.m8115(C0002.m1327(C0048.m7902(m8848(), 5, 4, 979), new Object[]{C0011.m2808(i2)})));
        C0040.m6606(m8847(this), bArr, i, i2);
        C0006.m1771(m8847(this), C0050.m8115(C0005.m1645(m8848(), 9, 2, 2483)));
    }
}