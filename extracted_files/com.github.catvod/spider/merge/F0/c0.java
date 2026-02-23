package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class c0 extends d0 {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f427short = {2888, 1100, 3294, 3228};
    public final int b;
    public final int c;
    public final boolean d;

    public c0() {
        this.b = -1;
        this.c = -1;
        this.d = false;
    }

    public c0(int i, int i2, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    /* renamed from: ۦۧۧۥ, reason: contains not printable characters */
    public static short[] m3864() {
        if (C0011.m2755() >= 0) {
            return f427short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final boolean c(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        C0047.m7777(sVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        c0 c0Var = (c0) obj;
        return C0055.m8719(this) == C0055.m8719(c0Var) && C0016.m3599(this) == C0016.m3599(c0Var) && C0002.m1267(this) == C0002.m1267(c0Var);
    }

    public final int hashCode() {
        return C0043.m7334(C0059.m9238(C0059.m9238(C0059.m9238(0, C0055.m8719(this)), C0016.m3599(this)), C0002.m1267(this) ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0037.m6307(m3864(), 0, 1, 2867));
        C0036.m6177(sb, C0055.m8719(this));
        C0018.m3933(sb, C0023.m4536(m3864(), 1, 1, 1142));
        C0036.m6177(sb, C0016.m3599(this));
        C0018.m3933(sb, C0053.m8477(m3864(), 2, 2, 3235));
        return C0047.m7763(sb);
    }
}