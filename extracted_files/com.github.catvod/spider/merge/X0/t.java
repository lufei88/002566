package com.github.catvod.spider.merge.X0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0016;

/* loaded from: classes.dex */
public final class t extends com.github.catvod.spider.merge.E0.p {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f679short = {3284, 3285, 3278, 3226, 3273, 3279, 3274, 3274, 3285, 3272, 3278, 3226, 3276, 3291, 3272, 3283, 3291, 3288, 3286, 3295, 3304, 3295, 3292, 3295, 3272, 3295, 3284, 3289, 3295, 3200};

    public t(int i, com.github.catvod.spider.merge.E0.p pVar) {
        super(i, pVar);
    }

    /* renamed from: ۟ۡۥۨۦ, reason: not valid java name and contains not printable characters */
    public static short[] m6066() {
        if (C0043.m7332() >= 0) {
            return f679short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.E0.p, com.github.catvod.spider.merge.I0.b
    public final Object a(com.github.catvod.spider.merge.Y0.c cVar) {
        com.github.catvod.spider.merge.Y0.b bVar;
        Object objM1951;
        if (!(cVar instanceof com.github.catvod.spider.merge.Y0.c)) {
            return C0016.m3595(cVar, this);
        }
        C0047.m7777(cVar);
        if (((h) C0013.m3164(this, h.class)) != null && !C0050.m8105((h) C0013.m3164(this, h.class))) {
            objM1951 = C0031.m5596((h) C0013.m3164(this, h.class), cVar);
        } else {
            if (((j) C0013.m3164(this, j.class)) == null || C0050.m8105((j) C0013.m3164(this, j.class))) {
                if (C0048.m7964(this, 39) != null) {
                    bVar = new com.github.catvod.spider.merge.Y0.b(C0004.m1511(C0048.m7964(this, 39)));
                    C0009.m2107(bVar);
                } else {
                    if (C0048.m7964(this, 6) == null) {
                        StringBuilder sb = new StringBuilder(C0021.m4340(m6066(), 0, 30, 3258));
                        C0018.m3933(sb, C0014.m3331(this));
                        throw new com.github.catvod.spider.merge.Q0.a(C0047.m7763(sb));
                    }
                    String strM1511 = C0004.m1511(C0048.m7964(this, 6));
                    bVar = new com.github.catvod.spider.merge.Y0.b(strM1511 == null ? null : C0025.m4782(strM1511));
                }
                return bVar;
            }
            objM1951 = C0008.m1951((j) C0013.m3164(this, j.class), cVar);
        }
        return (com.github.catvod.spider.merge.Y0.b) objM1951;
    }
}