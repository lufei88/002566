package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;

/* loaded from: classes.dex */
final class X extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f323short = {2806, 2720, 2803, 2733, 2803};

    public X(N n) {
        this.a = n;
    }

    /* renamed from: ۣۦۡۢ, reason: not valid java name and contains not printable characters */
    public static N m2682(Object obj) {
        if (C0028.m5152() <= 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۧ۟۠, reason: not valid java name and contains not printable characters */
    public static short[] m2683() {
        if (C0006.m1726() <= 0) {
            return f323short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM2955 = lVar2;
        if (lVar == lVarM2955) {
            return false;
        }
        do {
            lVarM2955 = C0012.m2955(lVarM2955);
            if (lVarM2955 == null) {
                return false;
            }
        } while (!C0007.m1805(m2682(this), lVar, lVarM2955));
        return true;
    }

    public final String toString() {
        return C0002.m1327(C0050.m8131(m2683(), 0, 5, 2771), new Object[]{m2682(this)});
    }
}