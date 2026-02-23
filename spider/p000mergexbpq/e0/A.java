package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
public final class A extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f304short = {1554, 1607, 1606, 1604, 1617, 1541, 1611, 1600, 1601, 1604, 1612, 338, 270, 257, 282, 283, 284, 325, 267, 256, 257, 260, 268};
    public final /* synthetic */ int a;

    public /* synthetic */ A(int i) {
        this.a = i;
    }

    /* renamed from: ۣ۟ۡۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m2638() {
        if (C0057.m9017() > 0) {
            return f304short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        switch (C0027.m5009(this)) {
            case 0:
                l lVarM9066 = C0058.m9066(lVar2);
                if (lVarM9066 == null || (lVarM9066 instanceof h) || C0063.m9584(lVar2) != 0) {
                }
                break;
            default:
                l lVarM90662 = C0058.m9066(lVar2);
                if (lVarM90662 == null || (lVarM90662 instanceof h) || !C0019.m4116(C0043.m7296(lVar2))) {
                }
                break;
        }
        return false;
    }

    public final String toString() {
        switch (C0027.m5009(this)) {
            case 0:
                return C0034.m6001(m2638(), 11, 12, 360);
            default:
                return C0022.m4403(m2638(), 0, 11, 1576);
        }
    }
}