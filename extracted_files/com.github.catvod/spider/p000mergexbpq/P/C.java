package com.github.catvod.spider.p000mergexbpq.P;

import com.github.catvod.spider.merge-xbpq.T.d;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.p000mergexbpq.T.b;
import com.github.catvod.spider.p000mergexbpq.T.e;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public class C implements e {
    public C a;
    public int b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f141short = {3179, 2154, 2084};
    public static final x c = new x();

    public C() {
        this.b = -1;
    }

    public C(C c2, int i) {
        this.a = c2;
        this.b = i;
    }

    /* renamed from: ۟ۢۥ۠۟, reason: not valid java name and contains not printable characters */
    public static Object m792(Object obj, Object obj2) {
        if (C0023.m4566() < 0) {
            return ((d) obj).A((e) obj2);
        }
        return null;
    }

    /* renamed from: ۥۢۥۣ, reason: contains not printable characters */
    public static short[] m793() {
        if (C0052.m8320() > 0) {
            return f141short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public b b(int i) {
        throw null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public final String c() {
        if (C0023.m4543(this) == 0) {
            return C0007.m1840();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < C0023.m4543(this); i++) {
            C0018.m3933(sb, C0048.m7914(C0057.m8990(this, i)));
        }
        return C0047.m7763(sb);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public int d() {
        throw null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.T.b
    public <T> T e(d<? extends T> dVar) {
        return (T) m792(dVar, this);
    }

    public int f() {
        return -1;
    }

    public final boolean g() {
        return C0029.m5298(this) == -1;
    }

    public final String toString() {
        StringBuilder sbM7166 = C0042.m7166(C0049.m8007(m793(), 0, 1, 3120));
        for (C cM8410 = this; cM8410 != null; cM8410 = C0053.m8410(cM8410)) {
            if (!C0062.m9376(cM8410)) {
                C0036.m6177(sbM7166, C0029.m5298(cM8410));
            }
            C cM84102 = C0053.m8410(cM8410);
            if (cM84102 != null && !C0062.m9376(cM84102)) {
                C0018.m3933(sbM7166, C0056.m8911(m793(), 1, 1, 2122));
            }
        }
        C0018.m3933(sbM7166, C0023.m4536(m793(), 2, 1, 2169));
        return C0047.m7763(sbM7166);
    }
}