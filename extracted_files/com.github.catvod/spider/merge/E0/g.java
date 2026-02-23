package com.github.catvod.spider.merge.E0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.io.PrintStream;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f397short = {463, 458, 461, 454, 387, 1646, 1421};
    public static final g a = new g();

    /* renamed from: ۡۧۨۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3782() {
        if (C0058.m9131() < 0) {
            return f397short;
        }
        return null;
    }

    public final void a(o oVar, com.github.catvod.spider.merge.G0.b bVar, int i, int i2, BitSet bitSet, C0148e c0148e) {
    }

    public final void b(o oVar, com.github.catvod.spider.merge.G0.b bVar, int i, int i2, BitSet bitSet, C0148e c0148e) {
    }

    public final void c(o oVar, com.github.catvod.spider.merge.G0.b bVar, int i, int i2, int i3, C0148e c0148e) {
    }

    public final void d(s sVar, Object obj, int i, int i2, String str, q qVar) {
        PrintStream printStreamM7298 = C0043.m7298();
        StringBuilder sb = new StringBuilder(C0023.m4536(m3782(), 0, 5, 419));
        C0036.m6177(sb, i);
        C0018.m3933(sb, C0065.m9775(m3782(), 5, 1, 1620));
        C0036.m6177(sb, i2);
        C0018.m3933(sb, C0031.m5565(m3782(), 6, 1, 1453));
        C0018.m3933(sb, str);
        C0012.m2969(printStreamM7298, C0047.m7763(sb));
    }
}