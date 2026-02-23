package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;

/* loaded from: classes.dex */
public final class r extends t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f644short = {2142, 2060, 2053, 2071, 2124, 2113, 2071, 2125};
    public final com.github.catvod.spider.merge.U.p b;

    public r(n nVar) {
        this.a = nVar;
        this.b = new com.github.catvod.spider.merge.U.p(nVar);
    }

    /* renamed from: ۟ۦۨۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m5909() {
        if (C0030.m5375() > 0) {
            return f644short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        for (int i = 0; i < C0064.m9636(C0058.m9057(mVar2)); i++) {
            com.github.catvod.spider.merge.T0.r rVar = (com.github.catvod.spider.merge.T0.r) C0048.m7915(C0002.m1286(mVar2), i);
            if ((rVar instanceof com.github.catvod.spider.merge.T0.m) && C0003.m1447(C0046.m7688(this), mVar2, (com.github.catvod.spider.merge.T0.m) rVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return C0002.m1327(C0049.m8007(m5909(), 0, 8, 2148), new Object[]{C0036.m6231(this)});
    }
}