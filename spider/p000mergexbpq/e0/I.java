package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class I extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f312short = {330, 287, 286, 284, 265, 349, 287, 278, 349, 260, 265, 256, 277};

    /* renamed from: ۥۥۦ, reason: contains not printable characters */
    public static short[] m2646() {
        if (C0039.m6529() < 0) {
            return f312short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        l lVarM9066 = C0058.m9066(lVar2);
        if (lVarM9066 == null || (lVarM9066 instanceof h)) {
            return false;
        }
        Iterator itM7807 = C0047.m7807(C0003.m1401(lVarM9066));
        int i = 0;
        while (C0012.m2962(itM7807)) {
            if (C0017.m3718(C0046.m7729((l) C0048.m7949(itM7807)), C0046.m7729(lVar2))) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return C0007.m1842(m2646(), 0, 13, 368);
    }
}