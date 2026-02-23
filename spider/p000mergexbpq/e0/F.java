package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
public final class F extends AbstractC0136t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f309short = {2611, 2601, 2613, 2672, 2609, 2620, 2606, 2601, 2672, 2622, 2613, 2612, 2609, 2617};

    public F(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: ۟ۥۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2643() {
        if (C0005.m1599() < 0) {
            return f309short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final int b(l lVar) {
        if (C0058.m9066(lVar) == null) {
            return 0;
        }
        return C0009.m2095(C0003.m1401(C0058.m9066(lVar))) - C0063.m9584(lVar);
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final String c() {
        return C0039.m6551(m2643(), 0, 14, 2653);
    }
}