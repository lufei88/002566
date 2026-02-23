package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
final class T extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f319short = {1864, 1822, 1869, 1875, 1869};

    public T(N n) {
        this.a = n;
    }

    /* renamed from: ۟ۥ۠ۦ, reason: not valid java name and contains not printable characters */
    public static N m2674(Object obj) {
        if (C0032.m5686() < 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    /* renamed from: ۡۡ۠ۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2675() {
        if (C0061.m9359() <= 0) {
            return f319short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM9066;
        return (lVar == lVar2 || (lVarM9066 = C0058.m9066(lVar2)) == null || !C0007.m1805(m2674(this), lVar, lVarM9066)) ? false : true;
    }

    public final String toString() {
        return C0002.m1327(C0009.m2037(m2675(), 0, 5, 1901), new Object[]{m2674(this)});
    }
}