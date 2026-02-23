package com.github.catvod.spider.merge.V0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h extends n {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f637short = {3079, 1995, 1928, 1581};
    public final String a;
    public final Pattern b;

    public h(String str, Pattern pattern) {
        this.a = C0036.m6248(str);
        this.b = pattern;
    }

    /* renamed from: ۟ۡۥۨۨ, reason: not valid java name and contains not printable characters */
    public static short[] m5902() {
        if (C0012.m3024() > 0) {
            return f637short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.merge.V0.n
    public final boolean a(com.github.catvod.spider.merge.T0.m mVar, com.github.catvod.spider.merge.T0.m mVar2) {
        String strM9211 = C0059.m9211(this);
        return C0019.m4098(mVar2, strM9211) && C0003.m1405(C0034.m6026(C0035.m6104(this), C0010.m2339(mVar2, strM9211)));
    }

    public final String toString() {
        String strM2391 = C0010.m2391(C0035.m6104(this));
        StringBuilder sb = new StringBuilder(C0011.m2805(m5902(), 0, 1, 3164));
        C0018.m3933(sb, C0059.m9211(this));
        C0018.m3933(sb, C0005.m1645(m5902(), 1, 2, 1973));
        C0018.m3933(sb, strM2391);
        C0018.m3933(sb, C0055.m8814(m5902(), 3, 1, 1648));
        return C0047.m7763(sb);
    }
}