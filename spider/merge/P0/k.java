package com.github.catvod.spider.merge.P0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f484short = {698, 669, 667, 648, 669, 652, 654, 656, 680, 647, 653, 702, 640, 653, 669, 641, 713, 690, 666, 669, 667, 648, 669, 652, 654, 656, 724, 2214, 2218, 2301, 2275, 2286, 2302, 2274, 2231, 2120};
    public final j a;
    public final int b;

    public k(j jVar, int i) {
        this.a = jVar;
        this.b = i;
    }

    /* renamed from: ۟ۦۡۧ۠, reason: not valid java name and contains not printable characters */
    public static short[] m4640() {
        if (C0036.m6252() > 0) {
            return f484short;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0033.m5852(m4640(), 0, 27, 745));
        C0016.m3605(sb, C0058.m9119(this));
        C0018.m3933(sb, C0020.m4199(m4640(), 27, 8, 2186));
        C0036.m6177(sb, C0026.m4876(this));
        C0018.m3933(sb, C0047.m7833(m4640(), 35, 1, 2069));
        return C0047.m7763(sb);
    }
}