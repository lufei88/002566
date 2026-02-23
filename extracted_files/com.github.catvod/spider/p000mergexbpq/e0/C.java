package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;

/* loaded from: classes.dex */
public final class C extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f306short = {2876, 2932, 2921, 2921, 2930, 680, 766, 755, 737, 742, 703, 753, 762, 763, 766, 758};
    public final /* synthetic */ int a;

    public /* synthetic */ C(int i) {
        this.a = i;
    }

    /* renamed from: ۟ۢۧ۠۠, reason: not valid java name and contains not printable characters */
    public static short[] m2640() {
        if (C0049.m8038() <= 0) {
            return f306short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM3104 = lVar;
        switch (C0062.m9416(this)) {
            case 0:
                l lVarM9066 = C0058.m9066(lVar2);
                if (lVarM9066 == null || (lVarM9066 instanceof h) || C0063.m9584(lVar2) != C0009.m2095(C0003.m1401(lVarM9066)) - 1) {
                }
                break;
            default:
                if (lVarM3104 instanceof h) {
                    lVarM3104 = C0013.m3104(lVarM3104);
                }
                if (lVar2 == lVarM3104) {
                }
                break;
        }
        return true;
    }

    public final String toString() {
        switch (C0062.m9416(this)) {
            case 0:
                return C0021.m4340(m2640(), 5, 11, 658);
            default:
                return C0012.m2973(m2640(), 0, 5, 2822);
        }
    }
}