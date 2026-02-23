package com.github.catvod.spider.p000mergexbpq.d0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;

/* loaded from: classes.dex */
final class I extends O {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f211short = {1699, 1726, 1714, 1714, 2981, 2981, 2998};
    private final StringBuilder b = new StringBuilder();
    private String c;

    I() {
        this.a = 4;
    }

    /* renamed from: ۟ۦۣۧ, reason: not valid java name and contains not printable characters */
    public static void m2464(Object obj) {
        if (C0000.m1116() < 0) {
            O.h((StringBuilder) obj);
        }
    }

    /* renamed from: ۟ۧۢۤۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2465() {
        if (C0029.m5282() > 0) {
            return f211short;
        }
        return null;
    }

    /* renamed from: ۠ۥۤۡ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m2466(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((I) obj).b;
        }
        return null;
    }

    /* renamed from: ۥۦۡ۟, reason: contains not printable characters */
    public static String m2467(Object obj) {
        if (C0030.m5375() > 0) {
            return ((I) obj).c;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.d0.O
    final O g() {
        m2464(m2466(this));
        this.c = null;
        return this;
    }

    final I i(char c) {
        String strM2467 = m2467(this);
        if (strM2467 != null) {
            C0018.m3933(m2466(this), strM2467);
            this.c = null;
        }
        C0062.m9399(m2466(this), c);
        return this;
    }

    final I j(String str) {
        String strM2467 = m2467(this);
        if (strM2467 != null) {
            C0018.m3933(m2466(this), strM2467);
            this.c = null;
        }
        if (C0006.m1693(m2466(this)) == 0) {
            this.c = str;
        } else {
            C0018.m3933(m2466(this), str);
        }
        return this;
    }

    final String k() {
        String strM2467 = m2467(this);
        return strM2467 != null ? strM2467 : C0047.m7763(m2466(this));
    }

    public final String toString() {
        StringBuilder sbM7166 = C0042.m7166(C0000.m1077(m2465(), 0, 4, 1695));
        String strM2467 = m2467(this);
        if (strM2467 == null) {
            strM2467 = C0047.m7763(m2466(this));
        }
        return C0040.m6629(sbM7166, strM2467, C0002.m1305(m2465(), 4, 3, 2952));
    }
}