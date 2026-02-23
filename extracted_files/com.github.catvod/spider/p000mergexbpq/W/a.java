package com.github.catvod.spider.p000mergexbpq.W;

import com.github.catvod.spider.merge-xbpq.p0.b;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.r;
import com.github.catvod.spider.p000mergexbpq.e0.O;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements com.github.catvod.spider.p000mergexbpq.n0.a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f168short = {2511, 2517};

    public static String b(Throwable th) {
        Throwable th2 = th;
        ArrayList arrayList = new ArrayList();
        for (Throwable thM4471 = th2; thM4471 != null && !C0041.m6838(arrayList, thM4471); thM4471 = C0022.m4471(thM4471)) {
            C0004.m1532(arrayList, thM4471);
        }
        Throwable th3 = C0007.m1817(arrayList) ? null : (Throwable) C0028.m5167(arrayList, C0009.m2139(arrayList) - 1);
        if (th3 != null) {
            th2 = th3;
        }
        C0065.m9754();
        String strM3309 = C0014.m3309(C0047.m7777(th2));
        String strM6261 = C0036.m6261(th2);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM3309);
        C0018.m3933(sb, C0053.m8477(m1687(), 0, 2, 2549));
        C0034.m5988();
        if (strM6261 == null) {
            strM6261 = C0007.m1840();
        }
        C0018.m3933(sb, strM6261);
        return C0047.m7763(sb);
    }

    public static void c(O o, r rVar) {
        r rVarM6514 = rVar;
        int i = 0;
        while (rVarM6514 != null) {
            r rVarM8983 = C0057.m8983(rVarM6514);
            C0006.m1707(o, rVarM6514, i);
            if (rVarM8983 != null && !C0056.m8860(rVarM6514)) {
                rVarM6514 = C0039.m6514(rVarM8983, C0005.m1619(rVarM6514));
            }
            if (C0041.m6791(rVarM6514) > 0) {
                rVarM6514 = C0039.m6514(rVarM6514, 0);
                i++;
            } else {
                while (C0027.m5045(rVarM6514) == null && i > 0) {
                    C0039.m6499(o, rVarM6514, i);
                    rVarM6514 = C0057.m8983(rVarM6514);
                    i--;
                }
                C0039.m6499(o, rVarM6514, i);
                if (rVarM6514 == rVar) {
                    return;
                } else {
                    rVarM6514 = C0027.m5045(rVarM6514);
                }
            }
        }
    }

    /* renamed from: ۣ۟ۦۤۢ, reason: not valid java name and contains not printable characters */
    public static b m1686() {
        if (C0014.m3353() < 0) {
            return b.c;
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۢۧ, reason: not valid java name and contains not printable characters */
    public static short[] m1687() {
        if (C0039.m6529() < 0) {
            return f168short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.n0.a
    public com.github.catvod.spider.p000mergexbpq.n0.b a(String str) {
        return m1686();
    }
}