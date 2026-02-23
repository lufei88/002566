package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.c0.l;
import com.github.catvod.spider.p000mergexbpq.c0.t;
import com.github.catvod.spider.p000mergexbpq.c0.u;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class J extends N {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f313short = {2256, 2183, 2187, 2206, 2185, 2178, 2238, 2191, 2194, 2206};

    /* renamed from: ۠۠ۡۢ, reason: not valid java name and contains not printable characters */
    public static short[] m2647() {
        if (C0031.m5628() >= 0) {
            return f313short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        if (lVar2 instanceof t) {
            return true;
        }
        Iterator itM3109 = C0013.m3109(C0021.m4345(lVar2));
        while (C0012.m2962(itM3109)) {
            u uVar = (u) C0048.m7949(itM3109);
            t tVar = new t(C0051.m8211(C0001.m1214(lVar2), C0010.m2281()), C0033.m5831(lVar2), C0056.m8893(lVar2));
            C0005.m1620(uVar, tVar);
            C0004.m1547(tVar, uVar);
        }
        return false;
    }

    public final String toString() {
        return C0033.m5852(m2647(), 0, 10, 2282);
    }
}