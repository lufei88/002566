package com.github.catvod.spider.merge.H0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public final class e {
    public int a;
    public int b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f451short = {2923, 2923};
    public static final e[] c = new e[1001];

    public e(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static e a(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new e(i, i2);
        }
        e[] eVarArrM5891 = C0033.m5891();
        if (eVarArrM5891[i] == null) {
            eVarArrM5891[i] = new e(i, i);
        }
        return eVarArrM5891[i];
    }

    /* renamed from: ۣۤۢۤ, reason: not valid java name and contains not printable characters */
    public static short[] m4138() {
        if (C0007.m1886() >= 0) {
            return f451short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C0031.m5636(this) == C0031.m5636(eVar) && C0030.m5364(this) == C0030.m5364(eVar);
    }

    public final int hashCode() {
        return ((713 + C0031.m5636(this)) * 31) + C0030.m5364(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0031.m5636(this));
        C0018.m3933(sb, C0021.m4340(m4138(), 0, 2, 2885));
        C0036.m6177(sb, C0030.m5364(this));
        return C0047.m7763(sb);
    }
}