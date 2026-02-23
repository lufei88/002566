package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* loaded from: classes.dex */
public class G extends AbstractC0136t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f310short = {681, 691, 687, 746, 683, 678, 692, 691, 746, 680, 673, 746, 691, 702, 695, 674};

    public G(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: ۨۡۨۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2644() {
        if (C0044.m7508() < 0) {
            return f310short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final int b(l lVar) {
        int i = 0;
        if (C0058.m9066(lVar) == null) {
            return 0;
        }
        C0124g c0124gM1401 = C0003.m1401(C0058.m9066(lVar));
        for (int iM9584 = C0063.m9584(lVar); iM9584 < C0009.m2095(c0124gM1401); iM9584++) {
            if (C0017.m3718(C0046.m7729((l) C0028.m5161(c0124gM1401, iM9584)), C0046.m7729(lVar))) {
                i++;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final String c() {
        return C0061.m9361(m2644(), 0, 16, 711);
    }
}