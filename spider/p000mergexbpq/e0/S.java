package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Iterator;

/* loaded from: classes.dex */
final class S extends Z {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f318short = {1768, 1722, 1715, 1697, 1786, 1783, 1697, 1787};

    public S(N n) {
        this.a = n;
    }

    /* renamed from: ۟ۦۨۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2672() {
        if (C0053.m8389() >= 0) {
            return f318short;
        }
        return null;
    }

    /* renamed from: ۥۤۡۥ, reason: contains not printable characters */
    public static N m2673(Object obj) {
        if (C0043.m7332() > 0) {
            return ((Z) obj).a;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        Iterator itM7807 = C0047.m7807(C0006.m1701(lVar2));
        while (C0012.m2962(itM7807)) {
            l lVar3 = (l) C0048.m7949(itM7807);
            if (lVar3 != lVar2 && C0007.m1805(m2673(this), lVar2, lVar3)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0002.m1327(C0038.m6452(m2672(), 0, 8, 1746), new Object[]{m2673(this)});
    }
}