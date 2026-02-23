package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0358a implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f843short = {2187, 2409, 2405};
    public final Object a;
    public final Object b;

    public C0358a(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    /* renamed from: ۥۥۤ۠, reason: contains not printable characters */
    public static short[] m9046() {
        if (C0006.m1726() < 0) {
            return f843short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0358a)) {
            return false;
        }
        C0358a c0358a = (C0358a) obj;
        return C0000.m1134(C0063.m9543(this), C0063.m9543(c0358a)) && C0000.m1134(C0009.m2136(this), C0009.m2136(c0358a));
    }

    public final int hashCode() {
        Object objM9543 = C0063.m9543(this);
        int iM8087 = (objM9543 == null ? 0 : C0050.m8087(objM9543)) * 31;
        Object objM2136 = C0009.m2136(this);
        return iM8087 + (objM2136 != null ? C0050.m8087(objM2136) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0041.m6779(m9046(), 0, 1, 2211));
        C0016.m3605(sb, C0063.m9543(this));
        C0018.m3933(sb, C0043.m7290(m9046(), 1, 2, 2373));
        C0016.m3605(sb, C0009.m2136(this));
        C0062.m9399(sb, ')');
        return C0047.m7763(sb);
    }
}