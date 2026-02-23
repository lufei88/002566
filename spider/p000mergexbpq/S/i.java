package com.github.catvod.spider.p000mergexbpq.S;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.x.C0015;

/* loaded from: classes.dex */
public final class i {
    public int a;
    public int b;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f160short = {601, 601};
    static i[] c = new i[1001];

    public i(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static i b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new i(i, i2);
        }
        i[] iVarArrM1475 = m1475();
        if (iVarArrM1475[i] == null) {
            iVarArrM1475[i] = new i(i, i);
        }
        return iVarArrM1475[i];
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static short[] m1474() {
        if (C0030.m5375() > 0) {
            return f160short;
        }
        return null;
    }

    /* renamed from: ۥۡۡ, reason: contains not printable characters */
    public static i[] m1475() {
        if (C0022.m4497() > 0) {
            return c;
        }
        return null;
    }

    public final boolean a(i iVar) {
        int iM1358 = C0003.m1358(this);
        int iM13582 = C0003.m1358(iVar);
        if (!(iM1358 < iM13582 && C0025.m4847(this) < iM13582)) {
            if (!(iM1358 > C0025.m4847(iVar))) {
                return false;
            }
        }
        return true;
    }

    public final i c(i iVar) {
        return C0032.m5752(C0051.m8186(C0003.m1358(this), C0003.m1358(iVar)), C0008.m1965(C0025.m4847(this), C0025.m4847(iVar)));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return C0003.m1358(this) == C0003.m1358(iVar) && C0025.m4847(this) == C0025.m4847(iVar);
    }

    public final int hashCode() {
        return ((713 + C0003.m1358(this)) * 31) + C0025.m4847(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0036.m6177(sb, C0003.m1358(this));
        C0018.m3933(sb, C0015.m3484(m1474(), 0, 2, 631));
        C0036.m6177(sb, C0025.m4847(this));
        return C0047.m7763(sb);
    }
}