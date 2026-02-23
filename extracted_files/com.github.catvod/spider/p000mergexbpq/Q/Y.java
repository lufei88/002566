package com.github.catvod.spider.p000mergexbpq.Q;

import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class Y {
    protected final Map<X, X> a = new HashMap();

    /* renamed from: ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static w m973() {
        if (C0011.m2755() > 0) {
            return X.b;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.merge-xbpq.Q.X, com.github.catvod.spider.merge-xbpq.Q.X>] */
    /* renamed from: ۣۣۧۡ, reason: not valid java name and contains not printable characters */
    public static HashMap m974(Object obj) {
        if (C0024.m4693() <= 0) {
            return ((Y) obj).a;
        }
        return null;
    }

    public final X a(X x) {
        w wVarM973 = m973();
        if (x == wVarM973) {
            return wVarM973;
        }
        X x2 = (X) C0065.m9715(m974(this), x);
        if (x2 != null) {
            return x2;
        }
        C0053.m8424(m974(this), x, x);
        return x;
    }
}