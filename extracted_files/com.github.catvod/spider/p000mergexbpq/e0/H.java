package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.Iterator;

/* loaded from: classes.dex */
public class H extends AbstractC0136t {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f311short = {1429, 1423, 1427, 1494, 1428, 1437, 1494, 1423, 1410, 1419, 1438};

    public H(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: ۣۨۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m2645() {
        if (C0055.m8740() > 0) {
            return f311short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final int b(l lVar) {
        int i = 0;
        if (C0058.m9066(lVar) == null) {
            return 0;
        }
        Iterator itM7807 = C0047.m7807(C0003.m1401(C0058.m9066(lVar)));
        while (C0012.m2962(itM7807)) {
            l lVar2 = (l) C0048.m7949(itM7807);
            if (C0017.m3718(C0046.m7729(lVar2), C0046.m7729(lVar))) {
                i++;
            }
            if (lVar2 == lVar) {
                break;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.AbstractC0136t
    protected final String c() {
        return C0009.m2037(m2645(), 0, 11, 1531);
    }
}