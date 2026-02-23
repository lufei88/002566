package com.github.catvod.spider.merge.w0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;

/* loaded from: classes.dex */
public final class i implements c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f869short = {1812, 1853, 1810, 1823, 1805, 1805, 995, 1003, 904, 940, 951, 943, 938, 941, 995, 945, 934, 933, 943, 934, 928, 951, 938, 940, 941, 995, 938, 944, 995, 941, 940, 951, 995, 930, 949, 930, 938, 943, 930, 929, 943, 934, 1002};
    public final Class a;

    public i(Class cls) {
        C0057.m8982(cls, C0034.m6001(m9482(), 0, 6, 1918));
        this.a = cls;
    }

    /* renamed from: ۟ۢۥۤۦ, reason: not valid java name and contains not printable characters */
    public static short[] m9482() {
        if (C0062.m9429() > 0) {
            return f869short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.w0.c
    public final Class a() {
        return C0065.m9780(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (C0000.m1134(C0065.m9780(this), C0065.m9780((i) obj))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0050.m8087(C0065.m9780(this));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0036.m6180(C0065.m9780(this)));
        C0018.m3933(sb, C0058.m9106(m9482(), 6, 37, 963));
        return C0047.m7763(sb);
    }
}