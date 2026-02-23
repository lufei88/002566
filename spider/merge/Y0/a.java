package com.github.catvod.spider.merge.Y0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V0.d;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.c.C0009;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f687short = {2717, 2699, 2700, 2700, 2715, 2704, 2698, 2782, 2717, 2705, 2704, 2698, 2715, 2694, 2698, 2782, 2711, 2701, 2782, 2707, 2705, 2700, 2715, 2782, 2698, 2710, 2719, 2704, 2782, 2705, 2704, 2715, 2782, 2715, 2706, 2770, 2698, 2705, 2698, 2719, 2706, 2782, 2755, 2782};
    public d a;
    public boolean b = false;
    public a c;

    public a(m mVar) {
        d dVar = new d();
        this.a = dVar;
        C0018.m3918(dVar, mVar);
    }

    public a(d dVar) {
        d dVar2 = new d();
        this.a = dVar2;
        C0002.m1243(dVar2, dVar);
    }

    /* renamed from: ۣ۠ۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m6266() {
        if (C0050.m8121() <= 0) {
            return f687short;
        }
        return null;
    }

    public final m a() {
        if (C0009.m2095(C0000.m1092(this)) == 1) {
            return C0043.m7303(C0000.m1092(this));
        }
        StringBuilder sb = new StringBuilder(C0049.m8007(m6266(), 0, 44, 2814));
        C0036.m6177(sb, C0009.m2095(C0000.m1092(this)));
        throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
    }
}