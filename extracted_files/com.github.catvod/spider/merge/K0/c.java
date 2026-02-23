package com.github.catvod.spider.merge.K0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.r.C0014;

/* loaded from: classes.dex */
public abstract class c {
    public final byte a;
    public final int b;
    public final int c;
    public final int d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f464short = {1834, 1809, 1822, 1821, 1811, 1818, 1887, 1803, 1808, 1887, 1822, 1811, 1811, 1808, 1820, 1822, 1803, 1818, 1887, 1822, 1805, 1805, 1822, 1798, 1887, 1804, 1814, 1797, 1818, 1861, 1887};
    public static final byte[] e = {13, 10};

    public c(int i, int i2) {
        this.b = (i <= 0 || i2 <= 0) ? 0 : (i / 4) * 4;
        this.c = i2;
        this.a = (byte) 61;
        this.d = 2;
    }

    public static byte[] a(int i, b bVar) {
        byte[] bArrM1456 = C0003.m1456(bVar);
        if (bArrM1456 == null) {
            bVar.b = new byte[C0008.m1965(i, 8192)];
            bVar.c = 0;
            bVar.d = 0;
        } else {
            int iM6547 = C0039.m6547(bVar) + i;
            if (iM6547 - bArrM1456.length > 0) {
                int length = bArrM1456.length * 2;
                int i2 = length ^ Integer.MIN_VALUE;
                int i3 = iM6547 ^ Integer.MIN_VALUE;
                if (i2 != i3 && i2 < i3) {
                    length = iM6547;
                }
                int i4 = Integer.MIN_VALUE ^ length;
                if (i4 != -9 && i4 >= -9) {
                    if (iM6547 < 0) {
                        StringBuilder sb = new StringBuilder(C0032.m5708(m4393(), 0, 31, 1919));
                        C0058.m9141(sb, iM6547 & 4294967295L);
                        throw new OutOfMemoryError(C0047.m7763(sb));
                    }
                    length = C0008.m1965(iM6547, 2147483639);
                }
                byte[] bArrM9210 = C0059.m9210(C0003.m1456(bVar), length);
                bVar.b = bArrM9210;
                return bArrM9210;
            }
        }
        return C0003.m1456(bVar);
    }

    public static void b(byte[] bArr, int i, b bVar) {
        int iM6547 = C0039.m6547(bVar);
        int iM6409 = C0038.m6409(bVar);
        if (iM6547 > iM6409) {
            int iM8186 = C0051.m8186(iM6547 > iM6409 ? iM6547 - iM6409 : 0, i);
            C0062.m9384(C0003.m1456(bVar), C0038.m6409(bVar), bArr, 0, iM8186);
            int iM64092 = C0038.m6409(bVar) + iM8186;
            bVar.d = iM64092;
            if (C0039.m6547(bVar) > iM64092) {
                return;
            }
            bVar.d = 0;
            bVar.c = 0;
        }
    }

    /* renamed from: ۟ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static short[] m4393() {
        if (C0014.m3353() <= 0) {
            return f464short;
        }
        return null;
    }
}