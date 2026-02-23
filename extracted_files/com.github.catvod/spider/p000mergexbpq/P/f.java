package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f143short = {1851, 1818, 1793, 1877, 1799, 1808, 1812, 1814, 1821, 1808, 1809, 1359, 1390, 1397, 1313, 1395, 1380, 1376, 1378, 1385, 1380, 1381, 556, 525, 534, 578, 528, 519, 515, 513, 522, 519, 518};
    private final int a;
    private final ByteBuffer b;
    private final CharBuffer c;
    private final IntBuffer d;

    f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    public static e b(int i) {
        return new e(i);
    }

    /* renamed from: ۣ۟۟ۤۦ, reason: not valid java name and contains not printable characters */
    public static ByteBuffer m803(Object obj) {
        if (C0028.m5152() < 0) {
            return ((f) obj).b;
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m804(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((f) obj).a;
        }
        return 0;
    }

    /* renamed from: ۣۣۦۢ, reason: not valid java name and contains not printable characters */
    public static IntBuffer m805(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((f) obj).d;
        }
        return null;
    }

    /* renamed from: ۥۣۡ, reason: contains not printable characters */
    public static short[] m806() {
        if (C0040.m6582() > 0) {
            return f143short;
        }
        return null;
    }

    /* renamed from: ۧ۠ۧۥ, reason: not valid java name and contains not printable characters */
    public static CharBuffer m807(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((f) obj).c;
        }
        return null;
    }

    final int a() {
        int iM6078 = C0035.m6078(m804(this));
        if (iM6078 == 0) {
            return C0050.m8117(m803(this));
        }
        if (iM6078 == 1) {
            return C0054.m8649(m807(this));
        }
        if (iM6078 == 2) {
            return C0018.m3941(m805(this));
        }
        throw new UnsupportedOperationException(C0062.m9389(m806(), 0, 11, 1909));
    }

    final byte[] c() {
        return C0004.m1530(m803(this));
    }

    final char[] d() {
        return C0050.m8140(m807(this));
    }

    final int e() {
        return m804(this);
    }

    final int[] f() {
        return C0052.m8293(m805(this));
    }

    public final int g() {
        Object objM803;
        int iM6078 = C0035.m6078(m804(this));
        if (iM6078 == 0) {
            objM803 = m803(this);
        } else if (iM6078 == 1) {
            objM803 = m807(this);
        } else {
            if (iM6078 != 2) {
                throw new UnsupportedOperationException(C0046.m7718(m806(), 11, 11, 1281));
            }
            objM803 = m805(this);
        }
        return C0025.m4874(objM803);
    }

    public final int h() {
        Object objM803;
        int iM6078 = C0035.m6078(m804(this));
        if (iM6078 == 0) {
            objM803 = m803(this);
        } else if (iM6078 == 1) {
            objM803 = m807(this);
        } else {
            if (iM6078 != 2) {
                throw new UnsupportedOperationException(C0017.m3646(m806(), 22, 11, 610));
            }
            objM803 = m805(this);
        }
        return C0037.m6363(objM803);
    }
}