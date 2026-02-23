package com.github.catvod.spider.p000mergexbpq.e0;

import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.l;

/* renamed from: com.github.catvod.spider.merge-xbpq.e0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0133p extends AbstractC0127j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f334short = {1259, 1173, 1219, 1169, 1165, 1173, 1219, 1261};

    public C0133p(String str, String str2) {
        super(str, str2, true);
    }

    /* renamed from: ۟ۦۧۥ, reason: not valid java name and contains not printable characters */
    public static String m2719(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((AbstractC0127j) obj).b;
        }
        return null;
    }

    /* renamed from: ۡۡۤۥ, reason: not valid java name and contains not printable characters */
    public static String m2720(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((AbstractC0127j) obj).a;
        }
        return null;
    }

    /* renamed from: ۦۡۧ۟, reason: contains not printable characters */
    public static short[] m2721() {
        if (C0008.m1975() > 0) {
            return f334short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.p000mergexbpq.e0.N
    public final boolean a(l lVar, l lVar2) {
        return !C0000.m1057(m2719(this), C0058.m9094(lVar2, m2720(this)));
    }

    public final String toString() {
        return C0002.m1327(C0003.m1398(m2721(), 0, 8, 1200), new Object[]{m2720(this), m2719(this)});
    }
}