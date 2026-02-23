package com.github.catvod.spider.merge.Z0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f696short = {2055, 2077};

    public static String a(Exception exc) {
        Object obj = exc;
        ArrayList arrayList = new ArrayList();
        for (Object objM4471 = obj; objM4471 != null && !C0041.m6838(arrayList, objM4471); objM4471 = C0022.m4471(objM4471)) {
            C0004.m1532(arrayList, objM4471);
        }
        Object obj2 = C0007.m1817(arrayList) ? null : (Throwable) C0028.m5167(arrayList, C0009.m2139(arrayList) - 1);
        if (obj2 != null) {
            obj = obj2;
        }
        C0058.m9091();
        String strM3913 = C0018.m3913(C0047.m7777(obj));
        String strM6261 = C0036.m6261(obj);
        StringBuilder sbM3016 = C0012.m3016(strM3913, C0042.m7151(m6688(), 0, 2, 2109));
        C0012.m2949();
        if (strM6261 == null) {
            strM6261 = C0007.m1840();
        }
        C0018.m3933(sbM3016, strM6261);
        return C0047.m7763(sbM3016);
    }

    /* renamed from: ۧۡۤ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6688() {
        if (C0019.m4065() <= 0) {
            return f696short;
        }
        return null;
    }
}