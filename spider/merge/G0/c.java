package com.github.catvod.spider.merge.G0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.d0;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f448short = {3221, 2780, 2768, 3213};
    public final d0 a;
    public final int b;

    public c(d0 d0Var, int i) {
        this.b = i;
        this.a = d0Var;
    }

    /* renamed from: ۣۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m4132() {
        if (C0012.m3024() > 0) {
            return f448short;
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0035.m6131(m4132(), 0, 1, 3261));
        C0016.m3605(sb, C0015.m3447(this));
        C0018.m3933(sb, C0003.m1398(m4132(), 1, 2, 2800));
        C0036.m6177(sb, C0004.m1498(this));
        C0018.m3933(sb, C0036.m6188(m4132(), 3, 1, 3236));
        return C0047.m7763(sb);
    }
}