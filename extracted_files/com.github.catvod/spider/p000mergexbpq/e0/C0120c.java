package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.r;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0120c {
    public static C0124g a(N n, l lVar) {
        C0124g c0124g = new C0124g();
        C0007.m1871(new C0118a(lVar, c0124g, n), lVar);
        return c0124g;
    }

    public static l b(N n, l lVar) {
        C0119b c0119b = new C0119b(lVar, n);
        r rVarM6514 = lVar;
        int i = 0;
        while (rVarM6514 != null) {
            int iM2691 = m2691(c0119b, rVarM6514);
            if (iM2691 == 5) {
                break;
            }
            int i2 = 1;
            if (iM2691 != 1 || C0041.m6791(rVarM6514) <= 0) {
                while (C0027.m5045(rVarM6514) == null && i > 0) {
                    if (iM2691 == 1 || iM2691 == 2) {
                        iM2691 = 1;
                    }
                    r rVarM8983 = C0057.m8983(rVarM6514);
                    i--;
                    if (iM2691 == 4) {
                        C0039.m6564(rVarM6514);
                    }
                    rVarM6514 = rVarM8983;
                    iM2691 = 1;
                }
                if (iM2691 != 1 && iM2691 != 2) {
                    i2 = iM2691;
                }
                if (rVarM6514 == lVar) {
                    break;
                }
                r rVarM5045 = C0027.m5045(rVarM6514);
                if (i2 == 4) {
                    C0039.m6564(rVarM6514);
                }
                rVarM6514 = rVarM5045;
            } else {
                rVarM6514 = C0039.m6514(rVarM6514, 0);
                i++;
            }
        }
        return m2690(c0119b);
    }

    /* renamed from: ۡۨۢۡ, reason: not valid java name and contains not printable characters */
    public static l m2690(Object obj) {
        if (C0048.m7971() > 0) {
            return C0119b.m2687((C0119b) obj);
        }
        return null;
    }

    /* renamed from: ۧۥۡ۟, reason: not valid java name and contains not printable characters */
    public static int m2691(Object obj, Object obj2) {
        if (C0023.m4566() <= 0) {
            return ((C0119b) obj).b((r) obj2);
        }
        return 0;
    }
}