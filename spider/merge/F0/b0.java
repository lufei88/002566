package com.github.catvod.spider.merge.F0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;

/* loaded from: classes.dex */
public final class b0 extends d0 implements Comparable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f426short = {1851, 2982, 2981, 3048, 3050, 3069, 3067, 3045, 2983};
    public final int b;

    public b0(int i) {
        this.b = i;
    }

    /* renamed from: ۣۣ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3863() {
        if (C0061.m9359() < 0) {
            return f426short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final boolean c(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        return C0023.m4611(sVar, C0000.m1090(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return C0000.m1090(this) - C0000.m1090((b0) obj);
    }

    @Override // com.github.catvod.spider.merge.F0.d0
    public final d0 d(com.github.catvod.spider.merge.E0.s sVar, com.github.catvod.spider.merge.E0.p pVar) {
        if (C0023.m4611(sVar, C0000.m1090(this))) {
            return C0058.m9087();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            return this == obj || C0000.m1090(this) == C0000.m1090((b0) obj);
        }
        return false;
    }

    public final int hashCode() {
        return 31 + C0000.m1090(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0032.m5708(m3863(), 0, 1, 1856));
        C0036.m6177(sb, C0000.m1090(this));
        C0018.m3933(sb, C0026.m4951(m3863(), 1, 8, 2968));
        return C0047.m7763(sb);
    }
}