package com.github.catvod.spider.merge.p0;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.Serializable;

/* renamed from: com.github.catvod.spider.merge.p0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0359b implements Serializable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f844short = {2381, 2384, 2379, 2381, 2392, 2396, 2369, 2375, 2374, 2375, 2400, 2408, 2413, 2420, 2419, 2404, 2345};
    public final Throwable a;

    public C0359b(Throwable th) {
        C0057.m8982(th, C0063.m9585(m9047(), 0, 9, 2344));
        this.a = th;
    }

    /* renamed from: ۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static short[] m9047() {
        if (C0000.m1116() < 0) {
            return f844short;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0359b) {
            if (C0000.m1134(C0054.m8550(this), C0054.m8550((C0359b) obj))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0050.m8087(C0054.m8550(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C0031.m5565(m9047(), 9, 8, 2305));
        C0016.m3605(sb, C0054.m8550(this));
        C0062.m9399(sb, ')');
        return C0047.m7763(sb);
    }
}