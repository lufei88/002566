package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f393short = {1692, 1725, 1702, 1778, 1696, 1719, 1715, 1713, 1722, 1719, 1718, 1317, 1284, 1311, 1355, 1305, 1294, 1290, 1288, 1283, 1294, 1295, 1417, 1448, 1459, 1511, 1461, 1442, 1446, 1444, 1455, 1442, 1443};
    public final int a;
    public final ByteBuffer b;
    public final CharBuffer c;
    public final IntBuffer d;

    public b(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.a = i;
        this.b = byteBuffer;
        this.c = charBuffer;
        this.d = intBuffer;
    }

    /* renamed from: ۟ۦۧ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m3778() {
        if (C0007.m1886() >= 0) {
            return f393short;
        }
        return null;
    }

    public final int a() {
        int iM4101 = C0019.m4101(C0056.m8866(this));
        if (iM4101 == 0) {
            return C0050.m8117(C0004.m1499(this));
        }
        if (iM4101 == 1) {
            return C0054.m8649(C0016.m3600(this));
        }
        if (iM4101 == 2) {
            return C0018.m3941(C0058.m9102(this));
        }
        throw new UnsupportedOperationException(C0005.m1645(m3778(), 0, 11, 1746));
    }

    public final int b() {
        Object objM1499;
        int iM4101 = C0019.m4101(C0056.m8866(this));
        if (iM4101 == 0) {
            objM1499 = C0004.m1499(this);
        } else if (iM4101 == 1) {
            objM1499 = C0016.m3600(this);
        } else {
            if (iM4101 != 2) {
                throw new UnsupportedOperationException(C0050.m8131(m3778(), 11, 11, 1387));
            }
            objM1499 = C0058.m9102(this);
        }
        return C0025.m4874(objM1499);
    }

    public final int c() {
        Object objM1499;
        int iM4101 = C0019.m4101(C0056.m8866(this));
        if (iM4101 == 0) {
            objM1499 = C0004.m1499(this);
        } else if (iM4101 == 1) {
            objM1499 = C0016.m3600(this);
        } else {
            if (iM4101 != 2) {
                throw new UnsupportedOperationException(C0018.m3917(m3778(), 22, 11, 1479));
            }
            objM1499 = C0058.m9102(this);
        }
        return C0037.m6363(objM1499);
    }
}