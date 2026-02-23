package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
final class U extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f320short = {2293, 2211, 2288, 2299, 2288};

    public U(N n) {
        this.a = n;
    }

    /* renamed from: ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static N m2676(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۦۦۡ, reason: not valid java name and contains not printable characters */
    public static short[] m2677() {
        if (C0038.m6471() >= 0) {
            return f320short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM2955;
        return (lVar == lVar2 || (lVarM2955 = C0012.m2955(lVar2)) == null || !C0007.m1805(m2676(this), lVar, lVarM2955)) ? false : true;
    }

    public final String toString() {
        return C0002.m1327(C0061.m9361(m2677(), 0, 5, 2256), new Object[]{m2676(this)});
    }
}